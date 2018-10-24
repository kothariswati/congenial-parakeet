<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BankInfoWithBean</title>
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
	
	<form method="post" action="/MyFirstWeb1/BankInfo">
		<fieldset>
			<legend>
				<h3>Bank info</h3>
			</legend>
			<table>
				<tr>
					<td>Bank Name</td>
					<td><select name="bankName">
							<option value=""></option>
							<option value="BOA">BOA</option>
							<option value="CITI">CITI</option>
							<option value="WELLSFARGO">WELLSFARGO</option>
							<option value="HDFC">HDFC</option>
					</select></td>
				<tr>
					<td>Account Number</td>

					<td><input type="text" name="accountNumber"></input></td>
				</tr>
				<tr>
					<td>SSN</td>

					<td><input type="text" name="ssn"></input></td>
				</tr>
				<tr>
				<td></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>