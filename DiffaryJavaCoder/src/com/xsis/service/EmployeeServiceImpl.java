package com.xsis.service;

import java.util.List;
import java.util.Scanner;
import com.xsis.dao.EmployeeDao;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	// Get Data
	public List<Employee> getEmployeeByName() {
		String a;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan Nama Yang Ingin Anda Cari : ");
		a = s.next();
		EmployeeDao us = new EmployeeDaoImpl();
		List<Employee> listEmp = us.getEmployeeByName(a);
		for (Employee data : listEmp) {
			System.out.println("ID              : " + data.getId());
			System.out.println("Nama            : " + data.getName());
			System.out.println("Nomer Session   : " + data.getNohp());
			System.out.println();
		}
		s.close();
		return us.getEmployeeByName(a);
	}

	public List<Employee> getAllEmployee() {
		EmployeeDao us = new EmployeeDaoImpl();
		List<Employee> listEmp = us.getAllEmployee();
		for (Employee data : listEmp) {
			System.out.println("ID              : " + data.getId());
			System.out.println("Nama            : " + data.getName());
			System.out.println("Nomer Session   : " + data.getNohp());
			System.out.println();
		}
		return us.getAllEmployee();
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		String b, c, d;
		Double e;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan Nama     : ");
		b = s.next();
		System.out.println("Masukan Alamat   : ");
		c = s.next();
		System.out.println("Masukan Salary   : (Contoh: 1000.0)");
		e = s.nextDouble();
		System.out.println("Masukan Nomer Hp : ");
		d = s.next();
		emp.setName(b);
		emp.setAddress(c);
		emp.setSalary(e);
		emp.setNohp(d);

		EmployeeDaoImpl serv = new EmployeeDaoImpl();
		serv.save(emp);
		s.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		String b, c, d;
		Double e;
		int f;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin di update :");
		f = s.nextInt();
		System.out.println("Masukan Nama     : ");
		b = s.next();
		System.out.println("Masukan Alamat   : ");
		c = s.next();
		System.out.println("Masukan Salary   : ");
		e = s.nextDouble();
		System.out.println("Masukan Nomer Hp : ");
		d = s.next();
		emp.setName(b);
		emp.setAddress(c);
		emp.setSalary(e);
		emp.setNohp(d);
		EmployeeDaoImpl serv = new EmployeeDaoImpl();
		serv.update(f, emp);
		s.close();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin dihapus");
		b = s.nextInt();
		EmployeeDaoImpl serv = new EmployeeDaoImpl();
		serv.delete(b);
		s.close();
	}
}