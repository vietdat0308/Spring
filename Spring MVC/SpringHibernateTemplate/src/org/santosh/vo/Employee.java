//Employee.java

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

package org.santosh.vo;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Department department;
	private float salary;
	
	private long employeeId;
	
	public Employee(long employeeId) {
		super();
		this.employeeId = employeeId;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public Employee(String name, Department department, float salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
}
