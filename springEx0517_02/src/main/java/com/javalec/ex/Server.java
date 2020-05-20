package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Server implements DisposableBean, InitializingBean, EnvironmentAware {

	Environment env;
	String namae;
	int number;
	
	
	
	
	
	public void setEnvironment(Environment env) {
		setEnv(env);

	}
	
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getNamae() {
		return namae;
	}

	public void setNamae(String namae) {
		this.namae = namae;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("after 시작");
		System.out.println(env.getProperty("name"));
		System.out.println(env.getProperty("number"));

	}

	public void destroy() throws Exception {
				System.out.println("destory 끝");
	}

}
