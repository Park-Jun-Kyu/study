package com.javalec.ex.Pcommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;

public class PModifycommand implements Pcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int pId = Integer.parseInt(request.getParameter("pId"));
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		
		PDao dao = new PDao();
		int check = dao.modify(pId, pTitle, pContent);
		
	}

}
