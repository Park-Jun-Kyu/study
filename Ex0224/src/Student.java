
public class Student {
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	float avg;
	int rank;
	static int count;
	
	{
		count++;
		hak_num=count;
	}
	
	
	Student(){
		this("ȫ�浿",50,50,50);

	}
	
	
	
	
	Student(String name, int kor, int eng , int math){

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor +eng + math;
		this.avg = this.total/3;
	}
	
	void modify() {
		total();
		avg();
		rank=0;
	}
		
		void total() {
			
			total=kor+eng+math;
		
		}
	
		void avg() {
			avg = total/3;
		}
		
		


	
}
