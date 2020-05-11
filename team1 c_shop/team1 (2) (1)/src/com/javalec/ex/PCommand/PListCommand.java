package com.javalec.ex.PCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.javalec.ex.PDto.PDto;

public class PListCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

			int page = 1;
			int limit = 10;
			String searchflag=request.getParameter("searchflag");
			
			String opt = request.getParameter("opt");
			String search = request.getParameter("search");
			
			if(opt == null) {
				opt = "";
				
			}
			
			if(search == null) {
				
				search = "";
			}
			
			
		
				if(request.getParameter("page")!=null) {
					page = Integer.parseInt(request.getParameter("page"));
					
				}
			
				PDao dao = new PDao();
				ArrayList<PDto> list = dao.list(page, limit, opt, search);
				
				int listcount = dao.getlistcount(opt, search);
				int maxpage = (int)((double)listcount/limit+0.95);
				int startpage = ((int)((double)page/10+0.9)-1)*10+1;
				
				int endpage = maxpage;
				if(endpage>startpage+10-1) endpage=startpage+10-1;
				
				
				request.setAttribute("list", list);
				
				request.setAttribute("listcount", listcount);
				request.setAttribute("page", page);
				request.setAttribute("maxpage", maxpage);
				request.setAttribute("startpage", startpage);
				request.setAttribute("endpage", endpage);
				
				if(search!="") {
					searchflag = "1";
					request.setAttribute("searchflag", searchflag);
					request.setAttribute("opt", opt);
					request.setAttribute("search", search);
					
				}
		
		
	}

}
