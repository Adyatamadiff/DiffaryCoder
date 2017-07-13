package com.xsis.diffary.javacoder.error_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class MyClass {

	public void index() {
		String[] data = new String[3];

		data[0] = "Hallo";
		data[1] = "World";
		data[2] = "Xsis";
		Connection con = null;
		try {
			con = DriverManager.getConnection(null);
			data[3] = "Mitra";
			data[4] = "Utama";
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Set To Array");
		System.out.println(Arrays.toString(data));
	}

	public void index2() {
		String data = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Input Name: ");
		BufferedReader br = new BufferedReader(isr);
		String datas[] = new String[1];
		try {
			data = br.readLine();
			int angka = Integer.parseInt(data);
			datas[0] = "Hallo";
			datas[1] = "Hallo2";
		} catch (NumberFormatException e) {
			System.err.println("Error : " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Terjadi Error Pada Index Array");
		} catch (Exception e) {
			System.err.println("Error");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Name = " + data);
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.index2();
	}
}