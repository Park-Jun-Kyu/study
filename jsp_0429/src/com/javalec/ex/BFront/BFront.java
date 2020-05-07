package com.javalec.ex.BFront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.Bcommand.BContentviewcommand;
import com.javalec.ex.Bcommand.BListcommand;
import com.javalec.ex.Bcommand.BMoidfycommand;
import com.javalec.ex.Bcommand.BMoidfyviewcommand;
import com.javalec.ex.Bcommand.Bcommand;

import sun.security.util.Length;


@WebServlet("*.do")
public class BFront extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BFront() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget으로 들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost로 들어옴");
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo로 들어옴");
		request.setCharacterEncoding("utf-8");
		
		String pageView = null;
		Bcommand bcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/list.do")) {
			bcom = new BListcommand();
			bcom.execute(request, response);
			pageView = "list.jsp";
			
		}else if(com.equals("/content_view.do")) {
			bcom = new BContentviewcommand();
			bcom.execute(request, response);
			pageView = "content_view.jsp";
		}else if(com.equals("/modify_view.do")) {
			bcom = new BMoidfyviewcommand();
			bcom.execute(request, response);
			pageView = "modify_view.jsp";
		}else if(com.equals("/modify.do")) {
			bcom = new BMoidfycommand(); 
			bcom.execute(request, response);
			pageView = "list.do";
				
		}else if(com.equals("/search.do")) {
			bcom = new BListcommand();
			bcom.execute(request, response);
			pageView = "list.jsp";
			
		}
		
		
		
		
		
		
		
//			else if(com.equals("/write.do")){
//			bcom = new BWritecommand();
//			bcom.execute(request, response);
//			pageView = "write.do";
//		}else if(com.equals("/write_view.do")) {
//			bcom = new BWriteViewcommand();
//			bcom.execute(request, response);
//			pageView = "write_view.jsp";
//			
//		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
	}

}
