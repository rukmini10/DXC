package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.training.bean.Employee;

import java.util.Scanner;

public class InsertEmployeesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=null;
		Transaction tx=null;
		boolean transStatus=false;
		Scanner sc=new Scanner(System.in);
		try{
			  session= new Configuration().configure().buildSessionFactory().openSession();
			// Transient state starts here
			  Employee emp = new Employee();
			  System.out.println("Enter your First name:");
			  emp.setFirstName(sc.next());
			  System.out.println("Enter your Last name:");
			  emp.setLastName(sc.next());
			  System.out.println("Enter your email id:");
			  emp.setEmail(sc.next());
			  System.out.println("Enter your salary:");
			  emp.setSalary(sc.nextDouble()); 
			 // Transient state ends here
			// Persistent state starts here
			  tx=session.beginTransaction();
			  session.save(emp);
			  tx.commit();
			  transStatus=true;
		  }catch(Exception e){
		  System.out.println(e.getMessage());
		  tx.rollback();
		  
		  }finally{
			 if(transStatus) 
				 System.out.println("Record inserted....");
			 else
				 System.out.println("error occurred..");	 
		  }
		  
		
		  session.close();
		// Persistent state ends here

	}

}
