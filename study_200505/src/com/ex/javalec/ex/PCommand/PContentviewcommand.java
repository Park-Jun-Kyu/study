package com.ex.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.javalec.ex.PDao.PDao;
import com.ex.javalec.ex.PDto.PDto;

public class PContentviewcommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
			int pId = Integer.parseInt(request.getParameter("pId"));
			PDao dao = new PDao();
			PDto dto = dao.contentview(pId);
			request.setAttribute("content_view", dto);
		
		
		

	}

}
