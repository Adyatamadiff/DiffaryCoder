package com.xsis.controller;

import java.util.Scanner;
import com.xsis.service.UserService;
import com.xsis.service.UserServiceImpl;

public class MainUser {

	public static void main(String[] args) {
		int a;
		UserService es = new UserServiceImpl();
		Scanner s = new Scanner(System.in);
		System.out.println("Anda Ingin.. 'Insert = 1' atau 'Update = 2' atau 'Delete = 3' atau 'Show Database = 4'?");
		a = s.nextInt();

		if (a == 1) {
			es.save();
		}
		if (a == 2) {
			es.update();
		}
		if (a == 3) {
			es.delete();
		}
		if (a == 4) {
			es.getAllUser();
		}
		
		s.close();
	}
}