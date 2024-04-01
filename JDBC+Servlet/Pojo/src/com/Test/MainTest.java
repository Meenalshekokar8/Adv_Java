package com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.PreparedStatement.Employee;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee( "Catline", "Smok", "56987135");
		System.out.println(emp);
		
		try {
			//Step1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch","root","root");
			
			//step 3
			PreparedStatement pst = con.prepareStatement("update employee set fname=?,lname=?, mobileno=? where id=?");
			
			pst.setString(1, emp.getFname());
			pst.setString(2, emp.getLname());
			pst.setString(3, emp.getMobileno());
			pst.setInt(4, emp.getId());
			
			 int status=pst.executeUpdate();
			
			 if(status>0) {
				 
				 System.out.println("Data is Updated");
				 
			 }else {
				 System.out.println("Data is not Updated");
			 }
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	}
