<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form:form action="validateUser" method="post">
 <div align="center">
  <table border="2" bordercolor="cyan">
   <tr><th colspan="2">Login Form</th></tr>
   <tr><td>User Name:</td><td><input type="text" name="userName"/></td></tr>
   <tr><td>User Password:</td><td><input type="password" name="userPassword"/></td></tr>
      <tr><td colspan="2" align="center">
        <input type="submit" value="login"/>
        <input type="reset" value="refresh"/>
        <input type="button" value="close app" onClick="window.close();"/>
       </td>
      </tr>
  </table> 
  <div style="color:red">${error}</div>
  <div style="color:green">${msg}</div>
 </div>
</form:form>
</body>
</html>
