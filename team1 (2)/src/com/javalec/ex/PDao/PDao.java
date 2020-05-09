package com.javalec.ex.PDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.javalec.ex.EventDto.EventDto;
import com.javalec.ex.PDto.PDto;

import com.javalec.ex.memberDto.MemberDto;

public class PDao {

	
	Connection con = null;
	ResultSet rs= null;
	Context context = null;
	PreparedStatement pstmt = null;
	DataSource ds = null;
	String sql;
	PDto dto = new PDto();
	ArrayList<PDto> list = new ArrayList<PDto>();
	
	ArrayList<EventDto> list_event = new ArrayList<EventDto>();
	
	

	String eTitle, eName,eContent,eFile;
	Timestamp eDate;
	String pName,pTitle,pContent;
	int pId,pHit,pGroup,pStep,pIndent,eHit,eId;
	Timestamp pDate;
	String mId,mPw,mName,mEmail1,mEmail2,mEmail3,address1,address2, address3,address4,phone1,phone2,phone3,birth1,birth2,
	birth3,birth4,gender,news,sms,mNum1,mNum2,mJob,marry,mHobby;
	
	
	EventDto edto = new EventDto();
	MemberDto mdto = new MemberDto();
	
	int tId,tHit;
	String tName,tTitle,tContent,tFile;
	Timestamp tDate;
	
	
	
	
	public PDao() {
		
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<PDto> list(int page,int limit,String opt,String search){
		
		
		
		int startrow = (page-1)*10+1;
		int endrow = startrow+limit-1;
		System.out.println(opt);
		System.out.println(search);
		
		switch (opt) {
		case "":
			sql = "select * from (select rownum rnum, pId,pName,pTitle,pContent,pDate,pHit,pGroup,pStep,pIndent from"
					+ "(select * from team_board order by pGroup desc, pId asc)) where rnum>=? and rnum<=?";
			
			break;
		case "all":
			sql = "select * from (select rownum rnum, pId,pName,pTitle,pContent,pDate,pHit,pGroup,pStep,pIndent from"
					+ "(select * from team_board where pTitle like '%'||?||'%' or pContent like '%'||?||'%' order by pGroup desc, pId asc )) where rnum>=? and rnum<=?";		
			
			break;
			
		case "tit":
			sql = "select * from (select rownum rnum , pId,pName,pTitle,pContent,pDate,pHit,pGroup,pStep,pIndent from"
					+"(select * from team_board where pTitle like '%'||?||'%' order by pGroup desc , pId asc)) where rnum>=? and rnum<=?";
			break;
			
		case "con":
			sql = "select * from (select rownum rnum , pId,pName,pTitle,pContent,pDate,pHit,pGroup,pStep,pIndent from"
					+"(select * from team_board where pContent like '%'||?||'%' order by pGroup desc , pId asc)) where rnum>=? and rnum<=?";
			
			break;

		}
		
		
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			
			if(opt.equals("all")) {
				pstmt.setString(1, search);
				pstmt.setString(2, search);
				pstmt.setInt(3, startrow);
				pstmt.setInt(4, endrow);
			}
			else if(opt.equals("tit") || opt.equals("con")) {
				pstmt.setString(1, search);
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
			}else {
				pstmt.setInt(1, startrow);
				pstmt.setInt(2, endrow);
				
			}
			
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pId = rs.getInt("pId");
				pName = rs.getString("pName");
				pTitle = rs.getString("pTitle");
				pContent = rs.getString("pContent");
				pDate = rs.getTimestamp("pDate");
				pHit = rs.getInt("pHit");
				pGroup = rs.getInt("pGroup");
				pStep = rs.getInt("pStep");
				pIndent = rs.getInt("pIndent");
				
				dto = new PDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
				
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	public int getlistcount(String opt,String search) {
		
		int count = 0;
		System.out.println(opt);
		System.out.println(search);
		
		switch (opt) {
		
		case "":
			sql = "select count(*) as count from team_board";
			
			
			break;
			
		case "all":
			
			sql = "select count(*) as count from team_board where pTitle like '%'||?||'%' or pContent like '%'||?||'%' ";
			
					
			break;
		case "tit":
			sql = "select count(*) as count from team_board where pTitle like '%'||?||'%'";
			
			break;
		case "con":
			sql = "select count(*) as count from team_board where pContent like '%'||?||'%'";
			
			break;

		default:
			break;
		}
		
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			
			if(opt.equals("all")) {
				pstmt.setString(1, search);
				pstmt.setString(2, search);
				
				
			}else if(opt.equals("tit") || opt.equals("con")){
				pstmt.setString(1, search);
				
			}
			
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("count");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return count;
	}
	
	
	
	
	
	
	public PDto contentview(int pId) {
		
		upHit(pId);
		
		sql = "select * from team_board where pId=?";
		
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pId = rs.getInt("pId");
				pName = rs.getString("pName");
				pTitle = rs.getString("pTitle");
				pContent = rs.getString("pContent");
				pDate = rs.getTimestamp("pDate");
				pHit = rs.getInt("pHit");
				pGroup = rs.getInt("pGroup");
				pStep = rs.getInt("pStep");
				pIndent = rs.getInt("pIndent");
				
				dto = new PDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
	public void write(String pName,String pTitle,String pContent) {
		
		
		
		sql = "insert into team_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,mvc_board_seq.currval,0,0)";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pName);
			pstmt.setString(2, pTitle);
			pstmt.setString(3, pContent);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
	
	}
	
	
	public void delete(int pId) {
		
		sql = "delete team_board where pId=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pId);
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
		
	}
	
	
	public void modify(int pId,String pTitle,String pContent ) {
		
		sql = "update team_board set pTitle=? , pContent=? where pId=?";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pTitle);
			pstmt.setString(2, pContent);
			pstmt.setInt(3, pId);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
	}
	
	
	
	public PDto Modify_view(int pId) {
		
		sql = "select * from team_board where pId=?";
		
		try {
			
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pId = rs.getInt("pId");
				pName = rs.getString("pName");
				pTitle = rs.getString("pTitle");
				pContent = rs.getString("pContent");
				pDate = rs.getTimestamp("pDate");
				pHit = rs.getInt("pHit");
				pGroup = rs.getInt("pGroup");
				pStep = rs.getInt("pStep");
				pIndent = rs.getInt("pIndent");
				
				dto = new PDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
		return dto;
	}
	
	
	public void upHit(int pId) {
		
		sql = "update team_board set pStep=pStep+1 where pId=?";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pId);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
		
		
	}
	public int member_login(String mId,String mPw) {
		int count=0;
		
		sql = "select count(*) count from team_member where mId=? and mPw=?";
		
		
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, mId);
			pstmt.setString(2, mPw);
				
			
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("count");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void join(String mId,String mPw,String mName,String mEmail1,String mEmail2,String mEmail3,String address1,String address2,String address3,
			String address4,String phone1,String phone2,String phone3,String birth1,String birth2,String birth3,String birth4,
			String gender,String news,String sms,String mNum1,String mNum2,String mJob,String marry,String mHobby) {

	sql = "insert into team_member values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mId);
			pstmt.setString(2, mPw);
			pstmt.setString(3, mName);
			pstmt.setString(4, mEmail1);
			pstmt.setString(5, mEmail2);
			pstmt.setString(6, mEmail3);
			pstmt.setString(7, address1);
			pstmt.setString(8, address2);
			pstmt.setString(9, address3);
			pstmt.setString(10, address4);
			pstmt.setString(11, phone1);
			pstmt.setString(12, phone2);
			pstmt.setString(13, phone3);
			pstmt.setString(14, birth1);
			pstmt.setString(15, birth2);
			pstmt.setString(16, birth3);
			pstmt.setString(17, birth4);
			pstmt.setString(18, gender);
			pstmt.setString(19, news);
			pstmt.setString(20, sms);
			pstmt.setString(21, mNum1);
			pstmt.setString(22, mNum2);
			pstmt.setString(23, mJob);
			pstmt.setString(24, marry);
			pstmt.setString(25, mHobby);
			
			pstmt.executeUpdate();
			System.out.println(mId);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
	}//join
	
	
	public PDto reply_view(int pId) {
		
		sql = "select * from team_board where pId=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				pId = rs.getInt("pId");
				pName = rs.getString("pName");
				pTitle = rs.getString("pTitle");
				pContent = rs.getString("pContent");
				pDate = rs.getTimestamp("pDate");
				pHit = rs.getInt("pHit");
				pGroup = rs.getInt("pGroup");
				pStep = rs.getInt("pStep");
				pIndent = rs.getInt("pIndent");
				
				dto = new PDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		return dto;
	}
	
	
	public void reply(int pId,String pName,String pTitle,String pContent,int pGroup,int pStep,int pIndent) {
		
		replyshape(pGroup,pStep);
		
		sql = "insert into team_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,?,?,?)";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pName);
			pstmt.setString(2, pTitle);
			pstmt.setString(3, pContent);
			pstmt.setInt(4, pGroup);
			pstmt.setInt(5, pStep+1);
			pstmt.setInt(6, pIndent+1);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		
	}
	
