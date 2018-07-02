package com.csc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.dao.EmployeeDAO;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO empDAO = context.getBean(EmployeeDAO.class);
		System.out.println(empDAO.findbyId(1));
		System.out.println(empDAO.findbyId(2));

	}
}
