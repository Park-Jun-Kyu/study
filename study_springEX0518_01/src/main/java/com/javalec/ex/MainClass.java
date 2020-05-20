package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		
		
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student.getName());
		System.out.println(student.getNumber());
		
		
		System.out.println("----------------------------------------------");
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Info.class);
		Student student1 = ctx2.getBean("student",Student.class);
		
		System.out.println(student1.getName());
		System.out.println(student1.getNumber());
		
		
		
	}

}
