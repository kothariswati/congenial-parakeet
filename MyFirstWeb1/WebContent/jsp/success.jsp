<html>
<head>
<title>3 Pages With Bean</title>
<body>
	<fieldset>
		<legend>You Have Registered Successfully</legend>

		<jsp:useBean id="pinfo" class="com.apex.samples.vo.PersonalInfoBean"
			scope="session" />
		<jsp:useBean id="cinfo" class="com.apex.samples.vo.ContactInfoBean"
			scope="session" />
		<jsp:useBean id="binfo" class="com.apex.samples.vo.BankInfoBean"
			scope="session" />
		<table>
			<tr>
				<td>First Name :</td>
				<td><jsp:getProperty property="firstName" name="pinfo" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><jsp:getProperty property="lastName" name="pinfo" /></td>
			</tr>
			<tr>
				<td>Middle Name :</td>
				<td><jsp:getProperty property="middleName" name="pinfo" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><jsp:getProperty property="gender" name="pinfo" /></td>
			</tr>

			<tr>
				<td>Address :</td>
				<td><jsp:getProperty property="address" name="cinfo" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><jsp:getProperty property="city" name="cinfo" /></td>
			</tr>
			<tr>
				<td>State :</td>
				<td><jsp:getProperty property="state" name="cinfo" /></td>
			</tr>
			<tr>
				<td>Country :</td>
				<td><jsp:getProperty property="country" name="cinfo" /></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><jsp:getProperty property="phone" name="cinfo" /></td>
			</tr>

			<tr>
				<td>Bank Name :</td>
				<td><jsp:getProperty property="bankName" name="binfo" /></td>
			</tr>
			<tr>
				<td>Account Number :</td>
				<td><jsp:getProperty property="accountNumber" name="binfo" /></td>
			</tr>
			<tr>
				<td>SSN :</td>
				<td><jsp:getProperty property="ssn" name="binfo" /></td>
			</tr>
		</table>
	</fieldset>
	<form method="post">
		<input type="submit" value="Query All" formaction="QueryResult.jsp">
	</form>
</body>
</head>
</html>