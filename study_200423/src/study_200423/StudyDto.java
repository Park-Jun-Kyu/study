package study_200423;


public class StudyDto {

	String r_name;
	String r_pw;
	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getR_pw() {
		return r_pw;
	}

	public void setR_pw(String r_pw) {
		this.r_pw = r_pw;
	}

	public String getR_id() {
		return r_id;
	}

	public void setR_id(String r_id) {
		this.r_id = r_id;
	}

	String r_id;
	
	public StudyDto() {
		
		
	}
	
	public StudyDto(String r_name,String r_pw,String r_id) {
		this.r_name = r_name;
		this.r_pw = r_pw;
		this.r_id = r_id;
		
	}

	
	
	
	
	
	
}
