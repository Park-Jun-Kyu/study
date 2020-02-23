
public class Student {

	int kor;
	int eng;
	int math;
	String name;
	int sum;
	int avg;

	Student(String n, int k,int e, int m){
	name = n;
	kor = k;
	eng = e;
	math = m;
	sum = kor+eng+math;
	avg = sum / 3;
	}

}
