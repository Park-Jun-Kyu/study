
public class Student1 {

	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int count;
	int hak_number;
	int rank;

	Student1() {

	}

	Student1(String name, int kor, int eng, int math) {
		this.total = kor + eng + math;
		this.avg = total / 3;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	void modify() {

		total();
		avg();
		rank=0;
	}
	
	void total() {
	total =	kor+eng+math;
	}
	
	void avg() {
		avg = total/3;
	}
	
	
	
	

}
