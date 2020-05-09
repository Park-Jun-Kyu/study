package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PReplyViewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int pId = Integer.parseInt(request.getParameter("pId"));
		PDao dao = new PDao();
		PDto dto = dao.reply_view(pId);
		
		request.setAttribute("reply_view", dto);
		

	}

}
