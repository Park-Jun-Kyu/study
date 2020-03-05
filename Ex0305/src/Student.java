
public class Student implements Comparable<Student> {
	int hak_num;
	String name;
	int total;

	Student() {}
	Student(int hak_num, String name, int total) {
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "학번 : " + hak_num + "이름 : " + name + " 합계 :  " + total;
	}

	@Override
	public int compareTo(Student s) {
		
		if(this.hak_num > s.hak_num) { //s.hak_num 넘어온 값
			return -1;
		}else if(this.hak_num < s.hak_num) {
			return 1;
		}
		return 0;
//		return this.name.compareTo(s.name);
	}

}
