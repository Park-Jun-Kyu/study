package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;

public class PReplyCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		int pId = Integer.parseInt(request.getParameter("pId"));
		String pName = request.getParameter("pName");
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		int pGroup = Integer.parseInt(request.getParameter("pGroup"));
		int pStep = Integer.parseInt(request.getParameter("pStep"));
		int pIndent = Integer.parseInt(request.getParameter("pIndent"));
		
		PDao dao = new PDao();
		
		dao.reply(pId, pName, pTitle, pContent, pGroup, pStep, pIndent);
		
	}

}
