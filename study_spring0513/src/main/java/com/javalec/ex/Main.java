package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:aTM.xml");
		Dto d = ctx.getBean("dto",Dto.class);
		
		d.result_Dto();
		
		
	}
	
}
