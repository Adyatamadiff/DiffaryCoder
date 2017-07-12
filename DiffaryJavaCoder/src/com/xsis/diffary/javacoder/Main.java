package com.xsis.diffary.javacoder;

public class Main {
	// Primitive Data Type
	public int umur = 40;

	// Polymorphism
	public Employee employee, director, manager, programmer;

	public void inheritanceExample() {
		director = new Director();
		manager = new Manager();
		programmer = new Programmer();
		employee = new Employee();

		director.setSalary(5000.0);
		System.out.println("Salary Director = " + director.getSalary());

	}

	// Casting
	Employee a = new Manager();
	Manager b = (Manager) new Employee();

	// Parse
	String anu = "21";
	Integer ab = Integer.parseInt(anu);

	public static void main(String[] args) {
		// Encapsulation
		// Empty Construct // Manual Setter
		/*
		 * Employee emp = new Employee(); emp.setId(1); emp.setName(
		 * "Mastah Aszis"); emp.setAddress("Sragen"); emp.setSalary(5000.0);
		 * 
		 * emp.info();
		 * 
		 * // Direct Construct using field Employee emp2 = new Employee(2,
		 * "Mastah Kulkul", "Tegal", 6000.0); emp2.info();
		 */

		// Inheritance
		Main main = new Main();
		main.inheritanceExample();
	}
}