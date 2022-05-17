package com.dxc.ws;

public class NameConversion {
	public String nConvertor(String firstName,String lastName, String surName) {
		return (firstName.charAt(0) + lastName.charAt(0) + " "+  surName);
	}

}
/*
public class NameConversion {
	public String nConvertor() {
		String str="Rukmini Chebrolu";
		String str1="ruk";
		char firstname=str.charAt(0);
		char secondname=str.charAt(8);
		return (firstname + secondname + " "+  str1);
	}
}*/