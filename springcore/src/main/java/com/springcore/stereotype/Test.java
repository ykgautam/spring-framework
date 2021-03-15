package com.springcore.stereotype;

/*
 * spring bean scope: singleton, prototype
 * */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student student1 = context1.getBean("ob", Student.class);

		System.out.println(student1);
		System.out.println(student1.getAddress());

		System.out.println("hashcode of student1: " + student1.hashCode());

		Student student2 = context1.getBean("ob", Student.class);
		System.out.println("hashcode of student2: " + student2.hashCode());

//		using xml
		Teacher teacher1 = context1.getBean(Teacher.class);
		Teacher teacher2 = context1.getBean(Teacher.class);

		System.out.println("hashcode of teacher1: " + teacher1.hashCode());
		System.out.println("hashcode of teacher2: " + teacher2.hashCode());
	}

}
