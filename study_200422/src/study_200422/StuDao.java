package study_200422;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;





public class StuDao {

	
	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StuDto studt = null;
	String sql;
	
	
	
	
	
	
	
	
	
	 private Connection getConnection() {
        Context context=null;
         DataSource ds=null;
         Connection con=null;
         
         try {
            context=new InitialContext();
            ds=(DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
            con=ds.getConnection();
            
            
         } catch (Exception e) {
            e.printStackTrace();
         }
         
         
         return con;
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
