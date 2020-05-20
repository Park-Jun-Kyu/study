package com.javalec.ex.PDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.PDto.PDto;

public class PDao {

	
	
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds= null;
	String sql;
	Context context = null;
	ArrayList<PDto> list = new ArrayList<PDto>();
	int pId,pGroup,pHit,pStep,pIndent;
	String pName,pTitle,pContent;
	Timestamp pDate;
	PDto dto = new PDto();
	
	
	public PDao() {
		
		
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<PDto> list(){
		
		
		sql = "select * from pang_board";
		
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				pId = rs.getInt("pId");
				pName = rs.getString("pName");
				pTitle = rs.getString("pTitle");
				pContent = rs.getString("pContent");
				pDate = rs.getTimestamp("pDate");
				pGroup = rs.getInt("pGroup");
				pHit = rs.getInt("pHit");
				pStep = rs.getInt("pStep");
				pIndent= rs.getInt("pIndent");
				
				dto = new PDto(pId, pName, pTitle, pContent, pDate, pGroup, pHit, pStep, pIndent);
				list.add(dto);				
			}
			
			
			
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
		
		return list;
	}

	
	
	
	
	
	
	
	
	
}

