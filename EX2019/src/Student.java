
public class Student {

	Student(){
		
	}
	
	Student(String n,int k, int e,int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = kor+eng+math;
		avg = total/3;
	}
	
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
}
