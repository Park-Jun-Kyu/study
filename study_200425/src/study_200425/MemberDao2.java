package study_200425;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao2 {

	public MemberDao2() {
		
		
	}
	
	private static MemberDao2 instance = new MemberDao2();
	
	public static MemberDao2 getinstance() {
		return instance;
	}
	
	//커넥션 받아오기
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	MemberDto2 mdto2;
	
	
	
	public Connection getConnection() {

		Context context = null;
		DataSource ds = null;
		Connection con = null;
		
		try {
			context = new InitialContext();
			ds=(DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			
			
			
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
		
		
		return con;
	}
	
	public MemberDto2 getMember(String id) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto2 mdto2 = null;
		
		
		String sql = "select * from study2 where id=?";
		
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle");
			con = ds.getConnection();
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				mdto2 = new MemberDto2();
				mdto2.setId(rs.getString("id"));
				mdto2.setPw(rs.getString("pw"));
				mdto2.setName(rs.getString("name"));
				mdto2.setEmail(rs.getString("email"));
				mdto2.setAddress(rs.getString("address"));
				
				
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return mdto2;
	}
	
	
	
	
}
