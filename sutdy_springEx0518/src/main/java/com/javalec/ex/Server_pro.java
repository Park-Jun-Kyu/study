package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Server_pro implements EnvironmentAware, InitializingBean, DisposableBean {

	
	Environment env;
	String name;
	String number;
	
	
	
	public void destroy() throws Exception {
		System.out.println("끝!");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("시작");
		System.out.println(env.getProperty("name"));
		System.out.println(env.getProperty("number"));

	}

	public void setEnvironment(Environment env) {
		setEnv(env);

	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
