package com.javalec.ex;

import java.io.IOException;

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
		MutablePropertySources properySources = env.getPropertySources();
		
		
			try {
				properySources.addLast(new ResourcePropertySource("classpath:server.properties"));
				System.out.println(env.getProperty("auth"));
				System.out.println(env.getProperty("driverClassName"));
				System.out.println(env.getProperty("url"));
				System.out.println(env.getProperty("username"));
				System.out.println(env.getProperty("password"));
				System.out.println(env.getProperty("name"));
				System.out.println(env.getProperty("type"));
				System.out.println(env.getProperty("maxActive"));
				System.out.println(env.getProperty("maxWait"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("----------------------------------------------");
		
			GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
			ctx2.load("appCTX.xml");
			ctx2.refresh();
			
			ServerConn serverConn = ctx2.getBean("serverConn",ServerConn.class);
			System.out.println("auth :"+ serverConn.getAuth());
			System.out.println("driverClassName :"+serverConn.getDriverClassName());
			System.out.println("url :" + serverConn.getUrl());
			System.out.println("username :" + serverConn.getUsername());
			System.out.println("password :" + serverConn.getPassword());
			System.out.println("name :" + serverConn.getName());
			System.out.println("type :" + serverConn.getType());
			System.out.println("maxActive :" + serverConn.getMaxActive());
			System.out.println("maxWait :" + serverConn.getMaxWait());
			
			ctx2.close();
			ctx.close();
			
			
	}

}
