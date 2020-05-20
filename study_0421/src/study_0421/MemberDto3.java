package study_0421;

import java.sql.Timestamp;

public class MemberDto3 {

	public MemberDto3() {
		
	}
	
	
	
	public MemberDto3(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	
		
		
	}
	
	
	private String id,pw,name;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




	
	
	
}
