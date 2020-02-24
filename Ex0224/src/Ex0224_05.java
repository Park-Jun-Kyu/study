import java.util.Scanner;

public class Ex0224_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1[] stu = new Student1[2];
		int[] score = new int[3];
		Scanner scan = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0;
		String[] subject = { "국어", "영어", "수학" };
		while (true) {
			System.out.println("1:성적입력,2:성적출력,3:성적검색,4");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				score_write(stu, score);
				break;
			case 2:
				score_show(stu, score);

				break;
			case 3:

				for (int i = 0; i < stu.length; i++) {
					System.out.println("수정할 학생의 이름을 입력하세요");
					String name = scan.next();
					if (name.equals(stu[i].name)) {
						System.out.println("어떤과목을 수정하시겟습니까");
						int s_num = scan.nextInt();
						switch (s_num) {
						case 1:
							sw_modify(stu,i,"국어");
							break;
						case 2:
							sw_modify(stu,i,"영어");
							break;
						case 3:
							sw_modify(stu,i,"수학");
							break;
				
						}

					}else {
						System.out.println("다시입력하셈");
					}
					System.out.println();

				}

				break;
			case 4:

				break;

			}
		}

	}// main

	static void score_write(Student1[] stu, int[] score) {
		Scanner scan = new Scanner(System.in);
		while (true) {

			for (int i = 0; i < stu.length; i++) {
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				if (name.equals("99")) {
					break;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println("성적을 입력하세요");
					score[j] = scan.nextInt();
				}
				stu[i] = new Student1(name, score[0], score[1], score[2]);
			}
			System.out.println(stu[0].name + " // " + stu[0].total + " // " + stu[0].avg);
			System.out.println(stu[1].name + " // " + stu[1].total + " // " + stu[1].avg);
			break;
		}
	}

	static void score_show(Student1[] stu, int[] score) {
		String name = "";

		System.out.println(stu[0].name + " // " + stu[0].total + " // " + stu[0].avg);
		System.out.println(stu[1].name + " // " + stu[1].total + " // " + stu[1].avg);

	}

	
	static void sw_modify(Student1 [] stu,int i,String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.println("현재"+subject +" 점수 :" + stu[i].kor);
		System.out.println("변경"+subject +" 점수를 입력하세요.");
		if(subject.equals("국어")) {
			stu[i].kor = scan.nextInt();
			System.out.println("국어점수가 변경됬습니다");
			
		}else if(subject.equals("영어")){
			stu[i].eng = scan.nextInt();
			System.out.println("영어어점수가 변경됬습니다");
		}else {
			stu[i].math = scan.nextInt();
			System.out.println("수학점수가 변경됬습니다");
		}
		stu[i].modify();
	}
	
	
	
}// class
