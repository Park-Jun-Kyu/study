import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("숫자를 입력하세요.소수점 3자리 이상 입력");
//		
//		double j = scan.nextDouble();
//		
//		System.out.println((double)(Math.round(j*1000)/1000.0));
//		
//		double i = (Math.round(3.23423*1000)/1000.0);
//		System.out.println(i);
//		Scanner scan = new Scanner(System.in);
//		
//		String i = "";
//		
//		i = scan.next();

//		System.out.println(i+'32'+'0');
//		 System.out.println();

//		String input = "";
//		char result = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자 입력하셈");
//		input = scan.next();
//		input.charAt(0);
//		
//		if('a' <= input.charAt(0) && 'z' >= input.charAt(0)) {
//			result = (char)(input.charAt(0)-32);
//			System.out.println(result);
//		
//			
//		}else if('A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
//			result = (char)(input.charAt(0)+32);
//			System.out.println(result);
//		}else {
//			System.out.println("잘못 입력했삼");
//		} 
		// int absX = x >= 0 ? x: -x;

		// 숫자 3개를 입력받아서
		// 제일 큰수를 찾아보세요

		
		Scanner scan = new Scanner(System.in);
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		

		if (a > b) {
			System.out.println(a);
		}

		else if (b > c) {
			System.out.println(b);
		}

		else if (c > a) {
			System.out.println(c);
			}
		
		
		
		
		
		
//		int a = 10;
//		int b = 12;
//		
//		int c = 18;
//		
//		int result=0;
		
		// 2개의 숫자를 입력 받는다고 했을때
//		result = a>b?a:b; // 10>12 가 있는데 -> 뒤에 b가 result에 담긴다
//		
//		
//		result = a>b?a:(b>c?b:c);
//		
//		System.out.println(result);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		

		if (a > b) {
			System.out.println(a);
		}

		else if (b > c) {
			System.out.println(b);
		}

		else if (c > a) {
			System.out.println(c);
			}

		
		
	}

}
