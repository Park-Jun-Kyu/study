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
		System.out.println("�����Է� ���α׷�");
		System.out.println("1.�����Է� 2.�������� 3.����Ȯ��");
		num = scan.nextInt();

		return num;
	}

	static void score_write(Student1[] stu) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0, eng = 0, math = 0;
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�̸��� �� ���ϼ���. �������� ���ư��� 99");
			name = scan.next();
			if (name.equals("99")) {
				break;
			}
			System.out.println("���������� �Է��ϼ���");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���");
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
			System.out.println("���� ������ �� �л��� �̸��� �Է��ϼ��� . �������� ���ư��� 99");
			name = scan.next();
			if (name.equals("99")) {
				break;
			}
			if (stu[i].name.equals(name)) {
				System.out.println("������� �����Ͻðڽ��ϱ� 1.���� 2.���� 3.����");

				switch (scan.nextInt()) {
				case 1:
					System.out.println("������ ���������� �Է��ϼ���");
					stu[i].kor = scan.nextInt();
					System.out.println("���������� �����Ǿ����ϴ�!");
					break loop;

				case 2:
					System.out.println("������ ���������� �Է��ϼ���");
					stu[i].eng = scan.nextInt();
					System.out.println("���������� �����Ǿ����ϴ�!");
					break loop;
				case 3:
					System.out.println("������ ���������� �Է��ϼ���");
					stu[i].math = scan.nextInt();
					System.out.println("���������� �����Ǿ����ϴ�!");
					break loop;
				}

			}

		}
		
		
	}

}// class
