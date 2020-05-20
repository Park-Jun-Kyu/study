package com.javalec.ex.Pfront;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.Pcommand.PListcommand;
import com.javalec.ex.Pcommand.Pcommand;


@WebServlet("*.do")
public class Pfront extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Pfront() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet으로 들어옴");
		actionDo(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost으로 들어옴");
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pageView = null;
		Pcommand pcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
	
		if(com.equals("/list.do")) {
			pcom= new PListcommand();
			pcom.execute(request, response);
			pageView = "list.jsp";
			
		}
		
		
	}

}
