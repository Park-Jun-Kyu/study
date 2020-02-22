import java.util.Scanner;

public class Ex0222_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1[] stu = new Student1[10];
		String name = "";
		int num = 0;
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {

			num = manu();

			switch (num) {
			case 1:

				score_write(stu);

				break;

			case 2:
				score_write2(stu);

				break;
			case 3:

				break;
			case 4:

				break;

			}// switch

		} // while

	}// main

	static int manu() {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력 프로그램");
		System.out.println("1.성적입력 2.성적수정 3.성적확인");
		num = scan.nextInt();

		return num;
	}

	static void score_write(Student1[] stu) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, math = 0;
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입 력하세요. 이전으로 돌아가기 99");
			name = scan.next();
			if (name.equals("99")) {
				break;
			}
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			stu[i] = new Student1(name, kor, eng, math);
			System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);

		}

	}

	static void score_write2(Student1[] stu) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, math = 0;
		loop: for (int i = 0; i < stu.length; i++) {
			System.out.println("성적 수정을 할 학생의 이름을 입력하세요 . 이전으로 돌아가기 99");
			name = scan.next();
			if (name.equals("99")) {
				break;
			}
			if (stu[i].name.equals(name)) {
				System.out.println("어떤과목을 수정하시겠습니까 1.국어 2.영어 3.수학");

				switch (scan.nextInt()) {
				case 1:
					System.out.println("수정할 국어점수를 입력하세요");
					stu[i].kor = scan.nextInt();
					System.out.println("국어점수가 수정되었습니다!");
					break loop;

				case 2:
					System.out.println("수정할 영어점수를 입력하세요");
					stu[i].eng = scan.nextInt();
					System.out.println("영어점수가 수정되었습니다!");
					break loop;
				case 3:
					System.out.println("수정할 수학점수를 입력하세요");
					stu[i].math = scan.nextInt();
					System.out.println("수학점수가 수정되었습니다!");
					break loop;
				}

			}

		}
		
		
	}

}// class
