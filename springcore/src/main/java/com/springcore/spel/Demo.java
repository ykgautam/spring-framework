package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Demo {

	@Value("#{10+20}")
	private int x;

	@Value("#{10>20?100:200}") // spring expression
	private int y;

	@Value("#{T(java.lang.Math).sqrt(25)}") // static method sqrt
	private double z;

	@Value("#{T(java.lang.Math).PI}") // static variable PI
	private double pi;

	@Value("#{new java.lang.String('Yash Gautam')}") // creating object in expression
	private String name;

	@Value("#{8>5}") // boolean type in expression
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
