package com.main;

import com.Dao.EmployeeDao;
import com.DemoDao.Employee;

public class UpdateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		
		emp.setId(7);
		emp.setFname("Anthony");
		
		
		EmployeeDao dao=new EmployeeDao();
		
		int status=dao.updatedata(emp);
		
				if(status>0) {
					System.out.println("Data is updated");
				}else {
					System.out.println("Data is not updated");
				}
	}

}
