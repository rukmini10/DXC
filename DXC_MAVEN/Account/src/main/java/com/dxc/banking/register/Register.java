package com.dxc.banking.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register {
	private static final long serialVersionUID=1L;

	public Register() {
		super();

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		System.out.println("Inside the Register Servlet");
		PrintWriter out=response.getWriter();
		String UserName=request.getParameter("UserName");
		String Full_Name=request.getParameter("Full_Name");
		String Email=request.getParameter("Email");
		String Phone_Number=request.getParameter("Phone_Number");
		String Address=request.getParameter("Address");
		String Pancard_Number=request.getParameter("Pancard_Number");
		String Security_Question=request.getParameter("Security_Question");
		String Balance=request.getParameter("Balance");
		String Account_Type=request.getParameter("Account_Type");
		String Opening_Date=request.getParameter("Opening_Date");
		String Account_Password=request.getParameter("Account_Password");  
		
		Member member=new Member(UserName,Full_Name,Email,Phone_Number,Address,
				Pancard_Number, Security_Question, Balance, Account_Type,Opening_Date,Account_Password);
		
	    RegisterDao rDao=new RegisterDao();
	    String result=rDao.insert(member);
	    out.print(result);
	    System.out.println(result);
	
	
	
	}

}
