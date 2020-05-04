package com.javalec.ex.Pcommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PListcommand implements Pcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		PDao dao = new PDao();
		ArrayList<PDto> list = dao.list();
		request.setAttribute("list", list);
		
		
		

	}

}
