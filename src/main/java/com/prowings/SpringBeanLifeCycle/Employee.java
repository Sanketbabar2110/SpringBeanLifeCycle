package com.prowings.SpringBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	int empId;
	String empName;
	String city;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
	}
	
	public void destroy() throws Exception {
		System.out.println("Employee destroy method called!!!");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee init method called");
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
