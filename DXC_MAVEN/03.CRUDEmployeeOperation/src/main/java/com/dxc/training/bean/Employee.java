package com.dxc.training.bean;

/**
 * Java Class to map to the database Contact Table
 */
public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	
	public Employee(){
		empId=0;
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	/**
	 * @return the contactId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param contactId the contactId to set
	 */
	public void setEmpId(int contactId) {
		this.empId = contactId;
	}
	
	public String toString(){
		return(this.getEmpId()+"\t "+this.getFirstName()+"\t "+this.getLastName()+"\t "+this.getEmail()+"\t "+this.getSalary());
	}
	
	

}
