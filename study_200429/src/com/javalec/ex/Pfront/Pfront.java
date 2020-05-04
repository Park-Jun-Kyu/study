package com.javalec.ex.Pfront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.Pcommand.PContentview;
import com.javalec.ex.Pcommand.PListcommand;
import com.javalec.ex.Pcommand.PModifycommand;
import com.javalec.ex.Pcommand.PModifyviewcommand;
import com.javalec.ex.Pcommand.PReplycommand;
import com.javalec.ex.Pcommand.PReplyviewcommand;
import com.javalec.ex.Pcommand.PWritecommand;
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
		System.out.println("actionDo로 들어옴");
		String pageView = null;
		Pcommand pcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
	
		if(com.equals("/list.do")) {
			pcom= new PListcommand();
			pcom.execute(request, response);
			pageView = "list.jsp";
			
		}else if(com.equals("/content_view.do")) {
			pcom = new PContentview();
			pcom.execute(request, response);
			pageView = "content_view.jsp";
			
		}else if(com.equals("/write.do")){
			pcom = new PWritecommand();
			pcom.execute(request, response);
			pageView = "write_view.do";
		}else if(com.equals("/write_view.do")) {
			
			pageView = "write_view.do";
			
			
		}else if(com.equals("/modify_view.do")) {
			pcom = new PModifyviewcommand();
			pcom.execute(request, response);
			pageView = "modify_view.jsp";
			
		}else if(com.equals("/modify.do")) {
			pcom = new PModifycommand();
			pcom.execute(request, response);
			pageView = "list.do";
			
		}else if(com.equals("/reply_view.do")) {
			pcom = new PReplyviewcommand();
			pcom.execute(request, response);
			pageView = "reply_view.jsp";
			
		}else if(com.equals("/reply.do")) {
			pcom = new PReplycommand();
			pcom.execute(request, response);
			pageView = "list.do";
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
		
		
	}

}
