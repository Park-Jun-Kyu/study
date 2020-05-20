package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigXML.class);
		Student student = ctx.getBean("student",Student.class);
		
		System.out.println(student.getStu_num());
		System.out.println(student.getName());
		System.out.println(student.getKor());
		System.out.println(student.getEng());
		System.out.println(student.getMath());
		System.out.println(student.getHobby());
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());



	}

}
