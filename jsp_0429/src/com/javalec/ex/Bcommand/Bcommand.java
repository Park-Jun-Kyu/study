package com.javalec.ex.Bcommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Bcommand {
	//메소드 execute 선언
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
