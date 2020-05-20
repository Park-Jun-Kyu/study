package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appXML.xml");
		Student student = ctx.getBean("student1",Student.class);
		
		
		
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
		System.out.println(student.getName());
		System.out.println(student.getKor());
		
		

	}

}
