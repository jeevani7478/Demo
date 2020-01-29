$(document).ready(function() {
	saveClick();
	showclick();
});

function saveClick() {
	$('#save').click(function() {
		saveOrUpdate();
		/*
		 * factory().save(getSaveDatas(), $ajax, function(response) {
		 * response.then(function(result) { //alert(saved) }); });
		 */
	});
}

function saveOrUpdate() {
	// alert();
	$.ajax({
		type : 'POST',
		url : '/controller/save_Details',
		contentType : "application/json",
		data : JSON.stringify(getSaveDatas()),
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(result) {
			alert("Saved Successfully")
		},
		error : function(e) {
			var json = "<h4>Ajax Response</h4><pre>" + e.responseText
					+ "</pre>";
			alert(json)
		}
	});
}

function getSaveDatas() {

	var selectedInput = {};
alert()
	selectedInput.name = $("#name").val();
	selectedInput.password = $("#password").val();
	selectedInput.min_mark = $("#min").val();
	selectedInput.max_mark = $("#max").val();
	//selectedInput.avg = $("#avg").val();
	 alert(JSON.stringify(selectedInput))
	return selectedInput;
}

function showclick() {
	$('#show').click(function() {
		$("#tbDetails").find("tr:gt(0)").remove();
		showtable();
	});

}
function showtable() {
	// alert();
	$.ajax({
		type : 'GET',
		url : '/controller/Show_Details',
		contentType : "application/json",
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(result) {
			var data = '';
			// alert(JSON.stringify(result))
			$.each(result, function(index, obj) {
				// alert(JSON.stringify(obj.password))
				data += '<tr>';
				data += '<td>' + obj.name + '</td>';
				data += '<td>' + obj.password + '</td>';
				data += '<td>' + obj.min + '</td>';
				data += '<td>' + obj.max + '</td>';
				data += '<td>' + obj.avg + '</td>';

				data += '</tr>';
			}

			);
			$("#tbDetails").append(data);

		},
		error : function(e) {
			var json = "<h4>Ajax Response</h4><pre>" + e.responseText
					+ "</pre>";
			alert(json);
		}
	});
	function showclick() {
		$('#show').click(function() {
			$("#tbDetails").find("tr:gt(0)").remove();
			showtable();
		});

	}

}