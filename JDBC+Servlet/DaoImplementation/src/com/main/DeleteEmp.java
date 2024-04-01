package com.main;

import com.Dao.EmployeeDao;
import com.DemoDao.Employee;

public class DeleteEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		
		emp.setId(3);
		
		
		EmployeeDao dao=new EmployeeDao();
		
		int status=dao.deletedata(emp);
		
				if(status>0) {
					System.out.println("Data is deleted");
				}else {
					System.out.println("Data is not deleted");
				}
	}

}
