
public class Student {

	String name;
	int grade;
	int kor;
	int eng;
	int math;
	int hak_num;
	static int count=1000;
	int total;
	int avg;
	
	
	{
		count++;
		hak_num = count;
	}
	
	
	
	Student(){
		
	}
	
	Student(String name,int grade){
		this.name = name;
		this.grade = grade;
		
	}
	

}
