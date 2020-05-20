package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:server.se"));
			System.out.println(env.getProperty("name"));
			System.out.println(env.getProperty("number"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		
		ctx2.load("Server_con.xml");
		ctx2.refresh();
		
		
		Server_pro server_pro = ctx2.getBean("server_pro",Server_pro.class);
		System.out.println(server_pro.getName());
		System.out.println(server_pro.getNumber());
		
		ctx2.close();
		ctx.close();
		
		
		
		
		
		
		
		
	}
	
	

}
