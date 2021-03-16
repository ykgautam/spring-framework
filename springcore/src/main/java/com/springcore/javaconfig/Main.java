package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Student student1 = context.getBean("student", Student.class);

		Student student2 = context.getBean("studentBean", Student.class);

		System.out.println(student1);
		System.out.println(student2);

		student1.study();
		student2.study();
		System.out.println("-------------------------------");
		System.out.println(student1.getSamosa().getClass().getName());
		System.out.println(student1.getSamosa().getPrice());

	}
}
