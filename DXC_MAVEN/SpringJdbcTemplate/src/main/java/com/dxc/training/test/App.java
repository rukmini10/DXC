package com.dxc.training.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.person.bean.Person;
import com.dxc.person.dao.PersonDao;
import com.dxc.person.dao.PersonDaoImpl;
import com.dxc.training.bean.Student;
import com.dxc.training.dao.StudentDao;
import com.dxc.training.dao.StudentDaoImpl;

public class App 
{
	public static void main( String[] args )
	{
		int choice;
		int id;
		String firstName,lastName,emailId,city;
		
		Scanner sc=new Scanner(System.in);

		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PersonDao studentdao=(PersonDaoImpl)context.getBean("personDao");

		do {
			System.out.print("\n1. Add Person");
			System.out.print("\n2. Show All Persons");
			System.out.print("\n3. Show Person By Id");
			System.out.print("\n4. Modify Person");
			System.out.print("\n5. Delete Person");
			System.out.print("\n0. Exit from Application");
			System.out.print("\nEnter your choice(0-5):");
			choice=sc.nextInt();
			Object persondao;
			switch(choice) {
			case 1:
				System.out.print("\nEnter Person First Name:");
				firstName=sc.next();
				System.out.print("\nEnter Person Last Name:");
				lastName=sc.next();
				System.out.print("\nEnter Email:");
				emailId=sc.next();
				System.out.print("\nEnter City:");
				city=sc.next();
				studentdao.createNewPerson(firstName,lastName,emailId, city);
				break;
			case 2:
				List<Person> persons=studentdao.listPersons();
				for(Person person:persons) {
					System.out.print(persons);
				}

				
				break;
			case 3:
				System.out.print("\nEnter ID:");
				id=sc.nextInt();
				Person person2=((Object) persondao).getPersonById(id);
				System.out.print(person2);
				break;
			case 4:
				System.out.print("\nEnter Id:");
				id=sc.nextInt();
				System.out.print("\nEnter Person First Name:");
				firstName=sc.next();
				System.out.print("\nEnter Person Last Name:");
				lastName=sc.next();
				System.out.print("\nEnter Email:");
				emailId=sc.next();
				System.out.print("\nEnter City:");
				city=sc.next();
				
				
				persondao.updatePerson(id,firstName,lastName,emailId, city);
				break;
			case 5:
				System.out.print("\nEnter Id:");
				id=sc.nextInt();
				studentdao.deletePersonById(id);
				break;
			case 0:
				System.out.print("\n Application terminated..");
				break;
			default:
				System.out.print("\n only 0 to 5 options availble..press any key to continue..");
			}
		}while(choice!=0);
	}
}