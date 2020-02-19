import java.util.Scanner;

public class Ex0219_05 {

	public static void main(String[] args) {
		// 팩토리얼 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		long result =0;
		System.out.println("원하는 숫자를 입력하세요.>>");
//		int input = scan.nextInt();
		
		result = factorial(scan.nextInt());
		System.out.println(result);
		
	}

	static long factorial(int n) {
		long result = 0;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		} 

		return result;

	}

}
