package com.dxc.ws;


import javax.servlet.annotation.WebServlet;

@WebServlet
public class NumberMagic {
	public String numberType(int num) {
		String res=null;
		if(num%2==0) {
			res="Even number : "+num;
		}else {
			res="Odd number : "+num;
		}
		return res;
	}
	public int numberCube(int num) {
		return num*num*num;
	}
	public int numberSum(int num1,int num2) {
		return num1+num2;
	}
}
