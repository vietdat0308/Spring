package com.csc.dao;


import org.springframework.orm.hibernate3.HibernateTemplate;

import com.csc.dto.Employee;

public class EmployeeDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Employee findbyId(long id){
		return hibernateTemplate.get(Employee.class, id);
	}
	
}
