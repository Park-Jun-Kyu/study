package com.javalec.ex.PCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;

public class PJoinCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");
		String mName = request.getParameter("mName");
		String mEmail1 = request.getParameter("mEmail1");
		String mEmail2 = request.getParameter("mEmail2");
		String mEmail3 = request.getParameter("mEmail3");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String birth1 = request.getParameter("birth1");
		String birth2 = request.getParameter("birth2");
		String birth3 = request.getParameter("birth3");
		String birth4 = request.getParameter("birth4");
		String gender = request.getParameter("gender");
		String news = request.getParameter("news");
		String sms = request.getParameter("sms");
		String mNum1 = request.getParameter("mNum1");
		String mNum2 = request.getParameter("mNum2");
		String mJob = request.getParameter("mJob");
		String marry = request.getParameter("marry");
		String mHobby = request.getParameter("mHobby");
		
		
		PDao dao = new PDao();
		
		dao.join(mId, mPw, mName, mEmail1, mEmail2, mEmail3, address1, address2, address3, address4, phone1, phone2, phone3, birth1, birth2, birth3, birth4, gender, news, sms, mNum1, mNum2, mJob, marry, mHobby);
		
	}

}
