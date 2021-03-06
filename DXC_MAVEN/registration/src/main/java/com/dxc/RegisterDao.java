package com.dxc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
private String dburl="jdbc:mysql://localhost:3306/dxcdb";
private String dbuname="root";
private String dbpassword="Mysql@2710";
private String dbdriver="com.mysql.cj.jdbc.Driver";

public void loadDriver(String dbDriver) {
	try {
		getClass().forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public Connection getConnection() {
	Connection con=null;
	try {
		con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return con;
}

public String insert(Member member) {
	loadDriver(dbdriver);
	Connection con=getConnection();
	String result= "data entered successfully";
	
	String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
	try {
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, member.getUname());
	ps.setString(2, member.getFullname());
	ps.setString(3, member.getPassword());
	ps.setString(4, member.getEmail());
	ps.setString(5, member.getPassword());
	ps.setString(6, member.getAddress());
	ps.setString(7, member.getSecurityQuestion());
	ps.setString(8, member.getOpeningAmount());
	ps.setString(9, member.getAccountType());
	ps.setString(10, member.getOpeningDate());
	ps.setString(11, member.getPanCard());
	
	ps.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
		result="Data Not entered";
	}
	return result;
	
}


}
