$(document).ready(function() {
var stompClient = null;

$('#uploadFileButton').click(function() {
	if (document.getElementById("fileName").files.length != 0) {
		$('#progressBarDiv').hide();
		$('#uploadFileButton').prop('disabled', true);
		var form = document.forms[0];
		var formData = new FormData(form);
		$.ajax({
			url : 'xmlFileUpload',
			type : 'POST',
			data : formData,
			cache : false,
			contentType : false,
			processData : false
		}).done(function(response) {
			var socket = new SockJS('/xml-upload-notification-channel');
		    stompClient = Stomp.over(socket);
		    stompClient.connect({}, function (frame) {
		        console.log('Connected: ' + frame);
		        stompClient.subscribe('/topic/xml-upload-progress'+response.webSocketSubscriptionId, function (response) {
		            updateProgressBar(JSON.parse(response.body));
		            $('#progressBarDiv').show();
		        });
		    });
		});

	}
});

function updateProgressBar(response){
 	$('#progressStatusText').html(response.status);
	$('#progressBarMarker').css('width', response.percentageProcessed);
	$('#progressBarMarker').html(response.percentageProcessed);
	$('#processedRecords').html('Processed Records: '+response.numberOfProcessedRecords);
	$('#TotalRecords').html('Total: '+response.totalNumberOfRecords);
	if(response.error){
		$('#progressStatusText').html(response.status+" ( "+response.message+" )");
		disconnectSocket();
		$('#progressStatusText').removeClass('text-primary');
		$('#progressStatusText').addClass('text-danger');
		$('#uploadFileButton').prop('disabled', false);
	}
}

function disconnectSocket() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }

}
});