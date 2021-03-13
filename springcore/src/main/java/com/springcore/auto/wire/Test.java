package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/auto_config.xml");

//		Address address = (Address) context.getBean("address");
//		System.out.println(address);

		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);

	}

}
