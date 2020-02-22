import java.util.Scanner;

public class Ex0222_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[] = new int[45];
		int lotto_num[] = new int[5];
		int num = 0;
		int temp = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("로또게임!");
			System.out.println("1: 랜덤번호뽑기 , 2:번호섞기, 3:5개번호 뽑기 4:로또번호의 합  , 5:번호 올림차순");

			num = scan.nextInt();

			switch (num) {
			case 1:

				lotto1(lotto);

				break;

			case 2:

				lotto2(lotto);

				break;
			case 3:

				lotto3(lotto, lotto_num);

				break;
			case 4:

				lotto4(lotto_num);

				break;

			case 5:
				lotto5(lotto_num);

				break;

			default:
				break;
			}// switch
		} // while

	}// main

	static void lotto1(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

			System.out.println(lotto[i]);

		}

	}

	static void lotto2(int[] lotto) {

		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			int temp = 0;
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
			System.out.println(lotto[0]);
		}

	}

	static void lotto3(int[] lotto, int[] lotto_num) {

		for (int i = 0; i < lotto_num.length; i++) {

			lotto_num[i] = lotto[i];
			System.out.println(lotto_num[i]);

		}

	}

	static int lotto4(int[] lotto_num) {

		int sum = 0;
		for (int i = 0; i < lotto_num.length; i++) {

			sum = lotto_num[i] + sum;
		}
		System.out.println("합친값  = " + sum);

		return sum;
	}

	static void lotto5( int[] lotto_num) {

		for (int i = 0; i < lotto_num.length; i++) {
		
			for (int j = 0; j < lotto_num.length-1; j++) {
				int temp = 0;
				if (lotto_num[j] > lotto_num[j + 1]) {

					temp = lotto_num[j];
					lotto_num[j] = lotto_num[j+1];
					lotto_num[j+1] = temp;
				}
			}
			System.out.println(lotto_num[i]);

	}


}// class

}