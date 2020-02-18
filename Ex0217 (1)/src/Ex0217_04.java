import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String input = "";
//		char text = ' ';
//		char result = ' ';
//	
//		
//		Scanner scan = new Scanner(System.in);
//		
//		input = scan.next();
//		input.charAt(0);
//		
//		
//		if('a' <= input.charAt(0) && 'z' >= input.charAt(0)) {
//			result = (char)(input.charAt(0) - 32);
//			System.out.println(result);
//		}else if ( 'A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
//			result = (char)(input.charAt(0) + 32);
//			System.out.println(result);
//		}
//		
		
		
		
		String text = "";
		char result = ' ';
		
		String input = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.next();
		input.charAt(0);
		
		
		if('a' <= input.charAt(0) && 'z' >= input.charAt(0)) {
			result = (char)(input.charAt(0)-32);
			System.out.println(result);
		}
		else if ('A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
			result = (char)(input.charAt(0)+32);
			System.out.println(result);
		}
		
		else {
			System.out.println("잘못입력");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
