package com.prowings.SpringBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
		
		int custId;
		String name;
		String address;
		
		public Customer() {
			super();
		}
		
		public Customer(int custId, String name, String address) {
			super();
			this.custId = custId;
			this.name = name;
			this.address = address;
		}
		
		@PostConstruct
		public void init() {
			System.out.println("customer init method called!!!!");
		}
		
		@PreDestroy
		public void destroy() {
			System.out.println("customer destory method called!!!");
		}
		
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + "]";
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
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
		
		
}
