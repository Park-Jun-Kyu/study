package com.ex.javalec.ex;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.javalec.ex.PCommand.PCommand;
import com.ex.javalec.ex.PCommand.PContentviewcommand;
import com.ex.javalec.ex.PCommand.PListCommand;
import com.ex.javalec.ex.PCommand.PModifyCommand;
import com.ex.javalec.ex.PCommand.PModifyviewCommand;
import com.ex.javalec.ex.PCommand.PWritecommand;


@WebServlet("*.do")
public class Pfront extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Pfront() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget으로 들어옴");
		actionDo(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost으로 들어옴");
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo으로 들어옴");
		request.setCharacterEncoding("utf-8");
	
	
		String pageView = null;
		PCommand pcom = null;
		
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/list.do")) {
			pcom = new PListCommand();
			pcom.execute(request, response);
			pageView = "list.jsp";
			
			
		}else if(com.equals("/content_view.do")) {
			pcom = new PContentviewcommand();
			pcom.execute(request, response);
			pageView = "content_view.jsp";
			
		}else if(com.equals("/write.do")) {
			pcom = new PWritecommand();
			pcom.execute(request, response);
			pageView = "write_view.jsp";
			
			
		}else if(com.equals("/write_view.do")) {
			pageView = "list.jsp";
			
			
		}else if(com.equals("/modify_view.do")) {
			pcom = new PModifyviewCommand();
			pcom.execute(request, response);
			pageView = "modify_view.jsp";
			
		}else if(com.equals("/modify.do")) {
			pcom = new PModifyCommand();
			pcom.execute(request, response);
			pageView = "list.do";
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
		
	
	
	}
	

}
