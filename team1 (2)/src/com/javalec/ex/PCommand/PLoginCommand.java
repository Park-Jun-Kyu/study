package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.memberDto.MemberDto;

public class PLoginCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
			String mId = request.getParameter("mId");
			String mPw = request.getParameter("mPw");
			PDao dao = new PDao();
			
			int count = dao.member_login(mId, mPw);
			
			if(count == 1) {
				HttpSession session = request.getSession();
				session.setAttribute("mId", mId);
				System.out.println("입력완료");
				
				
			}else if(count == 0){
				System.out.println("다시입력");
				
			}
			
			
		

	}

}
