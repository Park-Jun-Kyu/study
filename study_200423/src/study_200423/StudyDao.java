package study_200423;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class StudyDao {
	
	
	private StudyDao() {
	
	}
	
	private static StudyDao instance = new StudyDao();
	
	public static StudyDao getinstance() {
		return instance;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	StudyDto stud = null;
	
	
	
	private Connection getConnection() {
		Context context = null;
		DataSource ds = null; //커넥션풀을 관리하기 위한 객체 , DataSource를 객체를 통해서 필요한 Connection을 흭득 반납 등의 작업을 한다
		Connection con = null;
		
		try {
			context = new InitialContext();
			ds=(DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public StudyDto getmember(String r_id) {
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudyDto stud = null;
		
		String sql = "select * from study1 where r_id=?";
		
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, r_id);
			rs=pstmt.executeQuery();
			
				while(rs.next()) {
					
					stud = new StudyDto();
					stud.setR_id(rs.getString("r_id"));
					stud.setR_name(rs.getString("r_name"));
					stud.setR_pw(rs.getString("r_pw"));
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return stud;
	}
	
	public ArrayList<StudyDto> getMembers(){
		
		ArrayList<StudyDto> list = new ArrayList<StudyDto>();
		sql = "select * from study1";
		
		try {
			con= getConnection();
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				stud=new StudyDto();
				stud.setR_id(rs.getString("r_id"));
				stud.setR_name(rs.getString("r_name"));
				stud.setR_pw(rs.getString("r_pw"));
				
				list.add(stud);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return list;
		
	}
	
	
	
	public int userCheck(String r_id,String r_pw) {
		int check=0;
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select r_id,r_pw from study1 where r_id=?";
		String ch_id,ch_pw;
		
		try {
			Context context = null;
			DataSource ds = null;
			
			context = new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, r_id);
			rs=pstmt.executeQuery();
			
		if(rs.next()) {
			System.out.println("rs데이터 읽음:"+rs);
			
			ch_id=rs.getString("r_id");
			ch_pw=rs.getString("r_pw");
			
			if(ch_pw.equals(r_pw)) {
				check=1;
			}else {
				check=0;
			}
			
		}else {
			check=-1;
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		}	
			
			

	return check;
		
	}
		
}