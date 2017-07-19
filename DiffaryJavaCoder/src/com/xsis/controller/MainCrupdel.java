package com.xsis.controller;

import java.util.Scanner;
import com.xsis.dao.EmployeeDaoImpl;
import com.xsis.entity.Employee;

public class MainCrupdel {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Anda Ingin.. 'Insert = 1' atau 'Update = 2' atau 'Delete = 3' ?");
		a = s.nextInt();

		if (a == 1) {
			Employee emp = new Employee();
			String b, c, d;
			Double e;
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
		}
		if (a == 2) {
			Employee emp = new Employee();
			String b, c, d;
			Double e;
			int f;
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
		}
		if (a == 3) {
			int b;
			System.out.println("Masukan ID yang ingin dihapus");
			b = s.nextInt();
			EmployeeDaoImpl serv = new EmployeeDaoImpl();
			serv.delete(b);
		}
		s.close();
	}
}