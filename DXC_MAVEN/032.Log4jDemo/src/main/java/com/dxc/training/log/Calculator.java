package com.dxc.training.log;

import org.apache.log4j.Logger;

public class Calculator {
	final static Logger logger=Logger.getLogger(Calculator.class);
public int add(int num1,int num2) {
	logger.info("num1"+num1);
	logger.info("num2"+num2);
	logger.info("Total: "+(num1+num2));
	return num1+num2;
}
public int product(int num1,int num2) {
	logger.info("num1"+num1);
	logger.info("num2"+num2);
	logger.info("Total: "+(num1*num2));
	logger.warn("num2"+num2);
	logger.error("num2"+num2);
	logger.fatal("num2"+num2);
	return num1*num2;
}
	
	
	public static void main(String[] args){
		Calculator calc=new Calculator();
		calc.add(30, 20);
		calc.product(5, 5);
	}
	
	}

