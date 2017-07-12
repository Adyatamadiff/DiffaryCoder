package com.xsis.diffary.javacoder;

public class Director extends Manager{

	@Override
	public void setSalary(Double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary * 3);
	}
	
	public Double getBonus(){
		return 45000.0;
	}
}