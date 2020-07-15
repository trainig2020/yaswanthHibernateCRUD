package com.hibernate.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hibernate.model.Department;
import com.hibernate.model.Employee;
import com.hibernate.service.DepartmentService;
import com.hibernate.service.EmployeeService;

public class HibernateMain {
	public static void main(String[] args) {
		int DeptID=0;
		String DeptName;
		Department d = new Department();
		Scanner sc = new Scanner(System.in);
//		System.out.println("***********Enter the Department Details***************");
//		System.out.println("Enter the DeptID   : ");
//		d.setDeptID(Integer.parseInt(sc.nextLine()));
//		System.out.println("Enter the DeptName   :");
//		d.setDeptName(sc.nextLine());
//		System.out.println(DepartmentService.createDepartment(d));
//
//		System.out.println("******************Enter the New Details to Update in database*********************");
//		System.out.println("Enter the DeptID   : ");
//		d.setDeptID(Integer.parseInt(sc.nextLine()));
//		System.out.println("Enter the DeptName   :");
//		d.setDeptName(sc.nextLine());
//		System.out.println(DepartmentService.updateDepartment(d));
//
//		System.out.println("Records present in Department are   :");
//		System.out.println(DepartmentService.getAllDepartments());
//
//		System.out.println("************************Enter the department id to delete the record*********************");
//		System.out.println("Enter DeptID :");
//		DeptID = Integer.parseInt(sc.nextLine());
//		DepartmentService.deleteDepartment(DeptID);

		Employee e = new Employee();
		System.out.println(
				"***********************Enter the Employee Details to insert into database**********************   :");
		System.out.println("Enter the Employee deptid:");
		e.setDID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp ID:");
		e.setEmpID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp Name");
		e.setEmpName(sc.nextLine());
		System.out.println(EmployeeService.createEmployee(e));

		System.out.println(
				"************************Enter the new details you want to update ***********************    :");
		System.out.println("Enter the Employee deptid:");
		e.setDID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp ID:");
		e.setEmpID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp Name");
		e.setEmpName(sc.nextLine());

		System.out.println(EmployeeService.updateEmployee(e));

		System.out.println(
				"******************************Enter the department id to print all the employee details belong to that department*************************   :");
		int DID;
		System.out.println("Enter DID: ");
		DID =Integer.parseInt(sc.nextLine());
		List<Employee> lst = new ArrayList<Employee>();
		lst = EmployeeService.getAllEmployees(DID);
		for (Employee employee : lst) {
			if (employee != null) {
				System.out.println(employee.getEmpID());
				System.out.println(employee.getEmpName());
			} else {
				System.out.println("Employee Not Found");
			}
		}

		System.out.println("*****************Enter the department&Employee id to delete the record ******************  :");
		//Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the Employee deptid:");
		e.setDID(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the Emp ID:");
		e.setEmpID(Integer.parseInt(sc.nextLine()));
		System.out.println(EmployeeService.deleteEmployee(e));

	}
}
