/*
//dummy file
package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.training.bean.Employee;



public class EmployeeManager {
	public static Session getSession() {
		Session session=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory()
				.openSession();
		return session;
	}
	public static void addRecord(Employee employee) {
		boolean recStatus=false;
		try {
			Transaction tx=null;
			Session session=null;
			session=EmployeeManager.getSession();
			tx=session.beginTransaction();
			session.save(employee);
			tx.commit();
			recStatus=true;	
		}catch(HibernateException e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			if(recStatus==true) {
				System.out.print("\n Record  has been added successfully...");
			}else {
				System.err.print("\nPlease check error, no record added..");
			}	
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void showRecords() {
		List<Employee>employees=null;
		int rec=0;
		try {
			Transaction tx=null;
			Session session=null;
			session=EmployeeManager.getSession();
			employees=session.createQuery("from Employee").list();
			Iterator <Employee>itr=employees.iterator();
			while(itr.hasNext()) {
				System.out.print("\n"+itr.next());
				rec++;
			}
		}catch(HibernateException e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			if(rec>0) {
				System.out.print("\n "+rec+" Records found...");
			}else {
				System.err.print("\n No Record found...");
			}	
		}
	}
	
	public static void showRecord(int id) {
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager.getSession();
		emp=(Employee) session.get(Employee.class, id);
		if(emp==null) {
			System.err.print("\nNo record found for id:"+id);
		}else {
		System.out.print(emp);
		}
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void modRecord(int id,float salary) {
		boolean recStatus=false;
		Transaction tx=null;
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager.getSession();
		tx=session.beginTransaction();
		emp=(Employee) session.get(Employee.class, id);
		System.out.print("\nEmploye data:"+emp);
		emp.setSalary(salary);
		session.update(emp);
		session.flush();
		recStatus=true;
		
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}finally {
			if(recStatus==true) {
				tx.commit();
				session.close();
				System.out.print("\n  Records updated...");
			}else {
				tx.rollback();
				session.close();
				System.err.print("\n No Record found...");
			}
		}
	}
	
	public static void delRecord(int id) {
		boolean recStatus=false;
		Transaction tx=null;
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager.getSession();
		tx=session.beginTransaction();
		emp=(Employee) session.get(Employee.class, id);
		session.delete(emp);
		session.flush();
		recStatus=true;
		
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}finally {
			if(recStatus==true) {
				tx.commit();
				session.close();
				System.out.print("\n  Records deleted..."+emp);
			}else {
				tx.rollback();
				session.close();
				System.err.print("\n No Record found for id:"+id);
			}
		}
	}
	
	public static void main(String[] args) {
		Employee temp=null;
		System.out.print("\n 1. adding Records");
		temp=new Employee(222,"Vasudha","Kumar","Vasudha@gmail.com",55900);
		//1. added new record
		addRecord(temp);
		temp=new Employee(555,"lalitha","Singh","lalitha@gmail.com",66900);
		addRecord(temp);
		
		//2. Show all records
		System.out.print("\n 2. showing Records");
	showRecords();
		
		//3. modifiy record
		System.out.print("\n 3. modifying Records");
		modRecord(555,99900);
		
		//4. show 444 record
		System.out.print("\n 4. showing Records");
	showRecord(444);
		showRecords();
		
		
		//5. delete record=444
		System.out.print("\n 5. deleting Record");
		delRecord(444);
		
		System.out.print("\nshown the remaining Records");
		showRecords();
		

	}

}
*/