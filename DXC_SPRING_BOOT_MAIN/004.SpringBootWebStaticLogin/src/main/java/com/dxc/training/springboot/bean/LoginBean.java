package com.dxc.training.springboot.bean;

import java.util.Objects;

public class LoginBean {
	private String userName;
	private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginBean(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "\n" + userName + ", " + userPassword ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userName, userPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginBean other = (LoginBean) obj;
		return Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
	}
	
	public boolean validateUser() {
		if(this.getUserName().equals("harish") && this.getUserPassword().equals("ayyappan"))
			 return true;
		else
			return false;
	}
	

}
