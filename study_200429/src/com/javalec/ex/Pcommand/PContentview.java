package com.javalec.ex.Pcommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PContentview implements Pcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int pId = Integer.parseInt(request.getParameter("pId"));
		System.out.println("PContentview"+pId);
		PDao dao = new PDao();
		PDto dto = dao.contentview(pId);
		request.setAttribute("content_view", dto);
		

	}

}
