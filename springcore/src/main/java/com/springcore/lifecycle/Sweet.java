package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sweet {
	private String sweetName;

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	public Sweet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sweet [sweetName=" + sweetName + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("sweet start method");
	}

	@PreDestroy
	public void end() {
		System.out.println("sweet end method");
	}
}
