import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. �ִ밪���ϱ�(3���� ���ڸ� �־, 1�ִ밪,2�ּҰ�)
		// 2. ���밪�� ���ϱ�(1���� ���ڸ� �־ ���밪�� ���ϴ� ��)
		// 3. ������ ���ϱ� (ù��° ���� 5, ������ 2�� ������ 5*5 == 25 )
		// 1,2 ���ϴ� ��ȣ�� �����ϼ���.
		int min = 0;
		Scanner scan = new Scanner(System.in);
		int[] input = new int[2];
		int max = 0;
		int[] select_num = new int[3];

		loop1: while (true) {
			print();
			switch (scan.nextInt()) {

			case 1:

				max(); // �ִ밪���ϱ� �޼ҵ�
				break;
			case 2:

				min();

				break;
//			case 3:
//				
//				abs();
//
//
//			break;
//			
			case 4:
				max3();
				break;
//			
//			
			}
		}

	}// main

	// ȭ����� �޼ҵ�
	static void print() {

		System.out.println("1.�ִ밪 ���ϱ� ,2.�ּҰ� ���ϱ�, 3.���밪 ���ϱ�, 4.������ ���ϱ�");

	}

	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[] select_num = new int[3];
		loop2: while (true) {
			for (int i = 0; i < 3; i++) {

				System.out.println("���ڸ� �Է��ϼ���(����ȭ�� �̵�:99)");
				select_num[i] = scan.nextInt();
				if (select_num[i] == 99) {
					break loop2;// while ����
				} else if (select_num[i] == 0) {
					break loop2;
				} // else
			} // for

			max = Math.max(Math.max(select_num[0], select_num[1]), select_num[2]);
			System.out.println("�ִ밪 : " + max);
			// math.max(math.max(1,2),3);
		}

	}

	static void min() {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int[] select_num = new int[3];
		while (true) {
			select_num = for_int(select_num);
			
			if(select_num[0]==99) {
				break;
			}else if(select_num[0]==0) {
				break;
			}
				
			
			min = Math.min(Math.min(select_num[0], select_num[1]), select_num[2]);
			System.out.println("�ּҰ� : " + min);
			// math.max(math.max(1,2),3);
		}

	}

	static int[] for_int(int[] select_num) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("���ڸ� �Է��ϼ���(����ȭ�� �̵�:99)");
			select_num[i] = scan.nextInt();
			if (select_num[i] == 99) {
				break; // while ����
			} else if (select_num[i] == 0) {
				break ;
	}
		}
		return select_num;
	}
	
	
	
	
	static int[] max(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ִ밪 ���ϱ�");
		System.out.println("���ڸ� 3�� �Է��ϼ���");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a > b) {
			System.out.println("���� ū�� :" + a);
		} else if (b > c) {
			System.out.println("���� ū�� :" + b);
		} else if (c > a) {
			System.out.println("���� ū�� :" + c);
		}

		return input;
	}

	static int[] min(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ּҰ� ���ϱ�");
		System.out.println("���ڸ� 3�� �Է��ϼ���");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println("�ּҰ� ���ϱ�");

		if (a < b) {
			System.out.println("���� ������ :" + a);
		} else if (b < c) {
			System.out.println("���� ������ :" + b);
		} else if (c < a) {
			System.out.println("���� ������ :" + c);
		}

		return input;
	}

	static int[] max2(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���밪�� ���� ���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		Math.abs(a);
		System.out.println(Math.abs(a));
		return input;
	}

	static void max3() {
		Scanner scan = new Scanner(System.in);
			int [] num = new int [2];
			int result = 0;
			for(int i=0; i<2; i++) {
				System.out.println(num[0]+"�� ������ ���� ���ּ���");
				num[i] = scan.nextInt();
				System.out.println(num[0]+"�� ������ ���� ���ּ���");
				
			result = (int)(Math.pow(num[0],num[1]));
			System.out.println(result);
			}
			
			
		
	}
		
	

}// class
