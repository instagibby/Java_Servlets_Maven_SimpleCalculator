<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Calculator</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container col-lg-9">
		<div class="row">
			<div class="col-md-12" style="text-align: center;">
				<h1>
					<a href="./">Slightly Crappy Java Calculator</a>
				</h1>
				<h4>Addition:</h4>
				<form action="Addition" method="post">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-4">
							<label for="no1">First No.</label> <input class="form-control"
								name="no1" type="number" id="no1" placeholder="First No.">
						</div>
						<div class="col-md-4">
							<label for="no2">Second No.</label> <input class="form-control"
								name="no2" type="number" id="no2" placeholder="Second No.">
						</div>
					</div>
					<br>
					<div class=row>
						<div class="col-md-5"></div>
						<div class="col-md-2">
							<input class="btn" type="submit" value="Add" />
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>