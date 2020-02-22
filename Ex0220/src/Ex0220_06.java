import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~25까지의 숫자를 5개의 배열에 랜덤으로 넣어보세요.

		int[] lotto = new int[25];
		String xy = "";
		int x = 0;
		int y = 0;
		int[][] lotto2 = new int[5][5];
		Scanner scan = new Scanner(System.in);

		inArr(lotto); // 값넣기
		shuArr(lotto); // 값섞기
		sixArr(lotto, lotto2); // 6개에 넣기

		while (true) {
			printArr(lotto2);
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>(x,y)->(0,0)");
			xy = scan.nextLine(); // 15 -> 1,5
			x = xy.charAt(0) - '0';
			y = xy.charAt(1) - '0';
			if (!(lotto2[x][y] == 0)) {
				lotto2[x][y] = 0;
			} else {
				System.out.println("이미 선택했습니다.");
			}
		}

	}// main

	static void shuArr(int[] lotto) {
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 25);
			int temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}
	}

	static void inArr(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
	}

	static void sixArr(int[] lotto, int[][] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			for (int j = 0; j < lotto2[i].length; j++) {

				lotto2[i][j] = lotto[j + (i * 5)];
			}

		}

	}

	static void printArr(int[][] lotto2) {
		System.out.print(" "+"\t"+"0" + "\t" + "1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t");
		System.out.println();
		System.out.println("-------------------------------------------");
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(i+"\t");
			for (int j = 0; j < lotto2[i].length; j++) {
				System.out.print(lotto2[i][j] + " \t");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
	}
	
	
	//1~100까지 숫자를 랜덤으로 10개를 배열에 넣어서 작은 숫자로 정렬해서 출력하시오.
	
	

}// class
