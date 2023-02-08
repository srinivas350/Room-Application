$(document).ready(function() {
	$("#roomMateId").focus();
	$.ajax({
			  type: "GET",
			  url: "getRoomMatesInfo",
			  cache: false,
			  success: function(data){
			  tableData(data);
			  }
			});
	$("#Submit").click(function() {
		var room = {
			"roomMateId" : null,
			"roomMateName" : null,
			"purchasedDate" : null,
			"expansivThings" : null,
			"expansiveAmount" : null
		};
		var roomMateId = $("#roomMateId").val();
		if (roomMateId == "") {
			// $(".roomMate1").append("<span style='color:red;'>Please Enter
			// Some Name</span>");
			// $("#roomMate1").focus();
		} else {
			room.roomMateId = roomMateId;
		}

		var roomMateName = $("#roomMateName").val();
		if (roomMateName == "") {
			// $(".roomMate2").append("<span style='color:red;'>Please Enter
			// Some Name</span>");
			// $("#roomMate1").focus();
		} else {
			room.roomMateName = roomMateName;
		}

		var expansivThings = $("#expansivThings").val();
		if (expansivThings == "") {
			// $(".roomMate3").append("<span style='color:red;'>Please Enter
			// Some Name</span>");
			// $("#roomMate1").focus();
		} else {
			room.expansivThings = expansivThings;
		}

		var expansiveAmount = $("#expansiveAmount").val();
		if (expansiveAmount == "") {
			// $(".roomMate4").append("<span style='color:red;'>Please Enter
			// Some Name</span>");
			// $("#roomMate4").focus();
		} else {
			room.expansiveAmount = expansiveAmount;
		}
		var purchasedDate = $("#purchasedDate").val();
		if (purchasedDate == "") {
			// $(".roomMate4").append("<span style='color:red;'>Please Enter
			// Some Name</span>");
			// $("#roomMate4").focus();
		} else {
			room.purchasedDate = purchasedDate;
		}
		$.ajax({
			type : "POST",
			url : "roomPurchases",
			cache : false,
			data : room,
			success : function(data) {
				tableData(data);
			}
		});
	});
	function tableData(data)
	{
		$(".table_data").empty();
		var info="";
		$.each( data, function( index, value ){
				info += "<tr><td class='roomMateId' data-field="+value.roomMateId+">"+value.roomMateId+"</td>"
						+"<td class='roomMateName' data-field="+value.roomMateName+">"+value.roomMateName+"</td>"
						+"<td class='expansivThings' data-field="+value.expansivThings+">"+value.expansivThings+"</td>";
				var date1=new Date(value.purchasedDate);
				info += "<td class='purchasedDate' data-field="+value.purchasedDate+">"+date1.toLocaleDateString()+"</td>"
			 			+"<td class='expansiveAmount' data-field="+value.expansiveAmount+">"+value.expansiveAmount+"</td>"
						+"<td><button id='edit' class='edit'>Edit</button>&nbsp;&nbsp;<button id='save' class='submit'>Save</button></td></tr>";
		});
		$(".table_data").append(info);
		$('#myTable').DataTable();
	}
	$('#myTable').on('click', 'tbody td .edit', function () { 	
		var value=$(this).closest('tr').children('td.roomMateId').text();
		$("#roomMateId").val($(this).closest('tr').children('td.roomMateId').text());
		$("#roomMateName").val($(this).closest('tr').children('td.roomMateName').text());
		$("#expansivThings").val($(this).closest('tr').children('td.expansivThings').text());
		var date1=new Date($(this).closest('tr').children('td.purchasedDate').text());
		var date2=date1.toLocaleDateString();
		$("#purchasedDate").html(date2);
		$("#expansiveAmount").val($(this).closest('tr').children('td.expansiveAmount').text());
	});

})