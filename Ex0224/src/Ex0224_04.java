import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		// 5���� �л��� �Է¹޾Ƽ� �й�,�̸�,����,����,����,�հ�,���,���
		// �й��� 1���� 1�� ���� - �ڵ��Էµǵ���
		// �Էºκ��� �޼ҵ�� �и�
		// ��ºκ� �޼ҵ�� �и�
		// ������ �޼ҵ�� �и�
		// 1.�л������Է� 2.�л�������� 3.�л��������� 4.�л�����Է� 5.����

		Scanner scan = new Scanner(System.in);
		String[] subject = { "����", "����", "����" };
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
				System.out.println("�����Է� �Ϸ�");

				break;
			case 2:

				score_show(stu, score);
				System.out.println("�л� �Է¼� : " + stu_count);
				System.out.println("��������� �Ϸ�");
				break;

			case 3:

				stu_modify(stu);
				System.out.println("�������� �Ϸ�");

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
				System.out.println("�̸��� �Է��ϼ��� //���� 99");
				String name = scan.next();
				if (name.equals("99")) {
					break loop1;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println(subject[j] + "������ �Է��ϼ���");
					score[j] = scan.nextInt();
				}
				stu_count++;
				stu[i] = new Student(name, score[0], score[1], score[2]);
			}
			System.out.println("�й� :" + stu[0].hak_num + "//�̸�: " + stu[0].name + " //�հ����� " + stu[0].total + " //��� "
					+ stu[0].avg);
			System.out.println("�й� :" + stu[1].hak_num + "//�̸�: " + stu[1].name + " //�հ����� " + stu[1].total + " //��� "
					+ stu[1].avg);
			System.out.println("�й� :" + stu[2].hak_num + "//�̸�: " + stu[2].name + " //�հ����� " + stu[2].total + " //��� "
					+ stu[2].avg);
			break;
		}
		return stu_count;
	}

	
	
	
	static void score_show(Student[] stu, int[] score) {
		String name = "";

		System.out.println(
				"�й� :" + stu[0].hak_num + "//�̸�: " + stu[0].name + " //�հ����� " + stu[0].total + " //��� " + stu[0].avg);
		System.out.println(
				"�й� :" + stu[1].hak_num + "//�̸�: " + stu[1].name + " //�հ����� " + stu[1].total + " //��� " + stu[1].avg);
		System.out.println(
				"�й� :" + stu[2].hak_num + "//�̸�: " + stu[2].name + " //�հ����� " + stu[2].total + " //��� " + stu[2].avg);

	}

	static void score_check(Student[] stu, int[] score, String[] subject) {
		Scanner scan = new Scanner(System.in);

		loop2: while (true) {

			for (int i = 0; i < stu.length; i++) {
				System.out.println("�̸��� �Է��ϼ��� //���� 99");
				String name = scan.next();
				if (name.equals("99")) {
					break loop2;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println(subject[j] + "������ �Է��ϼ���");
					score[j] = scan.nextInt();
					System.out.println("�л� ���� ������ �Ϸ�Ǿ����ϴ�!");
				} // for2
//				} // if
			} // for1
		} // while
	}// static score_check
		// �л���������

	static void stu_modify(Student[] stu) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�����ϰ� ���� �л��̸��� �Է��ϼ���");
		String s_name = scan.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (s_name.equals(stu[i].name)) {
				System.out.println(s_name + "�˻��Ǿ����ϴ�.");
				System.out.println("1.������� 2.������� 3.���м��� 4.�̸����� 0.����ȭ��");
				System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
				int s_num1 = scan.nextInt();

				switch (s_num1) {
				case 1:
					sw_modify(stu,i,"����");
	
					break;
				case 2:
					sw_modify(stu,i,"����");
					
					break;
				
				case 3:
					sw_modify(stu,i,"����");
					
					break;
				case 4:
					System.out.println("���� �̸� :" + stu[i].name);
					System.out.println("���� �̸��� �Է��ϼ���.");
					stu[i].name = scan.nextLine();
					break;

				default:
					break;
				}

			} else {
				System.out.println("�̸� ����ġ. �ٽ� �˻�");
			}
		}//for
	}//stu.modify
	
	static void sw_modify(Student [] stu,int i,String subject1) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����"+subject1 +" ���� :" + stu[i].kor);
		System.out.println("����"+subject1 +" ������ �Է��ϼ���.");
		if(subject1.equals("����")) {
			stu[i].kor = scan.nextInt();
			
			
		}else if(subject1.equals("����")){
			stu[i].eng = scan.nextInt();
			
		}else {
			stu[i].math = scan.nextInt();
			
		}
	}
	
	
	

}// class
