package com.csc.dao;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.csc.dto.Employee;

public class EmployeeDAO extends HibernateDaoSupport{

	public Employee findbyId(long id){
		return getHibernateTemplate().get(Employee.class, id);
	}
	
}
