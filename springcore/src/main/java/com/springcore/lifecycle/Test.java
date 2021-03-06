package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/samosa_config.xml");
//		registering shutdown hook
		context.registerShutdownHook();
		Samosa s = (Samosa) context.getBean("samosa");
		System.out.println(s);
//		context.close();

		System.out.println("-----------------------------");
		Pepsi p = (Pepsi) context.getBean("pepsi");
		System.out.println(p);

		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/sweet_config.xml");
		Sweet sweet = (Sweet) context2.getBean("sweet");
		System.out.println(sweet);

		context2.registerShutdownHook();
	}

}
