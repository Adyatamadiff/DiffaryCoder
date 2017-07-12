package com.xsis.diffary.javacoder;

public class Employee {

	int id;
	String name;
	String address;
	Double salary;

	public void info() {
		System.out.println("ID      = " + this.id);
		System.out.println("Name    = " + this.name);
		System.out.println("Address = " + this.address);
		System.out.println("Salary  = " + this.salary);
	}
}