package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ConfigXML {

	
	
	
	
	@Bean
	public Student student() {
		
			ArrayList<String>hobby = new ArrayList<String>();
		
			hobby.add("몬헌");
			hobby.add("와우");
			
			Student student = new Student(1001,"라팡",100,90,80,hobby);
			
		return student;
	}
	
	
}
