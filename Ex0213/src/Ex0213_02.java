import java.util.Scanner;

public class Ex0213_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//		
//		String num = "";
//		String name = "";
//		
//		
//		while(true) {
//			System.out.println("번호를 입력하세요.>>");
//			num = scan.next(); //123 엔터키
//			scan.nextLine();
//			System.out.println("이름을 입력하세요.>>");
//			name = scan.nextLine(); //엔터키도 문자로 이식
//		
//			System.out.println(num + "  "+name);	
//		}

//		char[] hex = { '7', 'C', 'A', 'F', 'E' };
		
//		String[] hex = {'7','C','A','F','E'};
		Scanner scan = new Scanner(System.in);
		char[] hex = new char[10];
		String str="";
		System.out.println("문자를 입력하세요");
		str = scan.next();
		for(int i=0;i<str.length();i++) {
			hex[i] = str.charAt(i); //0-A, 1-B, 2-C
		}
		
		
//		hex[0] = str.charAt(0);
//		hex[1] = str.charAt(1);
		
		
		String[] binary = { // A=10 b=11 c=12 d=13 e=14 f=15
				"0000", "0001", "0010", "0011", // 0,1,2,3
				"0100", "0101", "0110", "0111", // 4,5,6,7
				"1000", "1001", "1010", "1011", // 8,9,10,11
				"1100", "1101", "1110", "1111", // 12,13,14,15
		};

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			
			
			
			if(hex[i]>='0' && hex[i]<='9') {
			result = result + binary[hex[i] - '0']+" ";
			
			}else {
				
			result = result + binary[(hex[i] - 'A')+10]+" ";

		}
	
			}
			for(int i=0; i<str.length(); i++) {
				System.out.print(hex[i]+" ");
			
		}
		System.out.println();
		System.out.println(result);
		
	}//

}//
