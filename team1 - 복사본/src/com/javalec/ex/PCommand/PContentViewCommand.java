package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PContentViewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
				int pId = Integer.parseInt(request.getParameter("pId"));
				PDao dao = new PDao();
				PDto dto = dao.contentview(pId);
				
				request.setAttribute("my_notice2", dto);
				
		

	}

}
