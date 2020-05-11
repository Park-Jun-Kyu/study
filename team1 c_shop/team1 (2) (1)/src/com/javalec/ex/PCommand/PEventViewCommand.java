package com.javalec.ex.PCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.EventDto.EventDto;
import com.javalec.ex.PDao.PDao;
import com.javalec.ex.memberDto.MemberDto;

public class PEventViewCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	
		PDao dao = new PDao();
		ArrayList<EventDto> edto = dao.eventViewList();
		
		request.setAttribute("eventList", edto);

		
		
	}

}
