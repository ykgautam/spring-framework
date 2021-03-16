package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel_config.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);
		System.out.println(demo.getClass().getName());
		System.out.println("value of x: " + demo.getX());
		System.out.println("value of y: " + demo.getY());
		System.out.println("value of z: " + demo.getZ());
		System.out.println("value of Pi: " + demo.getPi());
		System.out.println("name: " + demo.getName());
		System.out.println("isActive? " + demo.isActive());

		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		Expression parseExpression = spelExpressionParser.parseExpression("22+11");
		System.out.println(parseExpression.getValue());
	}

}
