import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Ex0219_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.�л������Է�
		// 2,�л�����
		// 3,�л�����
		// 4.�л� �˻�
		// 5.���ó��
		// 6.����

		Student[] stu = new Student[10];

		Scanner scan = new Scanner(System.in);

		String name;
		int kor = 0, eng = 0, math = 0;
		int num = 0;

		while (true) {

			System.out.println("1.�л����� �Է� 2.�л����� 3,�л�����, 4.�л��˻�");
			num= scan.nextInt();
			scan.nextLine();
			loop:
			switch (num) {
			case 1:
				System.out.println("�����Է�");
				for (int i = 0; i < stu.length; i++) {
					System.out.println("�̸��� �������� << �������� ���ư��� 99.>>");
					name = scan.next();
					if (name.equals("99")) {
						System.out.println("�������� ���ư��ϴ�");
						break loop;
					}
					System.out.println("���������� �������� .>>");
					kor = scan.nextInt();
					System.out.println("���������� �������� .>>");
					eng = scan.nextInt();
					System.out.println("���������� �������� .>>");
					math = scan.nextInt();
					scan.nextLine();
					stu[i] = new Student(name, kor, eng, math);
					System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);
				}

				break;

			case 2:
				System.out.println("���� ����");
				System.out.println("������ �л��� �̸��� �������� << �������� ���ư��� 99.>>");
				name = scan.nextLine();
				loop3:
				for (int i = 0; i < stu.length; i++) {
					if (name.equals("99")) {
						System.out.println("�������� ���ư��ϴ�");
						break loop3;
					}
					if (stu[i].name.equals(name)) {
						System.out.println(stu[i].name + "�� �˻��Ǿ����ϴ�. �����ϰ� ���� ��ȣ�� �Է��ϼ���");
						System.out.println("1.�������� 2.�������� 3.��������");
						switch (scan.nextInt()) {
						case 1:
							System.out.println("���������� �Է��ϼ���.>>");
							stu[i].kor = scan.nextInt();
							scan.nextLine();
							System.out.println("��������"+stu[i].kor+"����Ǿ����ϴ�.");
							break loop3;

			
						case 3:

							break;
						default:
							break;
						}
						
					} else {
						System.out.println("ã���� ������ �ٽ� �˻����ּ�");
						break;
					}

				}

				break;

			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			default:
				break;
			}// swich

			// for

		} // while

//		lotto[] l = new lotto[45];
//		for(int i=0; i<l.length; i++) {
//			l[i] = new lotto(i+1);
//		}

//		for(int i=0; i<l.length; i++) {
//			l[i] = new lotto();
//			l[i].number = i+1;
//		}

//		 Card 52���� �迭�� ����
//		 1~13����, Ŭ�ι�,���̾Ƹ��,��Ʈ,�����̽�
//		 ��������
//		Card c1 = new Card(1,"Ŭ�ι�");
//		Card c2 = new Card(2,"Ŭ�ι�");
//		Card c3 = new Card(3,"Ŭ�ι�");
//		Card c4 = new Card(4,"Ŭ�ι�");
//		Card c5 = new Card(5,"Ŭ�ι�");
//		Card c6 = new Card(6,"Ŭ�ι�");
//		System.out.println(c1.number + " "+c1.kind);
//		
//		Card cc1 = new Card();
//		String [] kind = {"Ŭ�ι�","���̾Ƹ��","��Ʈ","�����̽�"};
//		
//		Card[] c = new Card[52];
//		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {				
//		c[(i*13)+j] = new Card (j+1,kind[i]);
//		c[(i*13)+j] = new Card();
//		c[(i*13)+j].number = j+1;
//		c[(i*13)+j].kind = kind[i];
//		
//			
//		
//			System.out.println(c[i].number+" "+c[i].kind);
//		
//		
//			}
//		
//		}

//		Card c1 = new Card();
//		c1.number = 10;
//		c1.kind = "Ŭ�ι�";
//		System.out.println(c1.number + " "+c1.kind);

	}

}
