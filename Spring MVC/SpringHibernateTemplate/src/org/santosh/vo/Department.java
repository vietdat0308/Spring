//Department.java

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

public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6153308340900594117L;

	private long departmentId;
	private String deptname;
	private String address;
	
	public Department(long departmentId) {
		super();
		this.departmentId = departmentId;
	}

	public Department() {
		super();
	}

	public Department(long departmentId, String deptname, String address) {
		this.departmentId = departmentId;
		this.deptname = deptname;
		this.address = address;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
