package com.javalec.ex.Pfront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PCommand.PCommand;
import com.javalec.ex.PCommand.PContentViewCommand;
import com.javalec.ex.PCommand.PDeleteCommand;
import com.javalec.ex.PCommand.PEventCommand;
import com.javalec.ex.PCommand.PEventContentViewCommand;
import com.javalec.ex.PCommand.PEventViewCommand;
import com.javalec.ex.PCommand.PJoinCommand;
import com.javalec.ex.PCommand.PListCommand;
import com.javalec.ex.PCommand.PLoginCommand;
import com.javalec.ex.PCommand.PModifyCommand;
import com.javalec.ex.PCommand.PModifyViewCommand;
import com.javalec.ex.PCommand.PReplyCommand;
import com.javalec.ex.PCommand.PReplyViewCommand;
import com.javalec.ex.PCommand.PWriteCommand;


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
		System.out.println("actionDo로 들어옴");
	
		
		request.setCharacterEncoding("utf-8");
		
		
		String pageView = null;
		PCommand pcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/my_notice.do")) {
			pcom = new PListCommand();
			pcom.execute(request, response);
			pageView = "my_notice.jsp";
			
		}else if(com.equals("/my_notice2.do")) {
			pcom = new PContentViewCommand();
			pcom.execute(request, response);
			pageView = "my_notice2.jsp";
			
			
		}else if(com.equals("/write_view.do")) {
			
			pageView = "write_view.jsp";
			
		}else if(com.equals("/write.do")) {
			pcom = new PWriteCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
		
		}else if(com.equals("/delete.do")) {
			pcom = new PDeleteCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		}else if(com.equals("/modify_view.do")) {
			pcom = new PModifyViewCommand();
			pcom.execute(request, response);
			pageView = "modify_view.jsp";
			
		}else if(com.equals("/modify.do")) {
			pcom = new PModifyCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		
		}else if(com.equals("/join.do")) {
			pcom = new PJoinCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		}else if(com.equals("/login.do")) {
			pcom = new PLoginCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		}else if(com.equals("/reply_view.do")) {
			pcom = new PReplyViewCommand();
			pcom.execute(request, response);
			pageView = "reply_view.jsp";
			
		}else if(com.equals("/reply.do")) {
			pcom = new PReplyCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		}else if(com.equals("/search.do")) {
			pcom = new PListCommand();
			pcom.execute(request, response);
			pageView = "my_notice.do";
			
		}else if(com.equals("/PEventCommand.do")) {	
			pcom = new PEventCommand();
			pcom.execute(request, response);
			pageView = "PEventViewCommand.do";
			
		}else if(com.equals("/PEventViewCommand.do")) {
			pcom = new PEventViewCommand();
			pcom.execute(request, response);
			pageView = "eventList.jsp";
			
		}else if(com.equals("/PEventContentViewCommand.do")) {
			pcom = new PEventContentViewCommand();
			pcom.execute(request, response);
			pageView = "eventView.jsp";
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
			
		
	}

}
