package com.javalec.ex;

import org.apache.log4j.lf5.util.Resource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySoruces = env.getPropertySources();
		
		
		try {
			propertySoruces.addLast(new ResourcePropertySource("classpath:server.property"));
			System.out.println(env.getProperty("name"));
			System.out.println(env.getProperty("number"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appTML.xml");
		ctx2.refresh();
		
		Server server = ctx2.getBean("Server",Server.class);
		System.out.println(server.getNamae());
		System.out.println(server.getNumber());
		
		ctx2.close();
		ctx.close();
		
		

	}

}
