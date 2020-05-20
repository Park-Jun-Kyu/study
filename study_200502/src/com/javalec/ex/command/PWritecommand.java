package com.javalec.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PWritecommand implements Pcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String pName = request.getParameter("pName");
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		
		
		PDao dao = new PDao();
		
		int check = dao.write(pName, pTitle, pContent);
		
	}

}
