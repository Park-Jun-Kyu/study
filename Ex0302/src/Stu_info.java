
public class Stu_info {

	//학생정보
	//1.학번-hak_num , 이름 - name , 학과 - major, 학년- grade, 전화-tel
	
	int hak_num = 0;
	String name;
	String major;
	int grade;
	String tel;
	static int count=0;
	
	{
		hak_num = ++count;
	}
	
	
	Stu_info(){
		
	}
	
	Stu_info(String name, String major, int grade, String tel){
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.tel = tel;
		
		
	}
	
	
	
	
	
}
