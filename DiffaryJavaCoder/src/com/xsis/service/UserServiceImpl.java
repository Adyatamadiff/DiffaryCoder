package com.xsis.service;

import java.util.List;
import java.util.Scanner;
import com.xsis.dao.UserDao;
import com.xsis.dao.UserDaoImpl;
import com.xsis.entity.User;

public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		User usr = new User();
		String b, c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan Nama 	      : ");
		b = s.next();
		System.out.println("Masukan Alamat	      : ");
		c = s.next();
		System.out.println("Masukan Nomer Session : ");
		d = s.next();
		usr.setName(b);
		usr.setAddress(c);
		usr.setNo_session(d);

		UserDaoImpl serv = new UserDaoImpl();
		serv.save(usr);
		s.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		User usr = new User();
		String b, c, d;
		int f;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin di update :");
		f = s.nextInt();
		System.out.println("Masukan Nama          : ");
		b = s.next();
		System.out.println("Masukan Alamat        : ");
		c = s.next();
		System.out.println("Masukan Nomer Session : ");
		d = s.next();
		usr.setName(b);
		usr.setAddress(c);
		usr.setNo_session(d);
		UserDaoImpl serv = new UserDaoImpl();
		serv.update(f, usr);
		s.close();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		int b;
		Scanner s = new Scanner(System.in);
		System.out.println("Masukan ID yang ingin dihapus : ");
		b = s.nextInt();
		UserDaoImpl serv = new UserDaoImpl();
		serv.delete(b);
		s.close();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		UserDao us = new UserDaoImpl();
		List<User> listUsr = us.getAllUser();
		for (User data : listUsr) {
			System.out.println("ID              : " + data.getId());
			System.out.println("Nama            : " + data.getName());
			System.out.println("Nomer Session   : " + data.getNo_session());
			System.out.println();
		}
		return us.getAllUser();
	}
}