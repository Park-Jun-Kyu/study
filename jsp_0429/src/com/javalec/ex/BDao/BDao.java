package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.BDto.BDto;

public class BDao {
	//생성자
		
	Context context = null;
	DataSource ds = null;
	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	BDto dto = new BDto();
	ArrayList<BDto> list = new ArrayList<BDto>();
	
	
	
	
	int bId,bHit,bGroup,bStep,bIndent;
	String bName,bTitle,bContent;
	Timestamp bDate;
	
	
		public BDao() {
			
			try {
				context = new InitialContext();
				ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
				
		}
		///전체 select
		public ArrayList<BDto> list(int page,int limit,String opt,String search) {
			
			
			int startrow=(page-1)*10+1;
			int endrow = startrow+limit-1;
			System.out.println(opt);
			System.out.println(search);
			
			switch (opt) {
			case "":
				
			sql ="select * from "
				+ "(select rownum rnum, bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from"
				+ "(select * from mvc_board order by bgroup desc, bid asc)) where rnum>=? and rnum<=?";
				break;
			
			case "all":
			sql =	"select * from (select rownum rnum, bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from (select * from mvc_board where btitle like '%'||?||'%'  or bcontent like '%'||?||'%'  order by bgroup desc, bid asc)) where rnum>=? and rnum<=?";
				break;
						
			case "tit":
			sql =	"select * from "
				+ "(select rownum rnum, bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from"
				+ "(select * from mvc_board where btitle like '%'||?||'%'  order by bgroup desc, bid asc)) where rnum>=? and rnum<=?";
				break;	
				
			case "con":
			sql =	"select * from "
				+ "(select rownum rnum, bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from"
				+ "(select * from mvc_board where bcontent like '%'||?||'%' order by bgroup desc, bid asc)) where rnum>=? and rnum<=?";
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
					
				}else if(opt.equals("tit") || opt.equals("con")){
					pstmt.setString(1, search);
					pstmt.setInt(2, startrow);
					pstmt.setInt(3, endrow);
				}else {
					pstmt.setInt(1, startrow);
					pstmt.setInt(2, endrow);
				}
				

				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					
					bId = rs.getInt("bId");
					bName = rs.getString("bName");
					bTitle = rs.getString("bTitle");
					bContent = rs.getString("bContent");
					bDate = rs.getTimestamp("bDate");
					bHit = rs.getInt("bHit");
					bGroup = rs.getInt("bGroup");
					bStep = rs.getInt("bStep");
					bIndent = rs.getInt("bIndent");
					
					dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
					
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
			
			
			
			
		
		public int getlistCount(String opt,String search) {
			int count = 0;
			
			
			switch (opt) {
			case "":
				sql="select count (*) as count from mvc_board";
				break;
			
			case "all":
				sql="select count (*) as count from mvc_board where btitle like '%'||?||'%' or bcontent like '%'||?||'%'";
				break;
					
			case "tit":
				sql="select count (*) as count from mvc_board where btitle like '%'||?||'%'";
				break;	
				
			case "con":
				sql="select count (*) as count from mvc_board where bcontent like '%'||?||'%'";
				break;
				
				
			default:
				break;
			}

			System.out.println(count+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	
			
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
					count= rs.getInt("count");
				}
				
				System.out.println(count+"ddddddddddddddddddddddddddddddddddddddd");
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(con!=null)con.close();
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		
			return count;
		}
		
		
		
		
		
		
		public BDto contentview(int bId) {
			
			sql = "select * from mvc_board where bId=?";
			
			
			try {
				
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bId);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					bId = rs.getInt("bId");
					bName = rs.getString("bName");
					bTitle = rs.getString("bTitle");
					bContent = rs.getString("bContent");
					bDate = rs.getTimestamp("bDate");
					bHit = rs.getInt("bHit");
					bGroup = rs.getInt("bGroup");
					bStep = rs.getInt("bStep");
					bIndent = rs.getInt("bIndent");
					
					dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
					
					list.add(dto);
					
					
					
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
				if(con!=null)con.close();
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
			
			}
			
			
			return dto;
		}
		
		
		
		public int write() {
			int check =0;
			
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try {
					if(con!=null)con.close();
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
					
				}
			}
			
			
			return check;
		}
		
		public BDto modify_view(int bId) {
	 		
	 		sql="select * from mvc_board where bId=?";
	 		
	 		try {
	 			con = ds.getConnection();
	 			pstmt = con.prepareStatement(sql);
	 			pstmt.setInt(1, bId);
	 			rs = pstmt.executeQuery();
	 					
	 			if(rs.next()) {
	 				bId = rs.getInt("bId");
	 				bName = rs.getString("bName");
	 				bTitle = rs.getString("bTitle");
	 				bContent = rs.getString("bContent");
	 				bDate = rs.getTimestamp("bDate");
	 				bHit = rs.getInt("bHit");
	 				bGroup = rs.getInt("bGroup");
	 				bStep = rs.getInt("bStep");
	 				bIndent = rs.getInt("bIndent");
	 				dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
	 			}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null)rs.close();
					if(con!=null)rs.close();
					if(pstmt!=null)pstmt.close();
				} catch (Exception e2) {
				e2.printStackTrace();
				}
			}
	 		
	 		return dto;
	 	} //modify view
	 	
	 	//수정(reply) - update
	 	public int modify(int bId,String bTitle,String bContent) {
	 		int check = 0;
	 		
	 		sql = "update mvc_board set bTitle=?, bContent=? where bId=?";
	 		
	 		try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bTitle);
				pstmt.setString(2, bContent);
	 			pstmt.setInt(3, bId);
	 			check =	pstmt.executeUpdate();
	 			System.out.println(check);
	 			
	 			
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(con!=null)con.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	 		
	 		
	 		
	 		return check;
	 	}
		
		
		
		
		
		
}//count(*)
