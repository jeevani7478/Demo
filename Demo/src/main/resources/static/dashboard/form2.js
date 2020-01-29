$(document).ready(function() {
	//alert();
	showclick();
});

function showclick() {
//	alert();
	$('#show').click(function() {
		$("#tbDetails").find("tr:gt(0)").remove();
		showtable();
	});

}
function showtable() {
   // alert("avg is");
	$.ajax({
		type : 'GET',
		url : '/controller/Show_Details',
		contentType : "application/json",
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(result) {
			var data = '';
		//	alert(JSON.stringify(result))
			$.each(result, function(index, obj) {
				// alert(JSON.stringify(obj.password))
				data += '<tr>';
				data += '<td>' + obj.name + '</td>';
				data += '<td>' + obj.password + '</td>';
				data += '<td>' + obj.min_mark + '</td>';
				data += '<td>' + obj.max_mark + '</td>';
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
