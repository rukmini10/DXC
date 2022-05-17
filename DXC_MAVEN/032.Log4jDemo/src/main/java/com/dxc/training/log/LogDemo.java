package com.dxc.training.log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class LogDemo {
	private void callingMe(String msg) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled()) {
			logger.debug("Thhis is a debug "+msg);
		}
		if(logger.isInfoEnabled()) {
			logger.debug("Thhis is a info "+msg);
		}
		logger.warn("this is warn "+msg);
		logger.error("this is error "+msg);
		logger.fatal("this is fatal "+msg);
		
	}
	
	final static Logger logger=Logger.getLogger(LogDemo.class);
	public static void main(String[] args){
		//Properties obj=new Properties();
		//obj.load(new FileInputStream("log4j.properties"));
		// TODO Auto-generated method stub
		LogDemo logDemo=new LogDemo();
		logDemo.callingMe("Hello Applicant");

	}
	

}
