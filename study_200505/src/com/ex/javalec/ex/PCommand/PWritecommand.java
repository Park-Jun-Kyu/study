package com.ex.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.javalec.ex.PDao.PDao;
import com.ex.javalec.ex.PDto.PDto;

public class PWritecommand implements PCommand {

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
