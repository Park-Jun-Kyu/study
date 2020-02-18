
public class Student {

	String name; //이름
	int kor;	//국어점수
	int eng;	//영어점수
	int math;	//수학점수
	int total;	//합계	
	double avg; //평균
	
	
	void total() {
		total = kor+eng+math;
	}
	void avg() {
		avg = total/3;
	}
	
}
