<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PersonalInfoWithBean</title>
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
	<form method="post" action="/MyFirstWeb1/PersonalInfo">
		<fieldset>
			<legend>
				<h3>Personal info</h3>
			</legend>
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" id="firstName"></input></td>
				</tr>

				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" id="lastName"></input></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><input type="text" name="middleName" id="middleName"></input></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="MALE">
						Male <input type="radio" name="gender" value="FEMALE">
						Female</td>
				</tr>
				<br>
				<tr>
					<td></td>
					<td><input type="submit" value="Next"></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>