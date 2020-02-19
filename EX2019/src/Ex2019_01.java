import java.util.Scanner;

public class Ex2019_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int [] input= new int[2];
		int result = 0;
		
		
		
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1.더하기 2.빼기 ");
			System.out.println("해당하는 프로그램을 선택하세요.>>");
			
			switch (scan.nextInt()) {
			case 1: 
				input = print(input);
				
				
				result = Ex2019_01.add(input[0],input[1]);
				System.out.println("결과값 : "+ result);
				break;
			case 2:
				input = print(input);
				
				
				result = Ex2019_01.subtrack(input[0],input[1]);
				System.out.println("결과값 : "+ result);
				break;
				
				
			
				
			case 3:	
				input = print(input);
				
				
				result = Ex2019_01.max(input[0],input[1]);
				System.out.println("결과값 : "+ result);
				break;
			
	
				
			case 4:
				input = print(input);
				
				
				result = Ex2019_01.max2(input[0],input[1]);
				System.out.println("결과값 : "+ result);
				break;
			
			
//			case 5:
//				input = print(input);
//				
//				
//				result = Ex2019_01.egg(input[0],input[1]);
//				System.out.println("결과값 : "+ result);
//				break;
			}//switch
		}//while
		
		
	}// main
	
	// 프린트 메소드
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("더하고 싶은 1번째 숫자를 입력하세요.>>");
		input[0] = scan.nextInt();
		System.out.println("더하고 싶은 2번째 숫자를 입력하세요.>>");
		input[1] = scan.nextInt();
		return input;
	}

	// 더하기 메소드
	static int add(int a, int b) {
		return a + b;

//		System.out.println("결과값 : "+(a+b));
//		result = a+b;
//		return result;
	}

	static int subtrack(int a, int b) {
		return a - b;
	}
	
	static int max(int a, int b ){
		return a * b;
	}
	static int max2(int a, int b ){
		return a / b;
	}
static	void egg (int a , int b) {
	 int result = 0;
	 System.out.println(result = a*b);
	}
	
	
}// class
