import java.util.Scanner;

public class Ex0224_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1[] stu = new Student1[2];
		int[] score = new int[3];
		Scanner scan = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0;
		String[] subject = { "����", "����", "����" };
		while (true) {
			System.out.println("1:�����Է�,2:�������,3:�����˻�,4");
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
					System.out.println("������ �л��� �̸��� �Է��ϼ���");
					String name = scan.next();
					if (name.equals(stu[i].name)) {
						System.out.println("������� �����Ͻðٽ��ϱ�");
						int s_num = scan.nextInt();
						switch (s_num) {
						case 1:
							sw_modify(stu,i,"����");
							break;
						case 2:
							sw_modify(stu,i,"����");
							break;
						case 3:
							sw_modify(stu,i,"����");
							break;
				
						}

					}else {
						System.out.println("�ٽ��Է��ϼ�");
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
				System.out.println("�̸��� �Է��ϼ���");
				String name = scan.next();
				if (name.equals("99")) {
					break;
				}
				for (int j = 0; j < score.length; j++) {
					System.out.println("������ �Է��ϼ���");
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
		stu[i].modify();
	}
	
	
	
}// class
