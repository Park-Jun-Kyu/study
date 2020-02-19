import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 직사각형 ->가로 *세로
		// 직삼각형 ->가로*세로*0.5
		// 마름모 -> 대각선길이(절반)*(대각선길이(절반)*0.5*4
		// 정사각형 -> 가로*세로
		// 원 -> 반지름* 3.14

		// --------------------
		// while(true) -> switch 1,2,3 -> 메소드로 분리해볼것
		// 1. 2개 2.2개 3. 2개 4.5 1개

		Scanner scan = new Scanner(System.in);
		int [] number = new int[2];
		int num=0;
		int num2=0;
		int result=0;
		num = scan.nextInt();
		while (true) {
			switch (num) {

//			case 1:
//				System.out.println("직사각형의 가로를 적으세요");
////				triangle();
//				num = input();
//				System.out.println("직사각형의 세로를 적으세요");
//				num2 = input();
//				System.out.println(num * num2);
//				break;

			case 2:
				result = input();
				
//				triangle();
//				number = input2();

				System.out.println(result);
				break;
				
				
				
				
//			case 3:
//				System.out.println("대각선길이(절반)의 가로를 적으세요");
////				triangle();
//				num = input();
//				System.out.println("대각선길이(절반)의 세로를 적으세요");
//				num2 = input();
//				System.out.println(num * num2 * 0.5*4);
//				break;
//				
//				
//		
//			case 4:
//				System.out.println("정삼각형의 가로를 적으세요");
//				num = input();
//				System.out.println("정삼각형의 세로를 적으세요");
//				num2 = input();
//				System.out.println(num * num2 );
//				break;
//
//			case 5:
//				System.out.println("대각선길이(절반)의 가로를 적으세요");
////				triangle();
//				num = input();
//				System.out.println("대각선길이(절반)의 세로를 적으세요");
//				num2 = input();
//				System.out.println(num * num2 * 0.5*4);
//				break;
//				
			}

		}

	} // main

	static int input() {
		
		int[] input =new int[2];
		int result =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		input[0] = scan.nextInt();
		System.out.println("숫자입력");
		input[0] = scan.nextInt();
		result = input[0]*input[1];
		
			return result;
		}
	
	
//	static int[] input2() {
//		
//		int [] number =new int[2];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자입력");
//		number[0] = scan.nextInt();
//		System.out.println("숫자입력");
//		number[1] = scan.nextInt();
//		
//			return number;
//		}
	
	
	static void square() {
//		int[] num = new int[2];
//		Scanner scan = new Scanner(System.in);
//		int result = 0;
//		System.out.println("가로를 입력하세요");
//			num[0] = scan.nextInt();
//			System.out.println("세로를 입력하세요");
//			num[1] = scan.nextInt();
//			result = (num[0] * num[1]) * 0.5;
//			System.out.println("직삼각형의 넓이"+ result);

		}
		
	

	

}// class
