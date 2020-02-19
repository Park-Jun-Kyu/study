import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("최대값 구하기");
		if(a > b) {
			System.out.println("제일 큰값 :"+a);
		}else if(b > c) {
			System.out.println("제일 큰값 :"+b);
		}else if(c > a) {
			System.out.println("제일 큰값 :"+c);
		}else if(a < b) {
			System.out.println("제일 작은값 :"+a);
		}else if(b < c ) {
			System.out.println("제일 작은값 :"+b);
		}else if (c < a) {
			System.out.println("제일 작은값 :"+c);
		}
	}

}
