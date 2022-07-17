package com.prowings.SpringBeanLifeCycle;

public class Student {

	int rollnum;
	String name;
	String city;
	
	public Student() {
		super();
	}
	
	public Student(int rollnum, String name, String city) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.city = city;
	}
	
	public void init() {
		System.out.println("student init method called!!!!");
	}
	
	public void destroy() {
		System.out.println("student destroy method called!!!");
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", city=" + city + "]";
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
