package com.xsis.service;

import java.util.List;
import java.util.Scanner;

import com.xsis.dao.CustomerDao;
import com.xsis.dao.CustomerDaoImpl;
import com.xsis.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		String b, c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan Nama 	      : ");
		b = s.next();
		System.out.println("Masukan Alamat	      : ");
		c = s.next();
		System.out.println("Masukan Nomer HP : ");
		d = s.next();
		cus.setName(b);
		cus.setAddress(c);
		cus.setNohp(d);

		CustomerDaoImpl serv = new CustomerDaoImpl();
		serv.save(cus);
		s.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Customer cus = new Customer();
		String b, c, d;
		int f;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin di update :");
		f = s.nextInt();
		System.out.println("Masukan Nama          : ");
		b = s.next();
		System.out.println("Masukan Alamat        : ");
		c = s.next();
		System.out.println("Masukan Nomer HP : ");
		d = s.next();
		cus.setName(b);
		cus.setAddress(c);
		cus.setNohp(d);
		CustomerDaoImpl serv = new CustomerDaoImpl();
		serv.update(f, cus);
		s.close();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin dihapus : ");
		b = s.nextInt();
		CustomerDaoImpl serv = new CustomerDaoImpl();
		serv.delete(b);
		s.close();
	}

	@Override
	public List<Customer> getAllCus() {
		// TODO Auto-generated method stub
		CustomerDao us = new CustomerDaoImpl();
		List<Customer> listCus = us.getAllCustomer();
		for (Customer data : listCus) {
			System.out.println("ID              : " + data.getId());
			System.out.println("Nama            : " + data.getName());
			System.out.println("Nomer Session   : " + data.getNohp());
			System.out.println();
		}
		return us.getAllCustomer();
	}

}
