package com.javalec.ex;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configurable
public class Info {
	@Value("${name}")
	private String name;
	@Value("${number}")
	private String number;
	
	
	
	
	
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		
		
		Resource [] location = new Resource[2];
		location[0] = new ClassPathResource("server1");
		location[1] = new ClassPathResource("server2");
		
		
		configurer.setLocations(location);
		
		return configurer;
		
	}
	
	
	
	@Bean
	public Student student() {
		Student student = new Student();
		System.out.println(name);
		System.out.println(number);
		
		return student;
		
		
	}
	
	
	
	
	
	
	
}
