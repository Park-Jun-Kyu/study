
public class Stu_info {

	//�л�����
	//1.�й�-hak_num , �̸� - name , �а� - major, �г�- grade, ��ȭ-tel
	
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
