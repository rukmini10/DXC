package com.dxc.person.dao;

import java.util.List;

import javax.sql.DataSource;

import com.dxc.person.bean.Person;

public interface PersonDao {
	
		public void setDataSource(DataSource ds);
		
		// Adding new person details
		public void createNewPerson(String firstName,String lastName, String emailId,String city);
		
		// For displaying  all records
		public List<Person> listPersons();
		
		// Show person info by id
		public Person getPersonById(int id);
		
		// To update person info
		public void updatePerson(int id,String firstName,String lastName, String emailId,String city);
		
		//for remove info info by id
		public void deletePersonById(int id);
}
