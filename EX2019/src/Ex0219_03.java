import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���簢�� ->���� *����
		// ���ﰢ�� ->����*����*0.5
		// ������ -> �밢������(����)*(�밢������(����)*0.5*4
		// ���簢�� -> ����*����
		// �� -> ������* 3.14

		// --------------------
		// while(true) -> switch 1,2,3 -> �޼ҵ�� �и��غ���
		// 1. 2�� 2.2�� 3. 2�� 4.5 1��

		Scanner scan = new Scanner(System.in);
		int [] number = new int[2];
		int num=0;
		int num2=0;
		int result=0;
		num = scan.nextInt();
		while (true) {
			switch (num) {

//			case 1:
//				System.out.println("���簢���� ���θ� ��������");
////				triangle();
//				num = input();
//				System.out.println("���簢���� ���θ� ��������");
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
//				System.out.println("�밢������(����)�� ���θ� ��������");
////				triangle();
//				num = input();
//				System.out.println("�밢������(����)�� ���θ� ��������");
//				num2 = input();
//				System.out.println(num * num2 * 0.5*4);
//				break;
//				
//				
//		
//			case 4:
//				System.out.println("���ﰢ���� ���θ� ��������");
//				num = input();
//				System.out.println("���ﰢ���� ���θ� ��������");
//				num2 = input();
//				System.out.println(num * num2 );
//				break;
//
//			case 5:
//				System.out.println("�밢������(����)�� ���θ� ��������");
////				triangle();
//				num = input();
//				System.out.println("�밢������(����)�� ���θ� ��������");
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
		System.out.println("�����Է�");
		input[0] = scan.nextInt();
		System.out.println("�����Է�");
		input[0] = scan.nextInt();
		result = input[0]*input[1];
		
			return result;
		}
	
	
//	static int[] input2() {
//		
//		int [] number =new int[2];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�����Է�");
//		number[0] = scan.nextInt();
//		System.out.println("�����Է�");
//		number[1] = scan.nextInt();
//		
//			return number;
//		}
	
	
	static void square() {
//		int[] num = new int[2];
//		Scanner scan = new Scanner(System.in);
//		int result = 0;
//		System.out.println("���θ� �Է��ϼ���");
//			num[0] = scan.nextInt();
//			System.out.println("���θ� �Է��ϼ���");
//			num[1] = scan.nextInt();
//			result = (num[0] * num[1]) * 0.5;
//			System.out.println("���ﰢ���� ����"+ result);

		}
		
	

	

}// class
