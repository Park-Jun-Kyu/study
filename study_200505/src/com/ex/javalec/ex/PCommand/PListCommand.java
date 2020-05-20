package com.ex.javalec.ex.PCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.javalec.ex.PDao.PDao;
import com.ex.javalec.ex.PDto.PDto;

public class PListCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			
			
			PDao dao = new PDao();
			ArrayList<PDto> list = dao.list();
			
			request.setAttribute("list", list);
			

	}

}
