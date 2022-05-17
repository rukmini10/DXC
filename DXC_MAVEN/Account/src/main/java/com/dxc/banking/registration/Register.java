/*

package com.dxc.banking.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		Member member=new Member(UserName,Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password);
		RegisterDao rdao=new RegisterDao();
		String result=rdao.insert(member);
		response.getWriter().println(result);
		
		
	}

}*/