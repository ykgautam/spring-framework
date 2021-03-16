package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig") // this is for student1 context reference in Main class
public class JavaConfig {

	@Bean()
	public Samosa getSamosa() {

		Samosa samosa = new Samosa();
		return samosa;
	}

	@Bean(name = { "studentBean", "temp" }) // this is for student2 context reference in Main class
	public Student getStudent() {

//	    creating an new Student object
		Student studentObj = new Student(getSamosa());
		return studentObj;
	}

}
