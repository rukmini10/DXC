<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to my display page</title>
</head>
<body>
<%
try
{
       
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcdb","root","Mysql@2710");
        String sql = "select * from account_holder_Details";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()==false)
        {
            out.println("No Records in the table");
        }
        else
        {%>
       
        <table border="1">
                        <th>User Name</th>
						<th>Full Name</th>
						<th>Email Id</th>
						<th>Phone Number</th>
						<th>Address</th>
						<th>PanCard No</th>
						<th>Security Question</th>
						<th>Balance Amt</th>
						<th>Account Type</th>
						<th>Opening Date</th>
						<th>Account Pwd</th>
					
        <%
            do
            {%>
           
            <tr>
            <td><%= rs.getString(1)%></td>
            <td><%= rs.getString(2)%></td>
            <td><%= rs.getString(3)%></td>
            <td><%= rs.getString(4)%></td>
            <td><%= rs.getString(5)%></td>
            <td><%= rs.getString(6)%></td>
            <td><%= rs.getString(7)%></td>
            <td><%= rs.getInt(8)%></td>
            <td><%= rs.getString(9)%></td>
            <td><%= rs.getString(10)%></td>
            <td><%= rs.getString(11)%></td>
            
            
            </tr>
           
            <%}while(rs.next());
        }
       
}
catch(Exception e)
{
    System.out.println(e.getMessage());
    e.getStackTrace();
}
%>
</table>
</body>
</html>