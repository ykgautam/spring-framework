package com.springcore.standalone.collections;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/alone_config.xml");
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1.getClass().getName());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1);
		System.out.println(person1.getFriends());
		System.out.println("---------------------------");
		System.out.println(person1.getFeeStructure());
		System.out.println(person1.getFeeStructure().getClass().getName());

		System.out.println("---------------------------");

		System.out.println(person1.getProperties());

//		Person person2 = context.getBean("person2",Person.class);
//		System.out.println(person2.getFriends());
		context.close();

	}

}
