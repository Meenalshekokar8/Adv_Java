package com.main;

import java.util.List;

import com.Dao.EmployeeDao;
import com.DemoDao.Employee;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list= dao.getAllRecord();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
