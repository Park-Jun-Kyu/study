import java.util.Scanner;

public class Ex2019_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int [] input= new int[2];
		int result = 0;
		
		
		
		while(true) {
			System.out.println("[ ��Ģ���� ���α׷� ]");
			System.out.println("-------------------------");
			System.out.println("1.���ϱ� 2.���� ");
			System.out.println("�ش��ϴ� ���α׷��� �����ϼ���.>>");
			
			switch (scan.nextInt()) {
			case 1: 
				input = print(input);
				
				
				result = Ex2019_01.add(input[0],input[1]);
				System.out.println("����� : "+ result);
				break;
			case 2:
				input = print(input);
				
				
				result = Ex2019_01.subtrack(input[0],input[1]);
				System.out.println("����� : "+ result);
				break;
				
				
			
				
			case 3:	
				input = print(input);
				
				
				result = Ex2019_01.max(input[0],input[1]);
				System.out.println("����� : "+ result);
				break;
			
	
				
			case 4:
				input = print(input);
				
				
				result = Ex2019_01.max2(input[0],input[1]);
				System.out.println("����� : "+ result);
				break;
			
			
//			case 5:
//				input = print(input);
//				
//				
//				result = Ex2019_01.egg(input[0],input[1]);
//				System.out.println("����� : "+ result);
//				break;
			}//switch
		}//while
		
		
	}// main
	
	// ����Ʈ �޼ҵ�
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϰ� ���� 1��° ���ڸ� �Է��ϼ���.>>");
		input[0] = scan.nextInt();
		System.out.println("���ϰ� ���� 2��° ���ڸ� �Է��ϼ���.>>");
		input[1] = scan.nextInt();
		return input;
	}

	// ���ϱ� �޼ҵ�
	static int add(int a, int b) {
		return a + b;

//		System.out.println("����� : "+(a+b));
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
