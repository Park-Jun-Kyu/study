import java.util.Scanner;

public class Ex0219_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1[] stu = new Student1[10];
		int num1 = 0;
		String name = "";
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.�����Է� , 2.�������� , 3.��������");
			num1 = scan.nextInt();
			switch (num1) {
			case 1:
				for (int i = 0; i < stu.length; i++) {
					System.out.println("�̸��� �����ּ���");
					name = scan.next();
					if (name.equals("99")) {
						System.out.println("�������� ���ư��ϴ�");
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
				break;

			case 2:
				loop:
				for (int i = 0; i < stu.length; i++) {
					System.out.println("������ �л��� �̸��� �Է��ϼ���");
					name = scan.next();
					if (stu[i].name.equals(name)) {
						System.out.println("� ������ �����Ͻðڽ��ϱ� 1,���� 2,���� 3,����");
						switch (scan.nextInt()) {
						case 1:
							System.out.println("������ ���������� �Է����ּ���");
							stu[i].kor = scan.nextInt();
							System.out.println("���������� �����Ǿ����ϴ�!");
							
							break loop;
						case 2:
							System.out.println("������ ���������� �Է����ּ���");
							stu[i].kor = scan.nextInt();
							System.out.println("���������� �����Ǿ����ϴ�!");
							
							break loop;
						case 3:
							System.out.println("������ ���������� �Է����ּ���");
							stu[i].kor = scan.nextInt();
							System.out.println("���������� �����Ǿ����ϴ�!");
							
							break loop;

						default:
							break;
						}
						
					}
				}

				break;
			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}

		} // while

	}// main

}// class
