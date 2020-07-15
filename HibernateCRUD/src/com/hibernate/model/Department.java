package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = " department")
public class Department {
	@Id
	private int DeptID;
	private String DeptName;

	public int getDeptID() {
		return DeptID;
	}

	public void setDeptID(int deptID) {
		DeptID = deptID;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [DeptID=" + DeptID + ", DeptName=" + DeptName + "]";
	}

	public Department(int deptID, String deptName) {
		super();
		DeptID = deptID;
		DeptName = deptName;
	}

	public Department() {
		super();
	}

}
