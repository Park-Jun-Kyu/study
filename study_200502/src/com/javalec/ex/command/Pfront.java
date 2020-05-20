package com.javalec.ex.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("*.do")
public class Pfront extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public Pfront() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			actionDo(request, response);
			System.out.println("doGet으로 들어옴");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			actionDo(request, response);
			System.out.println("doPost로 들어옴");
	
	}
	

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			System.out.println("actionDo로 들어옴");
			request.setCharacterEncoding("utf-8");
			
			String pageView = null;
			Pcommand pcom = null;
			
			
			String uri = request.getRequestURI();
			String conPath = request.getContextPath();
			String com = uri.substring(conPath.length());
			
			if(com.equals("/list.do")){
				pcom = new PListcommand();
				pcom.execute(request, response);
				pageView = "list.jsp";
				
			}else if(com.equals("/content_view.do")) {
				pcom = new PContnetcommand();
				pcom.execute(request, response);
				pageView = "content_view.jsp";
				
			}else if(com.equals("/write.do")) {
				pcom = new PWritecommand();
				pcom.execute(request, response);
				pageView = "write_view.do";
				
				
			}else if(com.equals("/write_view.do")) {
				pageView = "write_view.do";
				
				
			}
	
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
			dispatcher.forward(request, response);
			
			
			
			
	
	}

	}
