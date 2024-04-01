package com.main;

import com.Dao.EmployeeDao;
import com.DemoDao.Employee;

public class GetSpecificRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao=new EmployeeDao();
		Employee emp=  dao.getspecificRecordById(7);
		System.out.println(emp);
	}

}
