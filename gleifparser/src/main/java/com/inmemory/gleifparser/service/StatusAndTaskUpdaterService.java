/**
 * 
 */
package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.inmemory.gleifparser.WebSocketConfig;
import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.beans.StatusUpdateResponseBean;
import com.inmemory.gleifparser.constants.Constants;
import com.inmemory.gleifparser.entity.GleifHeader;

/**
 * @author Bhuvanesh
 *
 */
public abstract class StatusAndTaskUpdaterService {

	@Autowired
	private SimpMessagingTemplate template;

	protected void sendXmlUploadStatusToSubscribers(String subscriberId,
			StatusUpdateResponseBean statusUpdateResponseBean) {
		this.template.convertAndSend(WebSocketConfig.WEB_SOCKET_DELIVERY_NOTIFICATION_MESSAGE_TOPIC + subscriberId,
				statusUpdateResponseBean);
	}

	protected String calculatePercentage(long curCount, long totalCount) {
		String percent = "0%";
		DecimalFormat df = new DecimalFormat("###.##");
		if (totalCount > 0) {
			double percentage = (((double)curCount / (double)totalCount) * 100.00);
			percent = df.format(percentage) + "%";
		}
		return percent;
	}

	/**
	 * @param statusUpdateResponseBean
	 * @param runningTasks
	 * @param completedTasks
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	protected boolean checkAndUpdateRunningTasks(StatusUpdateResponseBean statusUpdateResponseBean,
			List<Future<BaseBean>> runningTasks, List<Future<BaseBean>> completedTasks)
			throws InterruptedException, ExecutionException {
		boolean isError = false;
		// check status of currently running tasks if some tasks errored out we need to
		// quit processing
		for (Future<BaseBean> taskStatusResponse : runningTasks) {
			if (taskStatusResponse.isDone()) {
				if (taskStatusResponse.get().isError()) {
					statusUpdateResponseBean.setError(true);
					statusUpdateResponseBean.setMessage(taskStatusResponse.get().getMessage());
					statusUpdateResponseBean.setStatus(Constants.STATUS_FAILED);
					isError = true;
				} else {
					completedTasks.add(taskStatusResponse);
					statusUpdateResponseBean.setNumberOfProcessedRecords(
							statusUpdateResponseBean.getNumberOfProcessedRecords() + SAVE_RECORDS_BATCH_SIZE);
					statusUpdateResponseBean.setPercentageProcessed(
							calculatePercentage(statusUpdateResponseBean.getNumberOfProcessedRecords(),
									statusUpdateResponseBean.getTotalNumberOfRecords()));
				}
			}
		}
		// remove completed tasks from running tasks list
		runningTasks.removeAll(completedTasks);
		completedTasks.clear();
		if (isError) {
			for (Future<BaseBean> taskStatusResponse : runningTasks) {
				if (!taskStatusResponse.isDone()) {
					taskStatusResponse.cancel(true);
				}
				completedTasks.add(taskStatusResponse);
			}
			runningTasks.removeAll(completedTasks);
		}
		return isError;
	}

	
	/**
	 * @param newHeader
	 * @return
	 */
	protected StatusUpdateResponseBean initializeStatusResponseBean(GleifHeader newHeader) {
		StatusUpdateResponseBean statusUpdateResponseBean = new StatusUpdateResponseBean();
		statusUpdateResponseBean.setTotalNumberOfRecords(newHeader.getRecordCount());
		statusUpdateResponseBean.setNumberOfProcessedRecords(0);
		statusUpdateResponseBean
				.setPercentageProcessed(calculatePercentage(statusUpdateResponseBean.getNumberOfProcessedRecords(),
						statusUpdateResponseBean.getTotalNumberOfRecords()));
		statusUpdateResponseBean.setStatus(Constants.STATUS_IN_PROGRESS);
		return statusUpdateResponseBean;
	}
	
	/**
	 * @param subscriberId
	 * @param statusUpdateResponseBean
	 */
	protected void sendFailedStatus(String subscriberId, String message,
			StatusUpdateResponseBean statusUpdateResponseBean) {
		statusUpdateResponseBean.setError(true);
		statusUpdateResponseBean.setStatus(Constants.STATUS_FAILED);
		statusUpdateResponseBean.setMessage(message);
		sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
	}
}
