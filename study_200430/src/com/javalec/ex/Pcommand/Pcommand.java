package com.javalec.ex.Pcommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Pcommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response);
	
	
}
