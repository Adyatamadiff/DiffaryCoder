package com.xsis.entity;

public class Customer {

	private int id;
	private String name;
	private String address;
	private String nohp;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String address, String nohp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.nohp = nohp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
	}
}