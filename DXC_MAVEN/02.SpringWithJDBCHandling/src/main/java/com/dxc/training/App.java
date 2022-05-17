package com.dxc.training;
import java.util.Scanner;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.training.bean.Student;
import com.dxc.training.dao.StudentDAOImpl;

public class App 
{
	public static void main( String[] args )
	{	int rollno=0;
	String name=null,stream=null;
	float avgmarks=0.0f;
	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	StudentDAOImpl stDAO=(StudentDAOImpl)context.getBean("studentDAOImpl");
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do {
		System.out.print("\n1. Adding new Records");
		System.out.print("\n2. Display All Records");
		System.out.print("\n3. Display Record By Rollnumber");
		System.out.print("\n4. Update Record");
		System.out.print("\n5. Delete Record by Rollnumber");
		System.out.print("\n0. Exit From App ");
		System.out.print("\nEnter your choice(0-5):");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("\nEnter Student name:");
			name=sc.next();
			System.out.print("\nEnter Student Stream:");
			stream=sc.next();
			System.out.print("\nEmnter Student AvgMarks:");
			avgmarks=sc.nextFloat();
			System.out.print("\n------------Adding new Records----------------------");
			stDAO.createStudent(name, stream, avgmarks);
			break;
		case 2:
			System.out.print("\n------------Show All Records----------------------");
			List <Student> students=stDAO.listStudents();
			for(Student st:students) {
				System.out.print("\n"+st);	
			}
			break;
		case 3:
			System.out.print("\nEnter Student Roll number:");
			rollno=sc.nextInt();
			System.out.print("\n------------Show record by rollno----------------------");
			Student student=stDAO.getStudentById(rollno);
			System.out.print("\n"+student);	
			break;
		case 4:
			System.out.print("\nEnter Student Roll number for updating data:");
			rollno=sc.nextInt();
			System.out.print("\nEnter Student Stream:");
			stream=sc.next();
			System.out.print("\nEmnter Student AvgMarks:");
			avgmarks=sc.nextFloat();
			System.out.print("\n------------Modifying a record----------------------");
			stDAO.updateStudent(rollno, stream, avgmarks);
			break;
		case 5:
			System.out.print("\n------------Delete record by rollno----------------------");
			System.out.print("\nEnter Student Roll number for delete data:");
			rollno=sc.nextInt();
			stDAO.deleteStudentById(rollno);
			break;
		case 0:
			System.out.print("\nYou have pressed 0 so Application terminated..");
			break;
		default:
			System.out.print("\nPress any key to continue.. valid choices are 005 only...");
		}

	}while(choice!=0);   
	}
}
