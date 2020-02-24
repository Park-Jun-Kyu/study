import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		// 5명의 학생을 입력받아서 학번,이름,국어,영어,수학,합계,평균,등수
		// 학번은 1에서 1씩 증가 - 자동입력되도록
		// 입력부분은 메소드로 분리
		// 출력부분 메소드로 분리
		// 등수출력 메소드로 분리
		// 1.학생성적입력 2.학생성적출력 3.학생성적수정 4.학생등수입력 5.종료

		Scanner scan = new Scanner(System.in);
		String[] subject = { "국어", "영어", "수학" };
		Student[] stu = new Student[3];
		int[] score = new int[3];
		int num = 0;
		int kor = 0, eng = 0, math = 0;
		String name = "";
		int stu_count = 0;
		while (true) {
			System.out.println("1,2,3,4");
			num = scan.nextInt();
			
			switch (num) {
			case 1:

				stu_count = score_write(stu, score, subject, stu_count);
				System.out.println("성적입력 완료");

				break;
			case 2:

				score_show(stu, score);
				System.out.println("학생 입력수 : " + stu_count);
				System.out.println("성적입출력 완료");
				break;

			case 3:

				stu_modify(stu);
				System.out.println("성적수정 완료");

				break;

			case 4:

				break;

			default:
				break;
			}

		}

	}// main

	static int score_write(Student[] stu, int[] score, String[] subject, int stu_count) {

		Scanner scan = new Scanner(System.in);
		loop1: while (true) {
			for (int i = stu_count; i < stu.length; i++) {
				System.out.println("이름을 입력하세요 //이전 99");
				String name = scan.next();
				if (name.equals("99")) {
					break loop1;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println(subject[j] + "성적을 입력하세요");
					score[j] = scan.nextInt();
				}
				stu_count++;
				stu[i] = new Student(name, score[0], score[1], score[2]);
			}
			System.out.println("학번 :" + stu[0].hak_num + "//이름: " + stu[0].name + " //합계점수 " + stu[0].total + " //평균 "
					+ stu[0].avg);
			System.out.println("학번 :" + stu[1].hak_num + "//이름: " + stu[1].name + " //합계점수 " + stu[1].total + " //평균 "
					+ stu[1].avg);
			System.out.println("학번 :" + stu[2].hak_num + "//이름: " + stu[2].name + " //합계점수 " + stu[2].total + " //평균 "
					+ stu[2].avg);
			break;
		}
		return stu_count;
	}

	
	
	
	static void score_show(Student[] stu, int[] score) {
		String name = "";

		System.out.println(
				"학번 :" + stu[0].hak_num + "//이름: " + stu[0].name + " //합계점수 " + stu[0].total + " //평균 " + stu[0].avg);
		System.out.println(
				"학번 :" + stu[1].hak_num + "//이름: " + stu[1].name + " //합계점수 " + stu[1].total + " //평균 " + stu[1].avg);
		System.out.println(
				"학번 :" + stu[2].hak_num + "//이름: " + stu[2].name + " //합계점수 " + stu[2].total + " //평균 " + stu[2].avg);

	}

	static void score_check(Student[] stu, int[] score, String[] subject) {
		Scanner scan = new Scanner(System.in);

		loop2: while (true) {

			for (int i = 0; i < stu.length; i++) {
				System.out.println("이름을 입력하세요 //이전 99");
				String name = scan.next();
				if (name.equals("99")) {
					break loop2;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println(subject[j] + "성적을 입력하세요");
					score[j] = scan.nextInt();
					System.out.println("학생 성적 수정이 완료되었습니다!");
				} // for2
//				} // if
			} // for1
		} // while
	}// static score_check
		// 학생성적수정

	static void stu_modify(Student[] stu) {
		Scanner scan = new Scanner(System.in);

		System.out.println("수정하고 싶은 학생이름을 입력하세요");
		String s_name = scan.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (s_name.equals(stu[i].name)) {
				System.out.println(s_name + "검색되었습니다.");
				System.out.println("1.국어수정 2.영어수정 3.수학수정 4.이름수정 0.이전화면");
				System.out.println("원하는 번호를 입력하세요.>>");
				int s_num1 = scan.nextInt();

				switch (s_num1) {
				case 1:
					sw_modify(stu,i,"국어");
	
					break;
				case 2:
					sw_modify(stu,i,"영어");
					
					break;
				
				case 3:
					sw_modify(stu,i,"수학");
					
					break;
				case 4:
					System.out.println("현재 이름 :" + stu[i].name);
					System.out.println("변경 이름을 입력하세요.");
					stu[i].name = scan.nextLine();
					break;

				default:
					break;
				}

			} else {
				System.out.println("이름 불일치. 다시 검색");
			}
		}//for
	}//stu.modify
	
	static void sw_modify(Student [] stu,int i,String subject1) {
		Scanner scan = new Scanner(System.in);
		System.out.println("현재"+subject1 +" 점수 :" + stu[i].kor);
		System.out.println("변경"+subject1 +" 점수를 입력하세요.");
		if(subject1.equals("국어")) {
			stu[i].kor = scan.nextInt();
			
			
		}else if(subject1.equals("영어")){
			stu[i].eng = scan.nextInt();
			
		}else {
			stu[i].math = scan.nextInt();
			
		}
	}
	
	
	

}// class