	public void replyshape(int pGroup,int pStep) {
		
		sql = "update team_board set pStep=pStep+1 where pGroup=? and pStep=?";
		
		try {
			con= ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pGroup);
			pstmt.setInt(2, pStep);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		
		}
	}
	
	
	public void eventwrite(String eName,String eTitle,String eContent,String file1) {
		
		sql = "insert into event_board values(pang_seq.nextval,?,?,?,sysdate,0,?)";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, eName);
			pstmt.setString(2, eTitle);
			pstmt.setString(3, eContent);
			pstmt.setString(4, file1);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	public ArrayList<EventDto> eventViewList() {
		
		sql = "select * from event_board";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				eId = rs.getInt("eId");
				eName = rs.getString("eName");
				eTitle = rs.getString("eTitle");
				eContent = rs.getString("eContent");
				eDate = rs.getTimestamp("eDate");
				eHit = rs.getInt("eHit");
				eFile = rs.getString("eFile");
				
				edto = new EventDto(eId, eName, eTitle, eContent, eDate, eId, eFile);
				
				list_event.add(edto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list_event;
	}
	
	
	
	public EventDto event_contentView(int eId) {
		
		sql = "select * from event_board where eId=?";
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, eId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				eId = rs.getInt("eId");
				eName = rs.getString("eName");
				eTitle = rs.getString("eTitle");
				eContent = rs.getString("eContent");
				eDate = rs.getTimestamp("eDate");
				eHit = rs.getInt("eHit");
				eFile = rs.getString("eFile");
				
				edto = new EventDto(eId, eName, eTitle, eContent, eDate, eId, eFile);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return edto;
	}
	
	
	
	
	
}
