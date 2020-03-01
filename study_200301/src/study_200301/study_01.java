package study_200301;

import java.util.Scanner;

public class study_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student12[] stu = new Student12[2];
		School sc = new School();
		int kor = 0, eng = 0, math = 0;
		String name = "";
		int num = 0;
		int[] score = new int[3];
		String[] subject = {"국어","영어","수학"};
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.성적입력 , 2.성적수정, 3.성적등수");
			num = scan.nextInt();
			switch (num) {
			case 1:
				sc.score_write(stu, score,subject);
				break;
			case 2:
				sc.score_write2(stu, score);
				break;
			case 3:
			
			}
		}

	}// main

}// class

class School {

	void score_write(Student12[] stu, int[] score, String [] subject) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입력하세요 , 이전으로 돌아가기 99");
			String name = scan.next();
			if (name.equals("99")) {
				break;
			}
			for (int j = 0; j < score.length; j++) {
				System.out.println(subject[j] + "성적을 입력하세요");
				score[j] = scan.nextInt();
			}
			stu[i] = new Student12(name, score[0], score[1], score[2]);

		}
		System.out.println("이름 : " + stu[0].name + " // " + "총점: " + stu[0].total + " // " + "평균:  " + stu[0].avg);
		System.out.println("이름 : " + stu[1].name + " // " + "총점: " + stu[1].total + " // " + "평균 : " + stu[1].avg);

	}

	void score_write2(Student12[] stu, int[] score) {
		Scanner scan = new Scanner(System.in);
		loop3:
		for (int i = 0; i < stu.length; i++) {
			System.out.println("수정할 학생의 이름을 입력하세요 , 이전으로 돌아가기 99");
			String name = scan.next();
			if (name.equals(stu[i].name)) {
				for (int j = 0; j < score.length; j++) {
					System.out.println("어떤 과목을 수정할지 선택하세요");
					System.out.println("1.국어 // 2.영어 // 3.수학 // 99.이전으로 돌아가기");
					int s_num = scan.nextInt();
					if(s_num == 99) {
						break loop3;
					}
					switch (s_num) {
					case 1:
						score_write3(stu,"국어",i);
						break;
					case 2:
						score_write3(stu,"영어",i);
						break;
					case 3:
						score_write3(stu,"수학",i);
						break;
					default:
						break;
					}
				}
			}
		}

	}
	
	
	void score_write3(Student12[] stu, String subject,int i) {
		
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
		
		}
		
		
		
	
	
	
	
	
	

} // school

class Student12 {

	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;

	Student12() {

	}

	Student12(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3;

	}

	void total() {
		total = kor + eng + math;

	}

	void avg() {
		avg = total / 3;

	}

}