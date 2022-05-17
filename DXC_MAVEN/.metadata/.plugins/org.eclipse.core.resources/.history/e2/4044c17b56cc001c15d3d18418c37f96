package com.dxc.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class AccountHolderServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private AccountHolderDao accountHolderDao;

	public void init() {
		accountHolderDao = new AccountHolderDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
		/*
		String UserName=request.getParameter("UserName");
		String Full_Name=request.getParameter("Full_Name");
		String Email=request.getParameter("Email");
		String Phone_Number=request.getParameter("Phone_Number");
		String Address=request.getParameter("Address");
		String Pancard_Number=request.getParameter("Pancard_Number");
		String Security_Question=request.getParameter("Security_Question");
		Integer Balance=request.getIntHeader("Balance");
		String Account_Type=request.getParameter("Account_Type");
		String Opening_Date=request.getParameter("Opening_Date");
		String Account_Password=request.getParameter("Account_Password");  
	
		
        AccountHolder accountHolder = new AccountHolder();
		accountHolder.setUserName(UserName);
		accountHolder.setFull_Name(Full_Name);
		accountHolder.setEmail(Email);
		accountHolder.setPhone_Number(Phone_Number);
		accountHolder.setAddress(Address);
		accountHolder.setPancard_Number(Pancard_Number);
		accountHolder.setSecurity_Question(Security_Question);
		accountHolder.setBalance(Balance);
		accountHolder.setAccount_Type(Account_Type);
		accountHolder.setOpening_Date(Opening_Date);
		accountHolder.setAccount_Password(Account_Password);

		try {
			accountHolderDao.registerAccount(accountHolder);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("AccountHolderDetails.jsp");
*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        String action = request.getServletPath();
		       try {
		        switch (action) {
				    case "/new":
				        showNewForm(request, response);
				        break;
				    case "/insert":
				        insertAccount(request, response);
				        break;
				    case "/delete":
				        deleteAccount(request, response);
				        break;
				    case "/edit":
				        showEditForm(request, response);
				        break;
				    case "/update":
				        updateAccount(request, response);
				        break;
				    default:
				        listAccount(request, response);
				        break;
				}
		    }catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		 String UserName =(request.getParameter("UserName"));
	        AccountHolder existingUser = accountHolderDao.selectAccount(UserName);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
	        request.setAttribute("user", existingUser);
	        dispatcher.forward(request, response);
			
		}

	private void updateAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException  {
		// TODO Auto-generated method stub
		
		String UserName = request.getParameter("Name");
		String Full_Name = request.getParameter("Full_Name");
		String Email=request.getParameter("Email");
		String Phone_Number=request.getParameter("Phone_Number");
		String Address=request.getParameter("Address");
		String Pancard_Number=request.getParameter("Pancard_Number");
		String Security_Question=request.getParameter("Security_Question");
		Integer Balance=request.getIntHeader("Balance");
		String Account_Type=request.getParameter("Account_Type");
		String Opening_Date=request.getParameter("Opening_Date");
		String Account_Password=request.getParameter("Account_Password");
		
		
	}

	private void listAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		 List <AccountHolder> listAccount = accountHolderDao.selectAllAccounts();
	        request.setAttribute("listUser", listAccount);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
	        dispatcher.forward(request, response);
		
	}

	private void deleteAccount(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		// TODO Auto-generated method stub
		String UserName = (request.getParameter("UserName"));
        accountHolderDao.deleteAccount(UserName);
        response.sendRedirect("list");
		
	}

	private void insertAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		String UserName = request.getParameter("UserName");
		String Full_Name = request.getParameter("Full_Name");
		String Email=request.getParameter("Email");
		String Phone_Number=request.getParameter("Phone_Number");
		String Address=request.getParameter("Address");
		String Pancard_Number=request.getParameter("Pancard_Number");
		String Security_Question=request.getParameter("Security_Question");
		Integer Balance=request.getIntHeader("Balance");
		String Account_Type=request.getParameter("Account_Type");
		String Opening_Date=request.getParameter("Opening_Date");
		String Account_Password=request.getParameter("Account_Password");  
		AccountHolder newAccount=new AccountHolder(UserName,Full_Name,Email,Phone_Number,Address,
				Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password);
		accountHolderDao.insertAccount(newAccount);
		response.sendRedirect("list");
		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
	}
	}	

