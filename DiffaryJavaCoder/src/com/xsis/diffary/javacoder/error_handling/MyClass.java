package com.xsis.diffary.javacoder.error_handling;

import java.util.Arrays;

public class MyClass {

	public void index() {
		String[] data = new String[3];
		
		data[0] = "Hallo";
		data[1] = "World";
		data[2] = "Xsis";
		try {
			data[3] = "Mitra";
			data[4] = "Utama";
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Set To Array");
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.index();
	}
}