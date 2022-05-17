package com.dxc.banking.customer;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class AccountHolderDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/dxcdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Mysql@2710";
		
    private static final String INSERT_ACCOUNTS_SQL = "INSERT INTO account_holder_Details" +
				"  (UserName,Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password) VALUES " +
				" (?, ?, ?, ?,?,?,?,?,?,?,?);";

    private static final String SELECT_ACCOUNTS_BY_UserName = "select UserName,Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password where UserName =?";
    private static final String SELECT_ALL_ACCOUNTS = "select * from account_holder_Details";
    private static final String DELETE_ACCOUNTS_SQL = "delete from account_holder_Details where UserName = ?;";
    private static final String UPDATE_ACCOUNTS_SQL = "update account_holder_Details set Full_Name=?,Email=?,Phone_Number=?,Address=?,Pancard_Number=?,Security_Question=?,Balance=?,Account_Password where UserName = ?;";

    public AccountHolderDao() {
    }

    protected java.sql.Connection getConnection() {
        java.sql.Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    
    //inserting data
    public void insertAccount(AccountHolder accountholder) throws SQLException {
        System.out.println(INSERT_ACCOUNTS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = (Connection) getConnection();
        	java.sql.PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNTS_SQL)) {
        	
        	preparedStatement.setString(1, accountholder.getUserName());
			preparedStatement.setString(2, accountholder.getFull_Name());
			preparedStatement.setString(3, accountholder.getEmail());
			preparedStatement.setString(4, accountholder.getPhone_Number());
			preparedStatement.setString(5, accountholder.getAddress());
			preparedStatement.setString(6, accountholder.getPancard_Number());
			preparedStatement.setString(7, accountholder.getSecurity_Question());
			preparedStatement.setInt(8, accountholder.getBalance());
			preparedStatement.setString(9, accountholder.getAccount_Type());
			preparedStatement.setString(10, accountholder.getOpening_Date());
			preparedStatement.setString(11, accountholder.getAccount_Password());
			    
        	
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
    }
    
   //select account by username
    public AccountHolder selectAccount(String UserName) {
        AccountHolder accountholder = null;
        // Step 1: Establishing a Connection
        try (Connection connection = (Connection) getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(SELECT_ACCOUNTS_BY_UserName);) {
            preparedStatement.setString(1, UserName);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
            	
                String Full_Name = rs.getString("Full_Name");
                String Email = rs.getString("Email");
                String Phone_Number = rs.getString("Phone_Number");
                String Address = rs.getString("Address");
                String Pancard_Number = rs.getString("Pancard_Number");
                String Security_Question = rs.getString("Security_Question");
                Integer Balance = rs.getInt("Balance");
                String Account_Type = rs.getString("Account_Type");
                String Opening_Date = rs.getString("Opening_Date");
                String Account_Password = rs.getString("Account_Password");
               accountholder = new AccountHolder(UserName,Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password);
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return accountholder;
    }
   //displaying all accounts 
    public List <AccountHolder> selectAllAccounts() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List <AccountHolder> accountholders = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = (Connection) getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(SELECT_ALL_ACCOUNTS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
            	
            	String Full_Name = rs.getString("Full_Name");
                String Email = rs.getString("Email");
                String Phone_Number = rs.getString("Phone_Number");
                String Address = rs.getString("Address");
                String Pancard_Number = rs.getString("Pancard_Number");
                String Security_Question = rs.getString("Security_Question");
                Integer Balance = rs.getInt("Balance");
                String Account_Type = rs.getString("Account_Type");
                String Opening_Date = rs.getString("Opening_Date");
                String Account_Password = rs.getString("Account_Password");
                accountholders= (List<AccountHolder>) new AccountHolder(Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Account_Password, Balance,Account_Type,Opening_Date,Account_Password);
  
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountholders;
    } 
    
    //deleteing account
    public boolean deleteAccount(String UserName) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = (Connection) getConnection(); PreparedStatement statement = (PreparedStatement) connection.prepareStatement(DELETE_ACCOUNTS_SQL);) {
            statement.setString(1, UserName);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
//update account
    public boolean updateUser(AccountHolder accountholder) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = (Connection) getConnection(); PreparedStatement statement = (PreparedStatement) connection.prepareStatement(UPDATE_ACCOUNTS_SQL);) {
       statement.setString(1, accountholder.getUserName());
       statement.setString(2, accountholder.getFull_Name());
	   statement.setString(3, accountholder.getEmail());
	   statement.setString(4, accountholder.getPhone_Number());
	   statement.setString(5, accountholder.getAddress());
	   statement.setString(6, accountholder.getPancard_Number());
	   statement.setString(7, accountholder.getSecurity_Question());
	   statement.setInt(8, accountholder.getBalance());
		statement.setString(9, accountholder.getAccount_Type());
		statement.setString(10, accountholder.getOpening_Date());
		statement.setString(11, accountholder.getAccount_Password());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
    
    
    
    
    
	}
