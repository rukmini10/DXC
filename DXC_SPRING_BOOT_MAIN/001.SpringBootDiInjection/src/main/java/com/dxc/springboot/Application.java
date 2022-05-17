package com.dxc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dxc.springboot.bean.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
	    //System.out.println("Welcome to SpringBoot");
	    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    Employee emp = (Employee)context.getBean(Employee.class);
	    System.out.println(emp);
	}
	

}
