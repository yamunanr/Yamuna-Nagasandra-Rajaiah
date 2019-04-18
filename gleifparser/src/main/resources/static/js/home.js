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

$('.btn').on('click', function load() {
    var $this = $(this);
  $this.button('loading');
    setTimeout(function() {
       $this.button('reset');
   }, 8000);
})

<script>
$( document ).ready(function() {
	 $("#example1").dialog({ autoOpen: false, height: 400});
$( "#opener" ).on( "click", function() {
     $( "#example1" ).dialog( "open" );
     
   });
} );

</script>
<head>
<style>

.dropbtn {
	  background-color: #4CAF50;
	  color: white;
	  padding: 14px;
	  font-size: 14px;
	  border: none;
	  cursor: pointer;
	}

	.dropbtn:hover, .dropbtn:focus {
	  background-color: #3e8e41;
	}

	.dropdown {
	  position: relative;
	  display: inline-block;
	}

	.dropdown-content {
	  display: none;
	  position: absolute;
	  background-color: #f9f9f9;
	  min-width: 160px;
	  overflow: auto;
	  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	}

	.dropdown-content a {
	  color: black;
	  padding: 12px 16px;
	  text-decoration: none;
	  display: block;
	}

	.dropdown-content a:hover {background-color: #f1f1f1}

	.show {display:block;}
	</style>
	</head>
	<script>
	// Get the button, and when the user clicks on it, execute myFunction
	document.getElementById("myBtn").onclick = function() {myFunction()};

	/* myFunction toggles between adding and removing the show class, which is used to hide and show the dropdown content */
	function myFunction() {
	  document.getElementById("myDropdown").classList.toggle("show");
	}
	</script>
});