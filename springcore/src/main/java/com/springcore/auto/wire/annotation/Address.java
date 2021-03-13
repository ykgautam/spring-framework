package com.springcore.auto.wire.annotation;

public class Address {
	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setting street in address class");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setting city in address class");
		this.city = city;
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
