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
		String[] subject = {"����","����","����"};
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.�����Է� , 2.��������, 3.�������");
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
			System.out.println("�̸��� �Է��ϼ��� , �������� ���ư��� 99");
			String name = scan.next();
			if (name.equals("99")) {
				break;
			}
			for (int j = 0; j < score.length; j++) {
				System.out.println(subject[j] + "������ �Է��ϼ���");
				score[j] = scan.nextInt();
			}
			stu[i] = new Student12(name, score[0], score[1], score[2]);

		}
		System.out.println("�̸� : " + stu[0].name + " // " + "����: " + stu[0].total + " // " + "���:  " + stu[0].avg);
		System.out.println("�̸� : " + stu[1].name + " // " + "����: " + stu[1].total + " // " + "��� : " + stu[1].avg);

	}

	void score_write2(Student12[] stu, int[] score) {
		Scanner scan = new Scanner(System.in);
		loop3:
		for (int i = 0; i < stu.length; i++) {
			System.out.println("������ �л��� �̸��� �Է��ϼ��� , �������� ���ư��� 99");
			String name = scan.next();
			if (name.equals(stu[i].name)) {
				for (int j = 0; j < score.length; j++) {
					System.out.println("� ������ �������� �����ϼ���");
					System.out.println("1.���� // 2.���� // 3.���� // 99.�������� ���ư���");
					int s_num = scan.nextInt();
					if(s_num == 99) {
						break loop3;
					}
					switch (s_num) {
					case 1:
						score_write3(stu,"����",i);
						break;
					case 2:
						score_write3(stu,"����",i);
						break;
					case 3:
						score_write3(stu,"����",i);
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
			System.out.println("����"+subject +" ���� :" + stu[i].kor);
			System.out.println("����"+subject +" ������ �Է��ϼ���.");
			if(subject.equals("����")) {
				stu[i].kor = scan.nextInt();
				System.out.println("���������� �������ϴ�");
				
			}else if(subject.equals("����")){
				stu[i].eng = scan.nextInt();
				System.out.println("����������� �������ϴ�");
			}else {
				stu[i].math = scan.nextInt();
				System.out.println("���������� �������ϴ�");
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