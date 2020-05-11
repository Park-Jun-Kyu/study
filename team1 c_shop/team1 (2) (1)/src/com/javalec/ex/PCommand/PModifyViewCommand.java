package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PModifyViewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
			int pId = Integer.parseInt(request.getParameter("pId"));
			PDao dao = new PDao();
			PDto dto = dao.Modify_view(pId);
			request.setAttribute("modify_view", dto);
			
	}

}
