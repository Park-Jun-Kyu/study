import java.util.Scanner;

public class Ex0227_05 {

	public static void main(String[] args) {
		SamsungTv[] sam = new SamsungTv[10];
		Ref[] sam1 = new Ref[10];
		Condi[] sam2 = new Condi[10];
		User user = new User();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------");
			System.out.println("1)�ＺTV ����");
			System.out.println("2)����� ����");
			System.out.println("3)������ ����");
			System.out.println("3) ���� ������ �ִ� �ݾ� Ȯ��");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� . >>");
			System.out.println("-------------------------");
			int num = scan.nextInt();
			switch (num) {
			case 1:
//					sam[tv_count] = new SamsungTv();
//				if(!(tv_count == 10)) {	
				user.buy(new SamsungTv());
//				}
				break;

			case 2:

				user.buy(new Ref());

				break;
			case 3:

				user.buy(new Condi());

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

class User {
	// tv ���, ref,condi -> money
	int money = 10000;
	String name = "ȫ�浿";
	int tv_count = 0;
	int Ref_count = 0;
	int condi_count = 0;

	void buy(Product p) {
		System.out.println(p.name + "1�븦 �����߽��ϴ� // ������ Ƚ�� ");
		// if() -> ������ �ִ� �ݾ��� �����ϸ� ���Ű� �ȵǵ���
		if (money < p.price) {
			System.out.println("�ܾ��� �����ؼ� ���Ű� �ȉ���ϴ�");
			return;
		}
		money = money - p.price;
		if (p instanceof SamsungTv) {
			tv_count++;
			System.out.println("���� tv ��� : " + tv_count);
		}
		if (p instanceof Ref) {
			Ref_count++;
			System.out.println("���� ����� ��� : " + Ref_count);
		}
		if (p instanceof Condi) {
			condi_count++;
			System.out.println("���� ������ ��� : " + condi_count);
		}

	}

	void money_now() {
		System.out.println("���� ������ ������ �ִ� �ݾ� : " + money);
//		System.out.println("���� ������ Tv ��� : " + tv_count);
	}

//	void buy1(Ref r) {
//		System.out.println("����� 1�� �����߽��ϴ�");
//		money = money - r.price;
//	}
//	
//	void buy2(Condi c) {
//		System.out.println("�������� 1�� �����߽��ϴ�");
//		money = money - c.price;
//	}

//	void buy(SamsungTv t) {
//		
//			System.out.println("�ＺTV�� 1�� �����߽��ϴ�.");
//			money = money = t.price;
//			System.out.println("���� ������ ������ �ִ� �ݾ� : " + money);
//			
//		}
}
