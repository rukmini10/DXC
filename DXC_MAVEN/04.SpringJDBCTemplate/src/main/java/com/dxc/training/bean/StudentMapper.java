package com.dxc.training.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setRollno(rs.getInt("rollno"));
		student.setName(rs.getString("name"));
		student.setStream(rs.getString("stream"));
		student.setAvgmarks(rs.getFloat("avgmarks"));
		return student;
		
	}

}
