package com.csc.dao;



import org.hibernate.SessionFactory;

import com.csc.dto.Employee;

public class EmployeeDAO{
	private SessionFactory sessionFactory;
	
	public Employee findbyId(long id){
		return (Employee) sessionFactory.openSession().get(Employee.class, id);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
}
