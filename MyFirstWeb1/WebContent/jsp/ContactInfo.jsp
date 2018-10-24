<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactInfoWithBean</title>
</head>
<body>
<%
		Object obj = request.getAttribute("error");
		String message = "";
		if (obj != null) {
			message = (String) obj;
		}
	%>
	<font color="red"><%=message%></font>
	
	<form method="post" action="/MyFirstWeb1/ContactInfo">
		<fieldset>
			<legend>
				<h3>Contact info</h3>
			</legend>
			<table>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></input></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city"></input></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state"></input></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><select name="country">
							<option value=""></option>
							<option value="US">US</option>
							<option value="US">US</option>
							<option value="IN">IN</option>
							<option value="AU">AU</option>

					</select></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone"></input></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Next"></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>