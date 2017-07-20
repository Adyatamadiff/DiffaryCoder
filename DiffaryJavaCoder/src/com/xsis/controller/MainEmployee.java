package com.xsis.controller;

import java.util.Scanner;
import com.xsis.service.EmployeeService;
import com.xsis.service.EmployeeServiceImpl;

public class MainEmployee {

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeServiceImpl();
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Anda Ingin.. 'Insert = 1' atau 'Update = 2' atau 'Delete = 3' atau 'Show Database = 4' atau 'Search by Name = 5'?");
		a = s.nextInt();

		if (a == 1) {
			emp.save();
		}
		if (a == 2) {
			emp.update();
		}
		if (a == 3) {
			emp.delete();
		}
		if (a == 4) {
			emp.getAllEmployee();
		}
		if (a == 5) {
			emp.getEmployeeByName();
		}
		s.close();
	}
}