package com.springcore.constructor_injection;

public class Addition {
	private int a;
	private int b;

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constr (double,double)");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constr (int,int)");
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constr (str,str)");
	}

	public void sum() {
		System.out.println("value of a " + this.a);
		System.out.println("value of b " + this.b);
		System.out.println("sum of a+b is " + (this.a + this.b));
	}

}
