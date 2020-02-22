import java.util.Scanner;

public class Ex0222_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		int num = 0;
		int[] lotto_num = new int[5];

		while (true) {
			System.out.println("로또게임");
			System.out.println("1,랜덤번호뽑기 // 2,번호섞기 // 3,5개번호뽑기  //4,로또번호의 합 // 5,번호 올림차순");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();

			switch (num) {
			case 1:

				lotto11(lotto);
				break;
			case 2:
				lotto22(lotto);
				break;
			case 3:
				lotto33(lotto, lotto_num);
				break;
			case 4:
				lotto44(lotto_num);
				break;
			case 5:
				lotto55(lotto_num);
				
			default:
				break;
			}

		}

	}// main

	static void lotto11(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.println(lotto[i]);
		}
	}

	static void lotto22(int[] lotto) {
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			int temp = 0;
			temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}
	}

	static void lotto33(int[] lotto, int[] lotto_num) {
		for (int i = 0; i < lotto_num.length; i++) {
			lotto_num[i] = lotto[i];
System.out.println(lotto_num[i]);
		}

	}
	
	static void lotto44(int[]lotto_num) {
		int sum = 0;
		for(int i=0; i<lotto_num.length; i++) {
			sum += lotto_num[i];
		}
		System.out.println(sum);
	}
		
	
	static void lotto55(int [] lotto_num) {
		for(int i=0; i<lotto_num.length; i++) {
			for(int j=0; j<lotto_num.length-1; j++){
				if(lotto_num[j] < lotto_num[j+1]) {
					int temp =0;
					temp = lotto_num[j+1];
					lotto_num[j+1] = lotto_num[j];
					lotto_num[j] = temp;
				}
				
			}
			System.out.println(lotto_num[i]);
		}
			
		
	}
	

}// class
