import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л�����ó�����α׷�
		// �л�-class : �й� / �̸� / ���� / ���� / ���� / �հ� / ��� / ���
		// [�л�����ó�����α׷�]
		// 1, �����߰�
		// �����߰��� �Է��ϼ̽��ϴ�. -> �й��Է��ϼ���.>�̸�,����,����,����
		// 2. ��������-> ������ �л��� �й��� �Է��ϼ��� .>
		// 1.�̸� 2.���� 3.����. 4.����
		// 1.�̸��� �Է��ϼ��� > ȫ�浿 -> ȫ�浿 �̸��� �����Ǿ����ϴ�
		// 3. ��������
		//
		// 4. �����˻�
		// 5. ���ó��
		// 0. ����
		stu[] stu1 = new stu[10];
		int select = 0;
		String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		int num_count = 0;
		int[] stu_num = new int[3];

		Scanner scan = new Scanner(System.in);

		while (true) {
			main_print(); // ���� ��� // �޼ҵ� �и�

			select = scan.nextInt();

			switch (select) {
			case 1:
				insert(stu1); // �л������߰� �޼ҵ� - �޼ҵ� �и�
				
				break;

			case 2:
				System.out.println("���� ����");
				for (int i = 0; i < stu1.length; i++) {
					System.out.println("�������� -> ������ �л��� �й��� �Է��ϼ���.(�������� ���ư��� 99)");
					num_count = scan.nextInt();
					if (num_count == 99) {
						break;
					}
					if (num_count == stu1[i].num) {
						System.out.println("�̸��� �Է��ϼ���");
						stu1[i].name = scan.next();
						System.out.println("�̸��� �����Ǿ����ϴ�");
						System.out.println("������� �Է��ϼ���");
						stu1[i].kor = scan.nextInt();
						System.out.println("������� �Է��ϼ���");
						stu1[i].eng = scan.nextInt();
						System.out.println("���м����� �Է��ϼ���");
						stu1[i].math = scan.nextInt();
					} else {
						System.out.println("�߸� �Է��Ͽ����ϴ� �ٽ� �Է����ּ���");
						continue;
					}

					System.out.println(
							"������ �׸� : " + stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}

				break;
			case 3:
				for (int i = 0; i < stu1.length; i++) {
					System.out.println("������ ������ �л��� �й��� �Է��ϼ���");
					stu1[i].num = scan.nextInt();
					if (stu1[i].num == 99) {
						break;
					}

					stu1[i].kor = 0;
					stu1[i].eng = 0;
					stu1[i].math = 0;
					System.out.println(stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}
				;

				break;
			case 4:

				for (int i = 0; i < stu1.length; i++) {
					System.out.println("������ �˻��� �л��� �й��� �Է��ϼ���");
					stu1[i].num = scan.nextInt();
					System.out.println(stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}
				break;
			case 5:

				break;

			case 0:

				break;

			}

		} // while
	}//
		// ���� ��� �޼ҵ�

	static void main_print() {

		System.out.println("[�л�����ó�� ���α׷�]");
		System.out.println("1:�����߰�,2:��������,3:��������,4:�����˻�,5:���ó��,0:����");

	}

	static void insert(stu[] stu1) {
		String insert_name = "";
		Scanner scan = new Scanner(System.in);
		
//		for (int i = 0; i < stu1.length; i++) {
//		stu1[i] = new stu();
		// �����߰� ���ѹݺ�

//		stu1[i].num=scan.nextInt();
		for (int i = stu_count; i < stu1.length; i++) {
			System.out.println("�����߰��� �Է��ϼ̽��ϴ� -> �̸��� �Է��ϼ���(�������� ���ư��� 99)");
			insert_name = scan.next();
			if (insert_name.equals("99")) {
				System.out.println("�������� ���ư���");
				break;
			}
			stu1[i] = new stu(); // ���� ������ �ִ� ��������
			stu1[i].num = (stu.first_num += 1);
			// Student.first_num = Studen.first_num + 1
			stu1[i].name = insert_name;
			System.out.println("������� �Է��ϼ���");
			stu1[i].kor = scan.nextInt();
			System.out.println("������� �Է��ϼ���");
			stu1[i].eng = scan.nextInt();
			System.out.println("���м����� �Է��ϼ���");
			stu1[i].math = scan.nextInt();
			Ex0218_04.stu_count++;
			System.out.println(stu_count + "��° �л� : �й�" + stu1[i].num + "�̸�" + stu1[i].name + "...");
			// �հ� �θ��� ������ class�� void �߰��ؼ� stu1[i].total() / avg() ���·� �ֱ�
		} // for
			// while
	}

}//
