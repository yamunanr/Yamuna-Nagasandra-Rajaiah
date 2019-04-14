$(function() {
	$('#uploadFileButton').click(function() {
		if (document.getElementById("fileName").files.length != 0) {
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
			}).done(function(html) {
				$("#test1").append(html);
			});

		}
	} )
});