package study;

import java.util.Scanner;

public class st0209_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1; // ����
		int b = 2; // ����
		int c = 3; // ��]
		int win = 0;
		int lose = 0;
		int x = 0;
		int fight = 0;
		String list = "";
		String id = "aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int count = 0;
//		if (login_check > 4) {
//			System.out.println("4�� �̻� �ԷµǾ����ϴ�");
//			break;
//		}
		System.out.println("���������� ����!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �α����� �ؾ��մϴ� ���̵� �Է����ּ���");
		while (true) {
			System.out.println("id�� �Է����ּ���");
			id_check = scan.nextLine();
			if (count > 3) {
				System.out.println("4�� �̻� �ԷµǾ����ϴ�");
				break;
			}
			if (!(id.equals(id_check))) {
				System.out.println("�߸��Է��Ͽ����ϴ� �ٽ� �Է����ּ���. 5ȸ�� �ʰ��Ǹ� ����˴ϴ�");
				count++;
				continue;
			}
			System.out.println("pass�� �Է����ּ���");
			pass_check = scan.nextLine();
			if (count > 3) {
				System.out.println("4�� �̻� �ԷµǾ����ϴ�");
				break;
			}
			if (!(pass.equals(pass_check))) {
				System.out.println("�߸��Է��Ͽ����ϴ� �ٽ� �Է����ּ���. 5ȸ�� �ʰ��Ǹ� ����˴ϴ�");
				count++;
				continue;
			}

			System.out.println("������ �����Ұ��� �����ּ���");
			fight = scan.nextInt();

			for (int i = 1; i <= fight; i++) {
				if (i == 10) {
					break;
				}

				System.out.println("1.���� , 2.���� , 3.��   ,�� ���ϴ� ���ڸ� �Է��ϼ���");
				int num = scan.nextInt();
				int com = (int) (Math.random() * 3 + 1);

				System.out.println(com);

				if (num == a && com == c || num == b && com == a || num == c && com == b) {
					System.out.println("�¸�!");
					win = win + 1;

				} else if (num == com) {
					System.out.println("���º�!");
					x = x + 1;

				} else {
					System.out.println("�й�!");
					lose = lose + 1;

				}

			} // for
			break;
		} // while

		System.out.printf("��������! �¸�%d, ���º�%d, �й�%d!!%n", win, x, lose);
		System.out.println("�·� " + win * 100 / fight);

	}//

}//
