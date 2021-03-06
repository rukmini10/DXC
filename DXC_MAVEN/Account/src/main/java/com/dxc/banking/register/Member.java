package com.dxc.banking.register;

public class Member {

	private String UserName;
	private String Full_Name;
	private String Email;
	private String Phone_Number;
	private String Address;
	private String Pancard_Number;
	private String Security_Question;
	private String Balance;
	private String Account_Type;
	private String Opening_Date;
	private String Account_Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFull_Name() {
		return Full_Name;
	}
	public void setFull_Name(String full_Name) {
		Full_Name = full_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPancard_Number() {
		return Pancard_Number;
	}
	public void setPancard_Number(String pancard_Number) {
		Pancard_Number = pancard_Number;
	}
	public String getSecurity_Question() {
		return Security_Question;
	}
	public void setSecurity_Question(String security_Question) {
		Security_Question = security_Question;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getOpening_Date() {
		return Opening_Date;
	}
	public void setOpening_Date(String opening_Date) {
		Opening_Date = opening_Date;
	}
	public String getAccount_Password() {
		return Account_Password;
	}
	public void setAccount_Password(String account_Password) {
		Account_Password = account_Password;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String userName, String full_Name, String email, String phone_Number, String address,
			String pancard_Number, String security_Question, String balance, String account_Type, String opening_Date,
			String account_Password) {
		super();
		UserName = userName;
		Full_Name = full_Name;
		Email = email;
		Phone_Number = phone_Number;
		Address = address;
		Pancard_Number = pancard_Number;
		Security_Question = security_Question;
		Balance = balance;
		Account_Type = account_Type;
		Opening_Date = opening_Date;
		Account_Password = account_Password;
	}
	@Override
	public String toString() {
		return "Member [UserName=" + UserName + ", Full_Name=" + Full_Name + ", Email=" + Email + ", Phone_Number="
				+ Phone_Number + ", Address=" + Address + ", Pancard_Number=" + Pancard_Number + ", Security_Question="
				+ Security_Question + ", Balance=" + Balance + ", Account_Type=" + Account_Type + ", Opening_Date="
				+ Opening_Date + ", Account_Password=" + Account_Password + "]";
	}
	
	
}
