package com.xsis.controller;

import java.util.ArrayList;
import java.util.List;

import com.xsis.entity.Employee;
import com.xsis.service.EmployeeService;

public class DataCollection {
	// ArrayList turunan dari List

	// Single Record
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Adya");
		emp.setId(1);
		return emp;
	}

	// Multiple Record
	public List<Employee> getAllEmployee() {
		List<Employee> listEmp = new ArrayList<>();

//		Employee emp = new Employee(1, "Aszis", "Sragen");
//		Employee emp2 = new Employee(2, "Sekhul", "Tegal");
//		Employee emp3 = new Employee(3, "Joe", "Jakarta");

//		listEmp.add(emp);
//		listEmp.add(emp2);
//		listEmp.add(emp3);

		return listEmp;
	}

	public static void main(String[] args) {
		DataCollection dc = new DataCollection();
		// Get From Manual Data
		// Call Single Data
		Employee emp = dc.getEmployee();
		System.out.println("------Data Dari Input Manual------");
		System.out.println("---        Single   Data       ---");
		System.out.println("Nama : " + emp.getName());
		System.out.println("---        Multiple Data       ---");
		// Call Multiple Data
		List<Employee> listData = dc.getAllEmployee();
		// Extract Multiple Data From Manual
		for (Employee data1 : listData) {
			System.out.println("Nama : " + data1.getName());
		}

		// Get From Database
		// Call Single Data From Database
		EmployeeService es = new EmployeeService();
		Employee emp2 = es.getEmployeeById(100);
		System.out.println();
		System.out.println("------Data   Dari   Database------");
		System.out.println("---        Single   Data       ---");
		System.out.println("Name : " + emp2.getName());
		System.out.println("---        Multiple Data       ---");
		// Call Multiple Data From Database
		List<Employee> listData2 = es.getAllEMployee();
		// Extract Multiple Data From Database
		for (Employee data : listData2) {
			System.out.println("Name : " + data.getName());
		}
	}
}