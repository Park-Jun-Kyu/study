package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

public class Server implements InitializingBean, DisposableBean, Environment {
	
	
	Environment env;
	String name;
	String number;
	

	
	
	public void env(Environment env) {
		
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

	public boolean containsProperty(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProperty(String key, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getProperty(String key, Class<T> targetType) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getProperty(String key, Class<T> targetType, T defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getRequiredProperty(String key) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getRequiredProperty(String key, Class<T> targetType) throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	public String resolvePlaceholders(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	public String resolveRequiredPlaceholders(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getActiveProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getDefaultProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean acceptsProfiles(String... profiles) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean acceptsProfiles(Profiles profiles) {
		// TODO Auto-generated method stub
		return false;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("끝에 destory 실행");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("after 실행");
		setName(env.getProperty("name"));
		setNumber(env.getProperty("number"));

	}

}
