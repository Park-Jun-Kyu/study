package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import com.sun.jmx.remote.internal.ServerCommunicatorAdmin;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:Sever11"));
			System.out.println(env.getProperty("name"));
			System.out.println(env.getProperty("number"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("--------------------------------------");
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appTML.xml");
		ctx2.refresh();
		
		
		Server server = ctx2.getBean("server",Server.class);
		System.out.println(server.getName());
		System.out.println(server.getNumber());
		
		ctx.close();
		ctx2.close();
		
		
		
		
		
		
	}
}
