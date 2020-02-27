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
			System.out.println("1)삼성TV 구매");
			System.out.println("2)냉장고 구매");
			System.out.println("3)에어컨 구매");
			System.out.println("3) 현재 가지고 있는 금액 확인");
			System.out.println("원하는 번호를 입력하세요 . >>");
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
	// tv 몇대, ref,condi -> money
	int money = 10000;
	String name = "홍길동";
	int tv_count = 0;
	int Ref_count = 0;
	int condi_count = 0;

	void buy(Product p) {
		System.out.println(p.name + "1대를 구매했습니다 // 구매한 횟수 ");
		// if() -> 가지고 있는 금액이 부족하면 구매가 안되도록
		if (money < p.price) {
			System.out.println("잔액이 부족해서 구매가 안됬습니다");
			return;
		}
		money = money - p.price;
		if (p instanceof SamsungTv) {
			tv_count++;
			System.out.println("현재 tv 대수 : " + tv_count);
		}
		if (p instanceof Ref) {
			Ref_count++;
			System.out.println("현재 냉장고 대수 : " + Ref_count);
		}
		if (p instanceof Condi) {
			condi_count++;
			System.out.println("현재 에어컨 대수 : " + condi_count);
		}

	}

	void money_now() {
		System.out.println("현재 유저가 가지고 있는 금액 : " + money);
//		System.out.println("내가 구매한 Tv 대수 : " + tv_count);
	}

//	void buy1(Ref r) {
//		System.out.println("냉장고를 1대 구매했습니다");
//		money = money - r.price;
//	}
//	
//	void buy2(Condi c) {
//		System.out.println("에어컨을 1대 구매했습니다");
//		money = money - c.price;
//	}

//	void buy(SamsungTv t) {
//		
//			System.out.println("삼성TV를 1대 구매했습니다.");
//			money = money = t.price;
//			System.out.println("현재 유저가 가지고 있는 금액 : " + money);
//			
//		}
}
