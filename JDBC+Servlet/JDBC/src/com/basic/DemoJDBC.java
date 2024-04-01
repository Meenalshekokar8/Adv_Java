package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
		//step 1 - Load and Register
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 - JDBC Connection
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch", "root", "root");
		
		//step 3 - JDBC Statement
				
		Statement stmt = con.createStatement();
		
		//step 4 - Execute query
		
		// Insert Query
		
		int status = stmt.executeUpdate("insert into employee(fname,lname,mobileno) values ('Tony','Stark','1163945155')");
		
		if(status>0) {
			System.out.println("Record is inserted");
			}else {
				System.out.println("Record is inserted");
			}
		
		// Insert Query
		
		//int status = stmt.executeUpdate("insert into employee(fname,lname,mobileno) values ('Steve','Rogers','963258712')");
				
		//if(status>0) {
		//	System.out.println("Record is inserted");
		//	}else {
		//		System.out.println("Record is inserted");
		//	}
		
		// Update Query
		
		//int status1 = stmt.executeUpdate("Update employee set fname='tony' where id = 1");
		
		//if(status1>0) {
		//	System.out.println("Record is updated");
			//}else {
				//System.out.println("Record is updated");
			//}
		
		// Delete Query - HW
		
//		int status1 = stmt.executeUpdate("delete from employee where id = 1");
//		if(status1>0) {
//			System.out.println("Record is deleted");
//				}else {
//					System.out.println("Record is deleted");
//				}
//		
		//Select Query
		
		ResultSet rst = stmt.executeQuery("select * from employee");
		
		while(rst.next()) {
			
			int id = rst.getInt("id");
		    String fname = rst.getString("fname");
		    String lname = rst.getString("lname");
		    String mobileno = rst.getString("mobileno");
		    
		    System.out.println("Id = " +id+ " First Name = " +fname+ " Last Name = " +lname+ " Mobile no = " +mobileno);
		}
		
		rst.close();
		
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();		
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				
		//step 5 - Close
			con.close();
			con=null;
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
		
}		
