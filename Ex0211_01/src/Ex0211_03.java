import java.util.Scanner;

public class Ex0211_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// /-> ������ %-> ������
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
			
		
			System.out.println((i+1) +"��° �ݾ��� �Է��ϼ���");
		money[i] = scan.nextInt();
		}
//		for(int i=0; i<3; i++) {
//		
//			my_coin[i] = scan.nextInt();
//			
//			
//			System.out.printf(coin[i]+"�� + %d",my_coin[i]);
//			System.out.println(coin[i] + my_coin[i]);
			
			for(int i=0; i<3; i++) {
				System.out.println((i+1)+"��° �Է��� �ݾ� : "+money[i]);
				for(int j=0; j<4; j++) {
					System.out.println(coin[j]+"��: "+money[i]/coin[j]);
					money[i] %= coin[j];
				}
			}
			
//			System.out.println();
//		  System.out.println(coin[i]+" ��: " + money/coin[i]);
//			money %= coin[i];
		
		

//		System.out.println("500�� :" + one);
//		System.out.println("100�� :" + one1);
//		System.out.println("50�� :" + one2);
//		System.out.println("10�� :" + one3);

	}

}
