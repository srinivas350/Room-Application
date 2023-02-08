<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Room Info</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="resources/myJsFiles/roomForm.js" type="text/javascript"></script>
<script
	src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.js"
	type="text/javascript"></script>

<script src="https://code.jquery.com/jquery-3.5.1.js"
	type="text/javascript"></script>
<script
	src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"
	type="text/javascript"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="resources/css/roomForm.css" rel="stylesheet" type="text/css" />
<link
	href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css"
	type="text/css" />
</head>
<body>
		<div class="block">
			<div class="row main"></div>
			<div class="row stl">
				<div class="col-md-4 form-group">
					<div class="col-md-5">
						<label class="control-label">RoomMateId :</label>
					</div>
					<div class="col-md-7">
						<input type="text" id="roomMateId">
					</div>
				</div>
				<div class="col-md-4 form-group">
					<div class="col-md-5">
						<label class="control-label">RoomMateName:</label>
					</div>
					<div class="col-md-7">
						<input type="text" id="roomMateName">
					</div>
				</div>
				<div class="col-md-4 form-group">
					<div class="col-md-4">
						<label class="control-label">Date :</label>
					</div>
					<div class="col-md-8">
						<input type="date" id="purchasedDate" placeholder="MM-DD-YYYY">
					</div>
				</div>
			</div>
			<div class="row stl">
				<div class="col-md-4 form-group">
					<div class="col-md-5">
						<label class="control-label">ExpansiveThings:</label>
					</div>
					<textarea rows="3" cols="30" id="expansivThings"></textarea>
				</div>
				<div class="col-md-4 form-group">
					<div class="col-md-5">
						<label class="control-label">ExpansiveAmount:</label>
					</div>
					<div class="col-md-7">
						<input type="text" id="expansiveAmount">
					</div>
				</div>
				<div class="col-md-1 form-group"></div>
				<div class="col-md-3 form-group">
					<button id="Submit" class="submit">Submit</button>
					<button id="Clear" class="clear">Clear</button>
				</div>
			</div>
			<div class="row stl" height="250px;">
				<table id="myTable" class="table">
					<thead>
						<tr>
							<th>RoomMateId</th>
							<th>RoomMateName</th>
							<th>ExpansiveThings</th>
							<th>PurchasedDate</th>
							<th>PurchasedAmount</th>
							<th>Edit Save</th>
						</tr>
					</thead>
					<tbody class="table_data"></tbody>
				</table>
			</div>
		</div>
</body>

</html>
