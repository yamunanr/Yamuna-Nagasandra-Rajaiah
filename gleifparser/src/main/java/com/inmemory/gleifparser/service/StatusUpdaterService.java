/**
 * 
 */
package com.inmemory.gleifparser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.inmemory.gleifparser.WebSocketConfig;
import com.inmemory.gleifparser.beans.StatusUpdateResponseBean;

/**
 * @author Bhuvanesh
 *
 */
public abstract class StatusUpdaterService {

	@Autowired
	private SimpMessagingTemplate template;

	protected void sendXmlUploadStatusToSubscribers(String subscriberId,
			StatusUpdateResponseBean statusUpdateResponseBean) {
		this.template.convertAndSend(WebSocketConfig.WEB_SOCKET_DELIVERY_NOTIFICATION_MESSAGE_TOPIC + subscriberId,
				statusUpdateResponseBean);
	}

	protected int calculatePercentage(long curCount, long totalCount) {
		int percent = 0;
		if (totalCount > 0) {
			percent = (int) ((curCount / totalCount) * 100);
		}
		return percent;
	}
}
