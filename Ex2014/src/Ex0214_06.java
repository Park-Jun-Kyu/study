import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("���ڸ� �Է��ϼ���.�Ҽ��� 3�ڸ� �̻� �Է�");
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
//		System.out.println("���� �Է��ϼ�");
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
//			System.out.println("�߸� �Է��߻�");
//		} 
		// int absX = x >= 0 ? x: -x;

		// ���� 3���� �Է¹޾Ƽ�
		// ���� ū���� ã�ƺ�����

		
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
		
		// 2���� ���ڸ� �Է� �޴´ٰ� ������
//		result = a>b?a:b; // 10>12 �� �ִµ� -> �ڿ� b�� result�� ����
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
