//Client.java

/*
 * =============================================================================
 * Copyright (c) Santosh Kumar Kar. All rights reserved.
 * 
 * This file you have downloaded  is copyright of Santosh Kumar Kar
 *
 * I have made every effort and taken great care in making sure that the source
 * code and other content included on my presentations is technically accurate, 
 * but I disclaim any and all responsibility for any loss, damage or destruction 
 * of data or any other property which may arise from relying on it. I will in no
 * case be liable for any monetary damages arising from such loss, damage or
 * destruction.
 * 
 * =============================================================================
 */

package org.santosh.client;

import org.santosh.dao.EmployeeDao;
import org.santosh.vo.Department;
import org.santosh.vo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
		
		System.out.println("loaded...");
		
		EmployeeDao empService= (EmployeeDao) ctx.getBean("employeeDao");
		Employee emp1 = new Employee("Srikant", new Department(21), 23000.30f);
		empService.addEmployee(emp1);
		
		Employee emp = empService.getEmployeeById(1004);		
		System.out.println("Employee ID: "+emp.getEmployeeId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Department id: "+emp.getDepartment().getDepartmentId());
		System.out.println("Department name: "+emp.getDepartment().getDeptname());
		System.out.println("Employee Address: "+emp.getDepartment().getAddress());
		System.out.println("Employee Salary: " + emp.getSalary());
	}

}
