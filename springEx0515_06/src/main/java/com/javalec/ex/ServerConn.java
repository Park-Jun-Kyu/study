package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class ServerConn implements InitializingBean, DisposableBean, EnvironmentAware {
	
	Environment env;
	String auth;
	String driverClassName;
	String url;
	String username;
	String password;
	String name;
	String type;
	String maxActive;
	String maxWait;
	
	public void setEnvironment(Environment env) {
		setEnv(env);

	}
	
	
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(String maxActive) {
		this.maxActive = maxActive;
	}

	public String getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(String maxWait) {
		this.maxWait = maxWait;
	}



	public void destroy() throws Exception {

		System.out.println("ServerConn 실행시 destroy 실행");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("SeverConn 실행시 init 실행");
		setAuth(env.getProperty("auth"));
		setDriverClassName(env.getProperty("driverClassName"));
		setUrl(env.getProperty("url"));
		setUsername(env.getProperty("username"));
		setPassword(env.getProperty("password"));
		setName(env.getProperty("name"));
		setType(env.getProperty("type"));
		setMaxActive(env.getProperty("maxActive"));
		setMaxWait(env.getProperty("maxWait"));
	}

}
