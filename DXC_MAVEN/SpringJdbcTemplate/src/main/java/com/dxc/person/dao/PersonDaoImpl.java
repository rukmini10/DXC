package com.dxc.person.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dxc.person.bean.Person;
import com.dxc.person.bean.PersonMapper;



public class PersonDaoImpl implements PersonDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTamplate;

	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.dataSource=ds;
		this.jdbcTamplate=new JdbcTemplate(this.dataSource);
	}

	public void createNewPerson(String firstName, String lastName, String emailId, String city) {
		String query="insert into person(firstName, lastName,emailId,city) values(?,?,?,?)";
		this.jdbcTamplate.update(query, firstName ,lastName,emailId,city);
		System.out.print("\nStudent record has been created...");
		
	}

	public List<Person> listPersons() {
		String query="select * from person";
		return this.jdbcTamplate.query(query, new PersonMapper());
	}

	public Person getPersonById(int id) {
		String query="select * from person where id=?";
		Person person=null;
		try {	
		person=this.jdbcTamplate.queryForObject(query,new Object[] {id},new PersonMapper());
		}catch(Exception e) {
			System.err.print("error found:"+e.getMessage());
		}
		return person;
	}

	public void updatePerson(int id,String firstName, String lastName, String emailId, String city) {
		// TODO Auto-generated method stub
String query="update person set =?, avgmarks=? where rollno=?";
		
		this.jdbcTamplate.update(query, firstName,lastName,emailId,city,id);
		System.out.print("\nPerson record has been modified...");
		
	}

	public void deletePersonById(int id) {
		String query="delete from person where id=?";
		this.jdbcTamplate.update(query,id);
		System.out.print("\nStudent record has been deleted...");
		
	}


}
