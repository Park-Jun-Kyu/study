package study_200229;

import java.util.Scanner;

public class study_200229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Project p = new Project();
		SamsungTv[] tv = new SamsungTv[10];
		Computer[] com = new Computer[10];
		Ref1[] ref = new Ref1[10];
		Washer[] wash = new Washer[10];
		Air_con[] air = new Air_con[10];
		User14 user = new User14();
		Scanner scan = new Scanner(System.in);
		int num = 0;
loop:
		while (true) {
			System.out.println("���ι�");
			System.out.println("1)Tv , 2)��ǻ�� , 3)����� , 4)��Ź�� , 5)������");
			System.out.println("6)�ܾ�,���� Ȯ��  , 7)�ܾ� ���� , 8)���� 0)����");
			num = scan.nextInt();
			switch (num) {
			case 1:

				user.buyer(new SamsungTv());

				break;
			case 2:
				user.buyer(new Computer());
				break;
			case 3:
				user.buyer(new Ref1());
				break;
			case 4:
				user.buyer(new Washer());
				break;
			case 5:
				user.buyer(new Air_con());
				break;
			case 6:
				user.my_money();
				break;
			case 7:
				user.cash_plus();
				break;
			case 8:
				user.delete();
			case 0:
				System.out.println("����!");
				break loop;
				
			default:
				break;
			}

		}

	}

}

class User14 {
	Scanner scan = new Scanner(System.in);
	int tv_count;
	int money = 100000;
	int com_count;
	int ref_count;
	int air_count;
	int wash_count;
	int bonus_point;
	int cash_num;
	int i = 0;
	Project[] cart = new Project[10];
	
	void cash_plus() {
		System.out.println("������ �ݾ��� �Է��ϼ���");
		cash_num = scan.nextInt();
		
		money = cash_num + money;
		System.out.println("�����ݾ� :" + cash_num + "���� �ݾ� : " + money);
	}
	
	
	
	void buyer(Project p) {
		if (p instanceof SamsungTv) {
			tv_count++;
			System.out.println(p.name + "�� �����Ͽ����ϴ� ���� �� : " + money);
		}
		if (p instanceof Computer) {
			com_count++;
			money = money - p.price;
			System.out.println(p.name + "�� �����Ͽ����ϴ� ���� �� : " + money);
		}
		if (p instanceof Ref1) {
			ref_count++;
			money = money - p.price;
			System.out.println(p.name + "�� �����Ͽ����ϴ� ���� �� : " + money);
		}
		if (p instanceof Washer) {
			wash_count++;
			money = money - p.price;
			System.out.println(p.name + "�� �����Ͽ����ϴ� ���� �� : " + money);
		}
		if (p instanceof Air_con) {
			air_count++;
			money = money - p.price;
			System.out.println(p.name + "�� �����Ͽ����ϴ� ���� �� : " + money);
		}
		money = money - p.price;
		bonus_point = p.price/10 + bonus_point;
		cart[i++] = p;
	}
	
	
	void delete() {
		System.out.println("[ ���� - Com ]");
		int num = 0;
		for (int j = 0; j < cart.length; j++) {
			if (cart[j] == null) {
				break;
			}
			if (cart[j].name.equals("Com")) {
				cart[j].name = "";
				cart[j].price = 0;
				num++;
			}
		}
		if (num == 1) {
			System.out.println("1�� ��� �Ͽ����ϴ�.");
		} else {
			System.out.println("����� ��ǰ�� �����ϴ�.");
		}
	}

	void my_money() {

		System.out.println("���� �ܾ� " + money + "//���� ����Ʈ : " + bonus_point);
		if (!(0 == tv_count)) {
			System.out.println("���� Tv ���� : " + tv_count);
		}
		if (!(0 == com_count)) {
			System.out.println("���� ��ǻ�� ���� : " + com_count);
		}
		if (!(0 == ref_count)) {
			System.out.println("���� ����� ���� : " + ref_count);
		}
		if (!(0 == wash_count)) {
			System.out.println("���� ��Ź�� ���� : " + wash_count);
		}
		if (!(0 == air_count)) {
			System.out.println("���� ������ ���� : " + air_count);
		}

	}

}

class Project {

	int price;
	String name;
	int count;

	Project() {

	}

	Project(int price) {
		this.price = price;
	}
}

class SamsungTv extends Project {
	static int count;
	int project_n;

	{
		project_n = ++count;
	}

	SamsungTv() {
		price = 1000;
		name = "Tv";

	}
}

class Computer extends Project {
	static int count;
	int project_n;

	{
		project_n = ++count;
	}

	Computer() {
		price = 1500;
		name = "Com";

	}
}

class Ref1 extends Project {
	static int count;
	int project_n;

	{
		project_n = ++count;
	}

	Ref1() {
		price = 1200;
		name = "��Ź��";

	}
}

class Washer extends Project {
	static int count;
	int project_n;

	{
		project_n = ++count;
	}

	Washer() {
		price = 800;
		name = "��Ź��";

	}
}

class Air_con extends Project {
	static int count;
	int project_n;

	{
		project_n = ++count;
	}

	Air_con() {
		price = 600;
		name = "��Ź��";

	}
}
