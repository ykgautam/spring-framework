package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setting address in employee class");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
	}

	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor Employee");
	}

}
