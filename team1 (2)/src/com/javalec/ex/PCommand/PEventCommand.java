package com.javalec.ex.PCommand;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.PDao.PDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import oracle.net.aso.d;

public class PEventCommand implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
			String Path = "D:/upload";
			int size = 10*1024*1024;
			String name = "";
			String subject = "";
			String filename1 = "";
			String filename2 = "";
			PDao dao = new PDao();
		
			
			try {
				MultipartRequest multi = new MultipartRequest(request,Path,size,"utf-8",
				new DefaultFileRenamePolicy());
				
				
				String eName = multi.getParameter("eName");
				String eTitle = multi.getParameter("eTitle");
				String eContent = multi.getParameter("eContent");
				
				
				
				Enumeration files = multi.getFileNames();
				String file1 = (String)files.nextElement();
				filename1 = multi.getFilesystemName(file1);
				
				dao.eventwrite(eName, eTitle, eContent, filename1);
						
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
