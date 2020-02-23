import java.util.Scanner;

public class Ex0223_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[45];
		int[] lotto2 = new int[5];
		int temp = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {

			
			System.out.println("1.로또번호뽑기 2.로또섞기 3.로또번호출력");
			
			num = scan.nextInt();
			switch (num) {
			case 1:
				lotto1(lotto);
				break;

			case 2:
				lotto2(lotto);
				break;
			case 3:
				lotto3(lotto,lotto2);
				break;
			case 4:
				lotto4(lotto2);
							break;
			case 5:
				lotto5(lotto2);
				break;
			default:
				break;
			}




		}
	}//main

	static void lotto1(int[] lotto) {
		
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
	}
	
	static void lotto2(int[] lotto) {
		int temp = 0;
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
	}
	
	static void lotto3(int[]lotto,int[]lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto[i];
			System.out.println(lotto2[i]);
		}
		
	}
	
	static void lotto4(int[] lotto2) {
		int sum = 0;
		for(int i=0; i<lotto2.length; i++) {
			sum = sum + lotto2[i];
		}
		System.out.println(sum);
	}
	
	static void lotto5(int[] lotto2) {
		for(int i=0; i<lotto2.length; i++) {
			for(int j=0; j<lotto2.length-1; j++) {
				if(lotto2[j] < lotto2[j+1]) {
					int temp = 0;
					temp = lotto2[j+1];
					lotto2[j+1] = lotto2[j];
					lotto2[j] = temp;
					
				}
			}
			System.out.println(lotto2[i]);
		}
		
	}
	
	
	
	
}//class
