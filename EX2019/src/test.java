import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("�ִ밪 ���ϱ�");
		if(a > b) {
			System.out.println("���� ū�� :"+a);
		}else if(b > c) {
			System.out.println("���� ū�� :"+b);
		}else if(c > a) {
			System.out.println("���� ū�� :"+c);
		}else if(a < b) {
			System.out.println("���� ������ :"+a);
		}else if(b < c ) {
			System.out.println("���� ������ :"+b);
		}else if (c < a) {
			System.out.println("���� ������ :"+c);
		}
	}

}
