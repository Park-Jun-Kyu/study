import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

//		String email = "";
//System.out.println("이메일 입력");
//		email = scan.next();
//
//		for (int i = 0; i < email.length(); i++) {
//			if (!(email.contains("@"))) {
//				System.out.println("@가 없습니다");
//				break;
//			}
//			System.out.println(email);
//		}
		// 1.특수문자 1개라도 있어야함
		// 2.대문자가 1개라도 있어야함
		// 3.길이는 8자리 이상
		// 아니면 다시 입력하세요

		System.out.println("비밀번호를 입력하세요");
		String pass = "";

		int count = 0;
//		for(int i =0; i<pass.length(); i++) {
//			if(!(pass.contains(""))) {
//				
//			}
//			
//		}
		pass = scan.next();
		for (int i = 0; i < pass.length(); i++) {

			if (!('A' <= pass.charAt(i) && 'Z' >= pass.charAt(i) || 'a' <= pass.charAt(i) && 'z' >= pass.charAt(i) || '0' <= pass.charAt(i) && '9' >= pass.charAt(i) )) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("입력성공");
		} else {
			System.out.println("특수문자가 있습니다");
		}

	}// main
}// class
