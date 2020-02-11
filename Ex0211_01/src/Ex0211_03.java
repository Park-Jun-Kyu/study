import java.util.Scanner;

public class Ex0211_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// /-> 나누기 %-> 나머지
		// 5680 -> 500, 100, 50, 10

		Scanner scan = new Scanner(System.in);
		
		
		
		int [] money = new int[3];
		int [] coin = {500,100,50,10};
		int [] my_coin = {500,100,50,10};
//		int one = 500;
//		int one1 = 100;
//		int one2 = 50;
//		int one3 = 10;
////		int coin = money / one;

//		one = money / 500;
//		one1 = (money % 500) / 100;
//		one2 = ((money % 500) % 100) / 50;
//		one3 = (((money % 500) % 100) % 50) / 10;
		
		for( int i=0; i<3; i++) {
			
		
			System.out.println((i+1) +"번째 금액을 입력하세요");
		money[i] = scan.nextInt();
		}
//		for(int i=0; i<3; i++) {
//		
//			my_coin[i] = scan.nextInt();
//			
//			
//			System.out.printf(coin[i]+"원 + %d",my_coin[i]);
//			System.out.println(coin[i] + my_coin[i]);
			
			for(int i=0; i<3; i++) {
				System.out.println((i+1)+"번째 입력한 금액 : "+money[i]);
				for(int j=0; j<4; j++) {
					System.out.println(coin[j]+"원: "+money[i]/coin[j]);
					money[i] %= coin[j];
				}
			}
			
//			System.out.println();
//		  System.out.println(coin[i]+" 원: " + money/coin[i]);
//			money %= coin[i];
		
		

//		System.out.println("500원 :" + one);
//		System.out.println("100원 :" + one1);
//		System.out.println("50원 :" + one2);
//		System.out.println("10원 :" + one3);

	}

}
