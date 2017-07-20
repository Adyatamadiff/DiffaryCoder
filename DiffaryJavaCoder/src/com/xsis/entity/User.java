package com.xsis.entity;

public class User {

	private int id;
	private String name;
	private String address;
	private String no_session;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String address, String no_session) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.no_session = no_session;
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

	public String getNo_session() {
		return no_session;
	}

	public void setNo_session(String no_session) {
		this.no_session = no_session;
	}
}