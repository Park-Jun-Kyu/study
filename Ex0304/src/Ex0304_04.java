import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǻ���а� c0001

		Scanner scan = new Scanner(System.in);
		String jumin = "", gender = "", we = "";

		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			jumin = scan.next();

			int age = Integer.parseInt(jumin.substring(0, 2));
			char ch = jumin.charAt(7);
			if (jumin.length() > 15) {
				System.out.println("14�ڸ� �ʰ��߽��ϴ�!");
				break;
			}
			for (int i = 0; i < jumin.length(); i++) {
				if (!('0' <= jumin.charAt(i) - '0' && '9' >= jumin.charAt(i) - '0')) {
					break;
				}
				else {
					System.out.println("����� �ԷµǾ����ϴ�");
				}
			}

			if (ch == '1' || ch == '3') {
				gender = "����";
			} else if (ch == '2' || ch == '4') {
				gender = "����";
			}

			if (ch == '1' || ch == '2') {
				age = 2020 - (1900 + age) + 1;
			} else if (ch == '3' || ch == '4') {
				age = 2020 - (2000 + age) + 1;
			}

			System.out.println(jumin);
			System.out.println(gender);
			System.out.println(age);

			break;
		}

	}

}
