package com.main;

import com.Dao.EmployeeDao;
import com.DemoDao.Employee;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Iris", "West", "1122553366");
		
		
		EmployeeDao dao=new EmployeeDao();
		int status=dao.insertData(emp);
		if(status>0) {
			System.out.println("Data is Inserted");
		}else{
			System.out.println("Data is not Inserted");
		}

	}

}
