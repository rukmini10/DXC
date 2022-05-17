package com.dxc.banking.register;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class RegisterDao {

	private String dburl="jdbc:mysql://localhost:3306/dxcdb";
	private String dbuname="root";
	private String dbpassword="Mysql@2710";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			getClass().forName(dbDriver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public java.sql.Connection getConnection() {
		java.sql.Connection con=null;
		try {
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(Member member) {
		loadDriver(dbdriver);
		Connection con=(Connection) getConnection();
		String result="data entered successfully";
		
		String sql="insert into account_holder_Details values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, member.getUserName());
			ps.setString(2, member.getFull_Name());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getPhone_Number());
			ps.setString(5, member.getAddress());
			ps.setString(6, member.getPancard_Number());
			ps.setString(7, member.getSecurity_Question());
			ps.setString(8, member.getBalance());
			ps.setString(9, member.getAccount_Type());
			ps.setString(10, member.getOpening_Date());
			ps.setString(11, member.getAccount_Password());

			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			result="Data Not entered successfully";
		}
		return result;
	}

}
