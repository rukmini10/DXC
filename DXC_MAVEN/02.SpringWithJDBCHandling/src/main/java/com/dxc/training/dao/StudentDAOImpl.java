package com.dxc.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.dxc.training.bean.Student;

public class StudentDAOImpl implements StudentDAO{
	private DataSource dataSource;

	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
		
	}

	public void createStudent(String name, String stream, float avgmarks) {
		String query="insert into student(name,stream,avgmarks) values(?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, stream);
			pstmt.setFloat(3, avgmarks);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\n Record inserted..");
			}else {
				System.err.print("\n Record could not inserte..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {
				System.out.print(e.getMessage());
			}
			
		}
		
	}

	public List<Student> listStudents() {
		String sql="select * from student";
		Connection con=null;
		PreparedStatement pstmt=null;
		List <Student> studentList=new ArrayList<Student>();
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			Student st;
			while(rs.next()) {
				st=new Student();
				st.setRollno(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setStream(rs.getString(3));
				st.setAvgmarks(rs.getFloat(4));
				studentList.add(st);
				}
			}catch(Exception e) {
				System.out.print(e.getMessage());
			}
		return studentList;
	}

	public Student getStudentById(int rollno) {
		String sql="select * from student where rollno=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Student st=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				st=new Student();
				st.setRollno(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setStream(rs.getString(3));
				st.setAvgmarks(rs.getFloat(4));
				}
			}catch(Exception e) {
				System.out.print(e.getMessage());
			}
		return st;
	}



	public void updateStudent(int rollno, String stream,float avgmarks) {
		String sql="update student set stream=?, avgmarks=? where rollno=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, stream);
			pstmt.setFloat(2, avgmarks);
			pstmt.setInt(3, rollno);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\n Record modified for rollno:"+rollno);
			}else {
				System.out.print("\n Record modification failed for rollno:"+rollno);
				}
			
			}catch(Exception e) {
				System.out.print(e.getMessage());
			}
		
	}

	

	public void deleteStudentById(int rollno) {
		String sql="delete from student where rollno=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.print("\n Record deleted for rollno:"+rollno);
			}else {
				System.out.print("\n Record deletion failed for rollno:"+rollno);
				}
			
			}catch(Exception e) {
				System.out.print(e.getMessage());
			}
	}

}
