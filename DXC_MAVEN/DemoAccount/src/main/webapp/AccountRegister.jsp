<%-- dummy file --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Account Register Form</h1>
		<form action="./AccountHolderServlet" method="post">
			<table style="with: 80%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="UserName" /></td>
				</tr>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="Full_Name" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><input type="text" name="Email" /></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="number" name="Phone_Number" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Pan Card No</td>
					<td><input type="text" name="Pancard_Number" /></td>
				</tr>

				<tr>
					<td>Security Question(Hobbie)</td>
					<td><input type="text" name="Security_Question" /></td>
				</tr>
				<tr>
					<td>Balance</td>
					<td><input type="number" name="Balance" /></td>
				</tr>
				<tr>
					<td>Account Type</td>
					<td><input type="text" name="Account_Type" /></td>
				</tr>
				<tr>
					<td>Opening Date</td>
					<td><input type="date" name="Opening_Date" /></td>
				</tr>
				<tr>
					<td>Account Password</td>
					<td><input type="password" name="Account_Password" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>