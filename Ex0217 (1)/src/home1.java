import java.util.Scanner;

public class home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		char result  = ' ';
		
		
		input = scan.next();
		input.charAt(0);
		
		

		if(input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
			result = (char)(input.charAt(0) - 32);
			System.out.println(result);
		}else if (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
			result = (char)(input.charAt(0) + 32);
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
		
	}

}
