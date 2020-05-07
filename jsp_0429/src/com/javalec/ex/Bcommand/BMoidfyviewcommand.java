package com.javalec.ex.Bcommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BMoidfyviewcommand implements Bcommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		BDao dao = new BDao();
		BDto dto = dao.modify_view(bId);
		
		request.setAttribute("modify_view", dto);

	}

}
