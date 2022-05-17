package com.dxc.training.ws;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService

public class PlayWithNumberService {
public String NumberType(int num) {
	String res=null;
	if(num%2==0) {
		res="Even number : "+num;
	}
	else {
		res="ODd number : "+num;
	}
	return res;
}

public int NumberSquare(int num) {
	return num*num;
}
public int NumberSum(int num) {
	return num+num;
}
}
