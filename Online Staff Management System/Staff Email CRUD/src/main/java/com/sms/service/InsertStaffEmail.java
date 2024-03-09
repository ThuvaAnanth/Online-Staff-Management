package com.sms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sms.model.Person;
import com.sms.util.GetDBConnection;

public class InsertStaffEmail {
	private Connection con = GetDBConnection.getConnection();
	
	private String fname = Person.getFirstName() ;
	private String lname = Person.getLastName();
	private String email = Person.getEmail();
	private Statement statement;
	private ResultSet resultSet;
	private String result = "false" ;
	
	public String insertstaffemail() {
		
		
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlQuery = "SELECT * FROM StaffEmail";
		 
	    
		try {
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				
	            if(email.equals(resultSet.getString("StaffEmail"))){
	            	result = "already" ;
	                con.close();
	            	return  result;
	            }
	            
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		String insertQuery = "INSERT INTO StaffEmail(Staf_FfName,Staf_LfName, StaffEmail) VALUES (?, ?, ?)";
		System.out.println(fname);
		// Create a prepared statement for the insertion
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = con.prepareStatement(insertQuery);
			
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, email);
			
			// Execute the insert statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
            	result = "true" ;
            }
            else {
            	result = "false" ;
            }

            preparedStatement.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
