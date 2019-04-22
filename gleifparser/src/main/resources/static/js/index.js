$(document).ready(function() {
var stompClient = null;
var legalnames = new Array();
var leiLegalNameMapping = new Object();


$('#progressBarDiv').hide();
$('#spinner').hide();
$("#searchResults").hide();
$("#leiData").hide();
$('#uploadFileButton').click(function() {
	if (document.getElementById("fileName").files.length != 0) {
		resetProgressBarDiv();
		$('#progressBarDiv').show();
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
		           
		        });
		    });
		});

	}
});

$( "#legalNameInputText" ).autocomplete({
    source: function( request, response ) {
      $.ajax( {
        url: "suggestLegalNames",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        data: request.term,
		  type: "POST",
		   cached:false,
        success: function( data ) {
			  if(!data.error){
					response( data.suggestions );
			  }
        }
      } );
    },
    minLength: 3,
  } );

$( "#countryInputText" ).autocomplete({
    source: function( request, response ) {
      $.ajax( {
        url: "suggestCountryNames",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        data: request.term,
		  type: "POST",
		   cached:false,
        success: function( data ) {
			  if(!data.error){
					response( data.suggestions );
			  }
        }
      } );
    },
    minLength: 1,
  } );


function updateProgressBar(response){
 	$('#progressStatusText').html(response.status);
	$('#progressBarMarker').css('width', response.percentageProcessed);
	$('#progressBarMarker').html(response.percentageProcessed);
	$('#processedRecords').html(response.numberOfProcessedRecords);
	$('#TotalRecords').html(response.totalNumberOfRecords);
	$('#progressStatusText').html(response.status);
	$('#progressStatusMessage').html(response.message);
	if(response.error){
		disconnectSocket();
		$('#progressStatusText').removeClass('text-primary');
		$('#progressStatusText').addClass('text-danger');
		$('#uploadFileButton').prop('disabled', false);
	}else if(response.status=='COMPLETE'){
		$('#uploadFileButton').prop('disabled', false);
	}
}

function disconnectSocket() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
}

function resetProgressBarDiv(){
	$('#progressStatusText').html('Uploading');
	$('#progressStatusMessage').html('Upload in Progress');
	$('#progressBarMarker').css('width', '0%');
	$('#progressBarMarker').html('0%');
	$('#processedRecords').html('NA');
	$('#TotalRecords').html('NA');
	$('#progressBarDiv').show();
}


$('#leiData').on('click', '#backtoResultsButton', function(){
	$("#leiData").html("");
	$("#leiData").hide();
	 $("#searchResults").show();
	 $("#searchCriteria").show();
	
});

$('#searchButton').click(function() {
	$("#spinner").show();
	$('#searchButton').prop('disabled',true);
	 $("#searchResults").hide();
	 $("#leiData").hide();
	if ($("#legalNameInputText").val()!=null|| $("#countryInputText").val()!=null) {
		var data={
				"legalName":$("#legalNameInputText").val(),
				"countryName":$("#countryInputText").val(),
				"page":1,
				"size":5
			};
		 $.ajax( {
	         url: "search",
	         type: "POST",
	         dataType: "html",
	         contentType: "application/json; ",
	         data :JSON.stringify(data) ,
	 		   cached:false,
	         success: function( response ) {
	        	 $("#spinner").hide();
	        	 $("#searchResults").html(response);
	        	 $("#searchResults").show();
	        	 
	         }
	       } );
		
		
	

	}else{
		 $("#spinner").hide();
	}
	$('#searchButton').prop('disabled',false);
});

$('#searchResults').on('click', 'a[href="#searchPageLink"]', function(){
	    $("#spinner").show();
		 $("#searchResults").hide();
			if ($("#legalNameInputText").val()!=null|| $("#countryInputText").val()!=null) {
				var data={
						"legalName":$("#legalNameInputText").val(),
						"countryName":$("#countryInputText").val(),
						"page":$(this).html(),
						"size":5
					};
				 $.ajax( {
			         url: "search",
			         type: "POST",
			         dataType: "html",
			         contentType: "application/json; ",
			         data :JSON.stringify(data) ,
			 		   cached:false,
			         success: function( response ) {
			        	 $("#spinner").hide();
			        	 $("#searchResults").html(response);
			        	 $("#searchResults").show();
			         }
			       } );
				
				
			

			}else{
				 $("#spinner").hide();
			}
	});

$('#searchResults').on('click', 'a[href="#leiLink"]', function(){
	$("#spinner").show();
	 $("#searchResults").hide();
	 $("#searchCriteria").hide();
	 $("#leiData").hide();
	 $.ajax( {
         url: "loadLei",
         type: "POST",
         dataType: "html",
         contentType: "application/json; ",
         data :$(this).html() ,
 		   cached:false,
         success: function( response ) {
        	 $("#spinner").hide();
        	 $("#leiData").html(response);
        	 $("#leiData").show();
         }
       } );
});

$('#leiData').on('click', 'a[href="#leiLink"]', function(){
	$("#spinner").show();
	 $("#searchResults").hide();
	 $("#searchCriteria").hide();
	 $("#leiData").hide();
	 $.ajax( {
         url: "loadLei",
         type: "POST",
         dataType: "html",
         contentType: "application/json; ",
         data :$(this).html() ,
 		   cached:false,
         success: function( response ) {
        	 $("#spinner").hide();
        	 $("#leiData").html(response);
        	 $("#leiData").show();
         }
       } );
});


$('#leiData').on('click', 'button', function(){
	var buttonName=$(this).prop('id');
	if(buttonName=="headingTwoBtn"){
		if($('#collapseTwoBody').is(':visible')){
			$('#collapseTwoBody').hide();
		}else{
			$('#collapseTwoBody').show();
		}
		
		$('#collapseThreeBody').hide();
		$('#collapseOneBody').hide();
		$('#collapseFourBody').hide();
		
	}
	else if(buttonName=="headingThreeBtn"){
		if($('#collapseThreeBody').is(':visible')){
			$('#collapseThreeBody').hide();
		}else{
			$('#collapseThreeBody').show();
		}
		$('#collapseOneBody').hide();
		$('#collapseTwoBody').hide();
		$('#collapseFourBody').hide();
	}
	else if(buttonName=="headingOneBtn"){
		if($('#collapseOneBody').is(':visible')){
			$('#collapseOneBody').hide();
		}else{
			$('#collapseOneBody').show();
		}
		$('#collapseThreeBody').hide();
		$('#collapseTwoBody').hide();
		$('#collapseFourBody').hide();
	}else if(buttonName=="headingFourBtn"){
		if($('#collapseFourBody').is(':visible')){
			$('#collapseFourBody').hide();
		}else{
			$('#collapseFourBody').show();
		}
		$('#collapseTwoBody').hide();
		$('#collapseThreeBody').hide();
		$('#collapseOneBody').hide();
		
	}
});

});



