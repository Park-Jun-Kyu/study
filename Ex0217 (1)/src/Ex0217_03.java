import java.util.Scanner;

public class Ex0217_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner scan = new Scanner(System.in);
//		
//		String text = "";
//		String text1 = "";
//		char text2 = ' ';
//		text = scan.next();
//		char[] text4 = new char[100];
//		
//		text2 = scan.charAt('0');
//		
//		
//		
//		
//		System.out.println(text2-32);
		
		
		String input = "";
		char result = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력하셈");
		input = scan.next();
		input.charAt(0); 
		
		if('a' <= input.charAt(0) && 'z' >= input.charAt(0)) {
			result = (char)(input.charAt(0)-32);
			System.out.println(result);
		
			
		}else if('A' <= input.charAt(0) && 'Z' >= input.charAt(0)) {
			result = (char)(input.charAt(0)+32);
			System.out.println(result);
		}else {
			System.out.println("잘못 입력했삼");
		} 
		
		
	}

}
