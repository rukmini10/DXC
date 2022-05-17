package com.dxc.springboot.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value ="Employee")
public class Employee {
     private int empId;
     private String empFirstName;
     private String empLastName;
     private String empMailId;
     private String empDesignation;
     private float empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public Employee() {
		this.empId = 100;
		this.empFirstName = "Rukmini";
		this.empLastName = "Chebrolu";
		this.empMailId = "chebrolurukmini.com";
		this.empDesignation = "Manager";
		this.empSalary = 678000.44f;
	}
	public Employee(int empId, String empFirstName, String empLastName, String empMailId, String empDesignation,
			float empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empMailId = empMailId;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "\n" + empId + ", " + empFirstName + ", " + empLastName+ ", " + empMailId + ", " + empDesignation + ", " + empSalary ;
	}
    
    
     
     
    
}
