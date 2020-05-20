package com.ex.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.javalec.ex.PDao.PDao;
import com.ex.javalec.ex.PDto.PDto;

public class PModifyviewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		int pId = Integer.parseInt(request.getParameter("pId"));
		PDao dao = new PDao();
		PDto dto = dao.modify_view(pId);
		
		request.setAttribute("modify_view", dto);
		

	}

}
