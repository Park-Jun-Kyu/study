import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto_num = new int[45];
		int[] lotto = new int[45];
		int lotto_index = 0;
		int[] win_num = new int[6];
		int temp = 0;
		int ok = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			lotto_num[i] = scan.nextInt();

		}
		for (int i = 0; i < 45; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			System.out.println(lotto[i]);

		}
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
			System.out.println(lotto[i]);
		}

		for (int i = 0; i < 45; i++) {
			lotto_index = (int) (Math.random() * 45);
			temp = lotto[i];
			lotto[i] = lotto[lotto_index];
			lotto[lotto_index] = temp;

		}
		for (int i = 0; i < lotto_num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[j] == lotto_num[i]) {
					ok++;
					win_num[i] = lotto[j];
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println();
		if (0 == ok) {
			System.out.println("��÷���� �ʾҽ��ϴ�!");
		} else {
			System.out.println("��÷�Ǿ����ϴ�!");

			switch (ok) {
			case 1:
				System.out.println("1�� ��÷�Ǿ����ϴ�");
				break;
			case 2:
				System.out.println("2�� ��÷�Ǿ����ϴ�");
				break;
			case 3:
				System.out.println("3�� ��÷�Ǿ����ϴ�");
				break;
			case 4:
				System.out.println("4�� ��÷�Ǿ����ϴ�");
				break;
			case 5:
				System.out.println("5�� ��÷�Ǿ����ϴ�");
				break;
			case 6:
				System.out.println("6�� ��÷�Ǿ����ϴ�");
				break;
			}
			for (int i = 0; i < win_num.length; i++) {

				if (!(win_num[i] == 0)) {

					System.out.println("��÷�Ǿ����ϴ�!" + win_num[i]);

				}

			}
		}

	}

}
