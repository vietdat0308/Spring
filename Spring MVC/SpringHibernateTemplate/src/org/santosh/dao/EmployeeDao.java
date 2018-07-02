//EmployeeDao.java

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

package org.santosh.dao;

import org.santosh.vo.Employee;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	
	public Employee getEmployeeById(long id) {
		return getHibernateTemplate().get(Employee.class, id);
	}

	public void addEmployee(Employee emp) {
		getHibernateTemplate().save(emp);
		System.out.println("1 record inserted...");
	}

	public void deleteEmployee(int employeeId) {
		getHibernateTemplate().delete(new Employee(employeeId));
		System.out.println("1 record(s) deleted...");
	}

}
