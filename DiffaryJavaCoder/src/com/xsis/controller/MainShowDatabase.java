package com.xsis.controller;

import java.util.List;
import java.util.Scanner;

import com.xsis.dao.EmployeeDao;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.entity.Employee;

public class MainShowDatabase {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nama;
		System.out.println("Masukan Nama Yang Ingin Dicari : ");
		nama = s.next();
		
		EmployeeDao es = new EmployeeDaoImpl();
		System.out.println("-----          Search By Name              -----");
		System.out.println();
		List<Employee> emp = es.getEmployeeByName(nama);
		for(Employee e : emp){
			System.out.println("ID       : " + e.getId());
			System.out.println("Nama     : " + e.getName());
			System.out.println("Alamat   : " + e.getAddress());
			System.out.println("Salary   : " + e.getSalary());
			System.out.println("Nomer Hp : " + e.getNohp());
			System.out.println();
		}
		if(emp.size() == 0){
			System.out.println("Tidak Ditemukan Hasil~!");
		}
//		System.out.println();
//		System.out.println();
//		System.out.println("----- All Data From Database Xsis_Employee -----");
//		System.out.println();
//		List<Employee> listData = es.getAllEmployee();
//		for (Employee data : listData) {
//			System.out.println("ID       : " + data.getId());
//			System.out.println("Nama     : " + data.getName());
//			System.out.println("Alamat   : " + data.getAddress());
//			System.out.println("Salary   : " + data.getSalary());
//			System.out.println("Nomer Hp : " + data.getNohp());
//			System.out.println();
//		}
	}
}