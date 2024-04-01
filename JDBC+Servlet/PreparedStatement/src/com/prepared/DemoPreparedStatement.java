package com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 - Load and register
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//step 2 - JDBC Connection	
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/161batch", "root", "root");
			
		//Prepared Statement
			
		//Insert query
			
//			PreparedStatement  pst = con.prepareStatement("insert into employee(fname,lname,mobileno) values(?,?,?)");
//			
//			pst.setString(1, "Natasha");
//		    pst.setString(2, "Romonov");
//			pst.setString(3, "7894561239");	
//	
//			int status = pst.executeUpdate();
//			
//			if(status>0) {
//				
//				System.out.println("Row is inserted...");
//				
//			}else {
//				System.out.println("Row is not inserted...");
//			}
			
			
		//Update Query
			
//			PreparedStatement pst=con.prepareStatement("update employee set fname=?,lname=?, mobileno=? where id=?");
//			
//			pst.setString(1, "Cisco");
//			pst.setString(2, "Ramon");
//			pst.setString(3, "23654796");
//			pst.setInt(4, 4);
//			
//			int status1=pst.executeUpdate();
//		
//		if(status1>0) {
//				
//				System.out.println("Row is Updatated...");				
//			}else {
//				System.out.println("Row is not Updatated...");
//			}
			
	//Select Query - all 		
			
//		PreparedStatement pst=con.prepareStatement("select * from employee");
//		
//		ResultSet rst= pst.executeQuery();
//			
//		while(rst.next()) {
//			int id= rst.getInt("id");
//			String fname= rst.getString("fname");
//			String lname= rst.getString("lname");
//			String mobileno= rst.getString("mobileno");
//			System.out.println("id=> "+id+" First name => "+fname+" Last name> "+lname+" Mobile No=> "+mobileno);
//			
//		}
//		rst.close();
//		
			
		//Select query - specific 
			
//			PreparedStatement pst=con.prepareStatement("select * from employee where fname=? and id=?");
//			pst.setString(1, "Cisco");
//			pst.setInt(2, 4);
//			
//			ResultSet rst= pst.executeQuery();
//			
//			while(rst.next()) {
//				int id= rst.getInt("id");
//				String fname= rst.getString("fname");
//				String lname= rst.getString("lname");
//				String mobileno= rst.getString("mobileno");
//				System.out.println("id=> "+id+" First name => "+fname+" Last name> "+lname+" Mobile No=> "+mobileno);
//			}
//			
		//Delete query - HW
			
			PreparedStatement pst=con.prepareStatement("delete from employee where id=?");
			
			pst.setInt(1, 4);
			
			int status1=pst.executeUpdate();
		
		if(status1>0) {
				
				System.out.println("Row is Updatated...");				
			}else {
				System.out.println("Row is not Updatated...");
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}

}
