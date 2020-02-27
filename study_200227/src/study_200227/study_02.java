package study_200227;

import java.util.Scanner;

public class study_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SamsungTv1 [] tv = new SamsungTv1[10];
		Scanner scan = new Scanner(System.in);
		User user = new User();
		
		while(true) {
			System.out.println("1.tv구매 4.내가 가지고 있는 금액 확인");
			
			int num = scan.nextInt();
			switch (num) {
			case 1:
				
				user.buy(new SamsungTv1());
				
			case 4:
				
				user.money_now();
				break;

			default:
				break;
			}
			
			
			
		}
		
		
	}

}

class User{
	
	int money = 10000;
	String name = "홍길동";
	int tv_count = 0;
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		System.out.println(p.name + "1대를 구입했습니다 ");
		money = money - p.price;
		if(p instanceof SamsungTv1) {
			tv_count++;
			System.out.println("현재 tv 대수 : " + tv_count);
		}
		
	}
		void money_now() {
			System.out.println("현재 내가 가지고 있는 금액 + : " + money);
		}
		
		
		
	
	
	
	
}