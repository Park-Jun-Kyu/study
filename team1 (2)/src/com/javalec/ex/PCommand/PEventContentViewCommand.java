package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.EventDto.EventDto;
import com.javalec.ex.PDao.PDao;

public class PEventContentViewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int eId = Integer.parseInt(request.getParameter("eId"));
		PDao dao = new PDao();
		EventDto edto = dao.event_contentView(eId);
		
		request.setAttribute("event_contentView", edto);
		

	}

}
