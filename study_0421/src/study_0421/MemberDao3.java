package study_0421;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




public class MemberDao3 {
	
	private MemberDao3() {
		
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql;
	MemberDto3 mdto2 = null;
	
	
	private static MemberDao3 instance = new MemberDao3();
	
	public static MemberDao3 getInstance() {
		
		return instance;
	}

	public int userCheck(String id,String pw) {
		int check = 0; 
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		String sql = "select id,pw from study01 where id=?";
		String ch_id,ch_pw = null;
		try {
			Context context = null;
			DataSource ds = null;
			
			context = new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("rs 데이터 읽음"+rs);
				
			ch_id = rs.getString("id");
			ch_pw = rs.getString("pw");
				
			
			if(ch_pw.equals(pw)) {
				check=1;
				
			}else{
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
				if(pstmt!=null)rs.close();
				if(con!=null)rs.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return check;
	}//usercheck 
	
	
	private Connection getConnection() {
		Context context=null;
		DataSource ds = null;
		Connection con = null;
		
		try {
			context = new InitialContext();
			ds=(DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			con=ds.getConnection();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	
	public ArrayList<MemberDto3> getMember(){
		
		ArrayList<MemberDto3> list = new ArrayList<MemberDto3>();
		sql = "select * from study01";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				mdto2 =new MemberDto3();
				mdto2.setId(rs.getString("id"));
				mdto2.setPw(rs.getString("pw"));
				mdto2.setName(rs.getString("name"));

				
				list.add(mdto2);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}
	
	 public MemberDto3 getMember(String id) {
	      Connection con=null;
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      MemberDto3 mdto2= null;
	      
	      String sql="select * from study01 where id=?";
	      
	      try {
	         Context context=new InitialContext();
	         DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle");
	         con=ds.getConnection();
	         pstmt=con.prepareStatement(sql);
	         pstmt.setString(1,id);
	         rs=pstmt.executeQuery();
	         
	            while(rs.next()) {
	               
	               //db에서 데이터 읽어와서 dto에 입력

					mdto2 =new MemberDto3();
					mdto2.setId(rs.getString("id"));
					mdto2.setPw(rs.getString("pw"));
					mdto2.setName(rs.getString("name"));

	               
	            }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(rs!=null) rs.close();
	            if(pstmt!=null) pstmt.close();
	            if(con!=null) con.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }
	      
	      
	      return mdto2;
	   }
	
	 
	 public int updateMember(MemberDto3 mdto) {
		   int check = 0;
		   //,address='가산동 제이플라츠 ' ,b_date=sysdate where id='aaa';
		   
		   
		   
		   
		   sql = "update study01 set pw=?,name=?,where id=?";
		   
		   try {
			   
			   con = getConnection();
			   pstmt = con.prepareStatement(sql);
			   pstmt.setString(1, mdto2.getPw());
			   pstmt.setString(2, mdto2.getName());
			   pstmt.setString(5, mdto2.getId());
			   check = pstmt.executeUpdate();
			   
			   
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
	 
	 
	
	
}
