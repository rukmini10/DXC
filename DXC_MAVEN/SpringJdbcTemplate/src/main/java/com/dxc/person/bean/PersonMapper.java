package com.dxc.person.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.dxc.person.bean.Person;

public class PersonMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	
		
		Person person=new Person();
		person.setId(rs.getInt("id"));
		person.setFirstName(rs.getString("firstName"));
		person.setLastName(rs.getString("lastName"));
		person.setEmailId(rs.getString("emailId"));
		person.setCity(rs.getString("city"));
		return person;
	}

}
