import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

//		String email = "";
//System.out.println("�̸��� �Է�");
//		email = scan.next();
//
//		for (int i = 0; i < email.length(); i++) {
//			if (!(email.contains("@"))) {
//				System.out.println("@�� �����ϴ�");
//				break;
//			}
//			System.out.println(email);
//		}
		// 1.Ư������ 1���� �־����
		// 2.�빮�ڰ� 1���� �־����
		// 3.���̴� 8�ڸ� �̻�
		// �ƴϸ� �ٽ� �Է��ϼ���

		System.out.println("��й�ȣ�� �Է��ϼ���");
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
			System.out.println("�Է¼���");
		} else {
			System.out.println("Ư�����ڰ� �ֽ��ϴ�");
		}

	}// main
}// class
