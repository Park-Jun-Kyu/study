import java.util.Scanner;

public class Ex0219_05 {

	public static void main(String[] args) {
		// ���丮�� ���ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		long result =0;
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.>>");
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
