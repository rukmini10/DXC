/*
package com.dxc.banking.registration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDao {
	private static String dburl = "jdbc:mysql://localhost:3306/dxcdb";
	private static String dbuname = "root";
	private static String dbpassword = "Mysql@2710";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into account_holder_Details values(?,?,?,?,?,?,?,?,?,?,?)";
		String result="Data Entered Successfully";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

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
		} catch (SQLException e) {
		
			result="Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;

	}
	public static int update(Member member){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement(  
					"Update account_holder_Details set UserName=?,Full_Name=?,Email=?,Phone_Number=?,Address=?,Pancard_Number=?,Security_Question=?, Balance=? ,Account_Type=?,Opening_Date=?,Account_Password=? where UserName=?");  

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
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  


	public static int delete(Member member){  
		int status=0;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("delete from account_holder_Details where Email=?");  
			ps.setString(1,member.getEmail());  
			status=ps.executeUpdate();  
		}catch(Exception e){System.out.println(e);}  

		return status;  
	}

	public static Member getRecordByEmail(String Email){  
		Member member=null;  
		try{  
			Connection con=getConnection();  
			PreparedStatement ps=con.prepareStatement("select * from account_holder_Details where Email=?");  
			ps.setString(1,Email);  
			ResultSet rs=ps.executeQuery();  
			while(rs.next()){  
				member=new Member();  
				member.setUserName("UserName");
				member.setFull_Name("Full_Name");
				member.setEmail("Email");
				member.setPhone_Number("Phone_Number");
				member.setAddress("Address");
				member.setPancard_Number("Pancard_Number");
				member.setSecurity_Question("Security_Question");
				member.setBalance("Balance");
				member.setAccount_Type("Account_Type");
				member.setOpening_Date("Opening_Date");
				member.setAccount_Password("Account_Password");
				member.setFull_Name("Full_Name");

			}  
		}catch(Exception e){System.out.println(e);}  
		return member;  
	}  
}  
*/