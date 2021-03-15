package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob") // obj ref name as "ob"
public class Student {
	@Value("yash")
	private String studentName;
	@Value("Pune")
	private String city;

	@Value("#{temp}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
