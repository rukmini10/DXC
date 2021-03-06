package com.dxc.training.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.training.bean.Student;
import com.dxc.training.dao.StudentDao;
import com.dxc.training.dao.StudentDaoImpl;

public class App 
{
	public static void main( String[] args )
	{
		int choice;
		int rollno;
		String name,stream;
		float avgmarks;
		Scanner sc=new Scanner(System.in);

		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentDao studentdao=(StudentDaoImpl)context.getBean("studentDao");

		do {
			System.out.print("\n1. Add Student");
			System.out.print("\n2. Show All Students");
			System.out.print("\n3. Show Student By Rollno");
			System.out.print("\n4. Modify Student");
			System.out.print("\n5. Delete Student");
			System.out.print("\n0. Exit from Application");
			System.out.print("\nEnter your choice(0-5):");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("\nEnter Student Name:");
				name=sc.next();
				System.out.print("\nEnter Student Stream:");
				stream=sc.next();
				System.out.print("\nEnter Student AvgMarks:");
				avgmarks=sc.nextFloat();
				studentdao.createStudent(name, stream, avgmarks);
				break;
			case 2:
				List<Student> students=studentdao.listStudents();
				for(Student student:students) {
					System.out.print(student);
				}

				break;
			case 3:
				System.out.print("\nEnter RollNumber:");
				rollno=sc.nextInt();
				Student student2=studentdao.getStudentById(rollno);
				System.out.print(student2);
				break;
			case 4:
				
				System.out.print("\nEnter RollNumber:");
				rollno=sc.nextInt();
				System.out.print("\nEnter Student Stream:");
				stream=sc.next();
				System.out.print("\nEnter Student AvgMarks:");
				avgmarks=sc.nextFloat();
				studentdao.updateStudent(rollno,stream,avgmarks);
				break;
			case 5:
				System.out.print("\nEnter RollNumber:");
				rollno=sc.nextInt();
				studentdao.deleteStudentById(rollno);
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