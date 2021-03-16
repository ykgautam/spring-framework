package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Samosa {

	@Value("12")
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("my price is " + getPrice());

	}
}
