package study_200227;

import java.util.Scanner;

public class study_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SamsungTv2[] tv = new SamsungTv2[10];
		User1 user = new User1();
		Scanner scan = new Scanner(System.in);

		while (true) {
			int num = scan.nextInt();
			switch (num) {
			case 1:

				user.buy(new SamsungTv2());
				break;

			case 4:
				user.money_now();
				break;
			default:
				break;
			}

		}

	}

}

class User1 {

	int tv_count;
	int money = 10000;
	String name = "���ر�";

	void buy(Product2 p) {
		System.out.println(p.name + "�� �����߽��ϴ�");
		if (money < p.price) {
			System.out.println("�ܾ��̺�����");
			return;
		}
		money = money - p.price;
		if (p instanceof SamsungTv2) {
			tv_count++;
			System.out.println("���� tv ���� " + tv_count);
		}

	}

	void money_now() {
		System.out.println("���糲�� �� " + money);
	}

}