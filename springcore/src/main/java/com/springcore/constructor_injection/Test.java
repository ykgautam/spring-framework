package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructor_injection/ci_config.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getCertificate());

	}
}
