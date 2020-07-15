package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.EmployeeDAO;
import com.hibernate.model.Employee;



public class EmployeeService {
	public static String createEmployee(Employee emp) {
    	return new EmployeeDAO().createEmployee(emp);
    }
    public static String updateEmployee(Employee emp) {
    	return new EmployeeDAO().updateEmployee(emp);
    }
    public static String deleteEmployee(Employee emp ) {
    	return new EmployeeDAO().deleteEmployee(emp);
    }
    public static List<Employee> getAllEmployees(int DID){
    	return new EmployeeDAO().getAllEmployees(DID);
    }
}
