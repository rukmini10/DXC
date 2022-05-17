package com.dxc.training.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dxc.training.bean.Student;
import com.dxc.training.bean.StudentMapper;

public class StudentDaoImpl implements StudentDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTamplate;

	//1. Setting datasource for db operation
	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
		this.jdbcTamplate=new JdbcTemplate(this.dataSource);
	}
	//2. Adding student
	public void createStudent(String name, String stream, float avgmarks) {
		String query="insert into student(name,stream,avgmarks) values(?,?,?)";
		this.jdbcTamplate.update(query, name,stream,avgmarks);
		System.out.print("\nStudent record has been created...");
	}
	
	//3. Displaying all records 
	public List<Student> listStudents() {
		String query="select * from student";
		return this.jdbcTamplate.query(query, new StudentMapper());
	}
	
	//4. Display Student data based on rollno
	public Student getStudentById(int rollno) {
		String query="select * from student where rollno=?";
		Student student=null;
		try {	
		student=this.jdbcTamplate.queryForObject(query,new Object[] {rollno},new StudentMapper());
		}catch(Exception e) {
			System.err.print("error found:"+e.getMessage());
		}
		return student;
	}
	//5. Modifying student stream and avgmakrs
	public void updateStudent(int rollno, String stream, float avgmarks) {
		String query="update student set stream=?, avgmarks=? where rollno=?";
		
		this.jdbcTamplate.update(query, stream,avgmarks,rollno);
		System.out.print("\nStudent record has been modified...");
	}
	//6. deleting student record by rollno
	public void deleteStudentById(int rollno) {
		String query="delete from student where rollno=?";
		this.jdbcTamplate.update(query,rollno);
		System.out.print("\nStudent record has been deleted...");
	}

}
