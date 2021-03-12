package com.springcore.constructor_injection;

public class Certificate {
	private String name;

	public String getName() {
		return name;
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
