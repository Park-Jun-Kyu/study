import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Ex0302_01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//Student
		// 학생10명
		// Student12 stu = new Student[10];
		// Vector list = new Vector();

		Scanner scan = new Scanner(System.in);
		ArrayList<Student22> list = new ArrayList<Student22>();
//		Vector<Student22> list = new Vector<Student22>();
		Student22[] stu = new Student22[10];
		String[] name1 = { "홍길동", "이순신", "김유신" };
		int[] kor1 = { 100, 90, 95 };
		int[] eng1 = { 80, 70, 89 };

		list.add(new Student22(name1[0], kor1[0], eng1[0]));
		list.add(new Student22(name1[1], kor1[1], eng1[1]));
		list.add(new Student22(name1[2], kor1[2], eng1[2]));

		if (list.isEmpty()) {
			System.out.println("학생입력이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				Student22 s = (Student22) list.get(i);
				System.out.print(s.hak_num + "\t");
				System.out.print(s.name + "\t");
				System.out.print(s.kor + "\t");
				System.out.print(s.eng + "\t");
				System.out.print(s.total + "\t");
				System.out.print(s.avg + "\t");
				System.out.println();
			}
		}

//		String name = "";
//		int kor = 0, eng = 0;
//
//		while (true) {
//			
//			System.out.println("이름을 입력해주세요.>>");
//			name = scan.nextLine();
//			System.out.println("국어점수를 입력하세요.>>");
//			kor = scan.nextInt();
//			System.out.println("영어점수를 입력하세요.>>");
//			eng = scan.nextInt();
//			scan.nextLine();
//			scan.next();
//			list.add(new Student22(name, kor, eng));
//			System.out.println("1명 성적 추가");
//		}

//		Student22 s1 = new Student(name[1],kor[1],eng[1]);

//		list.add(new Student22(name1[1], kor1[1], eng1[1]));
//		list.add(new Student22(name1[2], kor1[2], eng1[2]));

	}

}
