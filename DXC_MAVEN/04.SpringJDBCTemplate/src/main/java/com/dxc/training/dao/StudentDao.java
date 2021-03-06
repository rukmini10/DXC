package com.dxc.training.dao;

import java.util.List;

import javax.sql.DataSource;

import com.dxc.training.bean.Student;

public interface StudentDao {
	//1.set datasource for db operation
	public void setDataSource(DataSource ds);
	
	//2. Add new Student
	public void createStudent(String name,String stream,float avgmarks);
	
	//3. To show all records
	public List<Student> listStudents();
	
	//4. Show Student info by rollno
	public Student getStudentById(int rollno);
	
	//5. To update student info
	public void updateStudent(int rollno,String stream,float avgmarks);
	
	//6. To remove student info by rollno
	public void deleteStudentById(int rollno);
}
