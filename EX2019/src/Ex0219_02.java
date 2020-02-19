import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 최대값구하기(3개의 숫자를 넣어서, 1최대값,2최소값)
		// 2. 절대값을 구하기(1개의 숫자를 넣어서 절대값을 구하는 것)
		// 3. 제곱값 구하기 (첫번째 숫자 5, 제곱수 2를 넣으면 5*5 == 25 )
		// 1,2 원하는 번호를 선택하세요.
		int min = 0;
		Scanner scan = new Scanner(System.in);
		int[] input = new int[2];
		int max = 0;
		int[] select_num = new int[3];

		loop1: while (true) {
			print();
			switch (scan.nextInt()) {

			case 1:

				max(); // 최대값구하기 메소드
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

	// 화면출력 메소드
	static void print() {

		System.out.println("1.최대값 구하기 ,2.최소값 구하기, 3.절대값 구하기, 4.제곱값 구하기");

	}

	static void max() {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[] select_num = new int[3];
		loop2: while (true) {
			for (int i = 0; i < 3; i++) {

				System.out.println("숫자를 입력하세요(이전화면 이동:99)");
				select_num[i] = scan.nextInt();
				if (select_num[i] == 99) {
					break loop2;// while 종료
				} else if (select_num[i] == 0) {
					break loop2;
				} // else
			} // for

			max = Math.max(Math.max(select_num[0], select_num[1]), select_num[2]);
			System.out.println("최대값 : " + max);
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
			System.out.println("최소값 : " + min);
			// math.max(math.max(1,2),3);
		}

	}

	static int[] for_int(int[] select_num) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("숫자를 입력하세요(이전화면 이동:99)");
			select_num[i] = scan.nextInt();
			if (select_num[i] == 99) {
				break; // while 종료
			} else if (select_num[i] == 0) {
				break ;
	}
		}
		return select_num;
	}
	
	
	
	
	static int[] max(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최대값 구하기");
		System.out.println("숫자를 3번 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a > b) {
			System.out.println("제일 큰값 :" + a);
		} else if (b > c) {
			System.out.println("제일 큰값 :" + b);
		} else if (c > a) {
			System.out.println("제일 큰값 :" + c);
		}

		return input;
	}

	static int[] min(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최소값 구하기");
		System.out.println("숫자를 3번 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println("최소값 구하기");

		if (a < b) {
			System.out.println("제일 작은값 :" + a);
		} else if (b < c) {
			System.out.println("제일 작은값 :" + b);
		} else if (c < a) {
			System.out.println("제일 작은값 :" + c);
		}

		return input;
	}

	static int[] max2(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("절대값을 구할 숫자를 입력하세요");
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
				System.out.println(num[0]+"에 제곱할 수를 써주세요");
				num[i] = scan.nextInt();
				System.out.println(num[0]+"에 제곱할 수를 써주세요");
				
			result = (int)(Math.pow(num[0],num[1]));
			System.out.println(result);
			}
			
			
		
	}
		
	

}// class
