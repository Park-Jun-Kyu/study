import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~25������ ���ڸ� 5���� �迭�� �������� �־����.

		int[] lotto = new int[25];
		String xy = "";
		int x = 0;
		int y = 0;
		int[][] lotto2 = new int[5][5];
		Scanner scan = new Scanner(System.in);

		inArr(lotto); // ���ֱ�
		shuArr(lotto); // ������
		sixArr(lotto, lotto2); // 6���� �ֱ�

		while (true) {
			printArr(lotto2);
			System.out.println("-------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>(x,y)->(0,0)");
			xy = scan.nextLine(); // 15 -> 1,5
			x = xy.charAt(0) - '0';
			y = xy.charAt(1) - '0';
			if (!(lotto2[x][y] == 0)) {
				lotto2[x][y] = 0;
			} else {
				System.out.println("�̹� �����߽��ϴ�.");
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
	
	
	//1~100���� ���ڸ� �������� 10���� �迭�� �־ ���� ���ڷ� �����ؼ� ����Ͻÿ�.
	
	

}// class
