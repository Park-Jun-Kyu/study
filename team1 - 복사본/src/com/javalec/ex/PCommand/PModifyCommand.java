package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;

public class PModifyCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int pId = Integer.parseInt(request.getParameter("pId"));
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		
		PDao dao = new PDao();
		dao.modify(pId, pTitle, pContent);
		

	}

}
