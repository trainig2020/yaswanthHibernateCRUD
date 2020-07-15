package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.DepartmentDAO;
import com.hibernate.model.Department;

public class DepartmentService {
	public static String createDepartment(Department dept) { 
	    return new DepartmentDAO().createDepartment(dept);
	  }
	public static String updateDepartment(Department dept) { 
	    return new DepartmentDAO().updateDepartment(dept);
	  }
	public static String deleteDepartment(int deptid) { 
	    System.out.println("From Service"+deptid);
		return new DepartmentDAO().deleteDepartment(deptid);
	  }
	public static String getAllDepartments() {
		return new DepartmentDAO().getAllDepartments();
	}
}
