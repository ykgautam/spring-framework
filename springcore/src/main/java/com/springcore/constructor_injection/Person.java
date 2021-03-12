package com.springcore.constructor_injection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certificate certificate;

	public Person(String name, int id, Certificate certificate) {
		this.name = name;
		this.id = id;
		this.certificate = certificate;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getId() + " { " + this.getCertificate().getName() + " }";
	}

}
