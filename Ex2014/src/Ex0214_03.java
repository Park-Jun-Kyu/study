import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����Է�
		// ����Ǯ��
		String name = "";
		String[][] words = new String[10][2];
		String eng = ""; // �����
		int score = 0;
		int words_num = 0; // ������ȣ
		int ex_num = 0; // ����Ǯ�� ����
		Scanner scan = new Scanner(System.in);
		String in_str = "";
		int count = 0;
		int num = 0;
	
		while (true) {

			System.out.println("1.�����Է�!, 2.����Ǯ��!, 3.���α׷�����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			
			num = scan.nextInt();
			scan.nextLine();
			
			s_loop:
			switch (num) {

			case 1:
				System.out.println("�����Է�");

				for (int i = 0; i < words.length; i++) {
					System.out.println("----------------");
					System.out.println("��� �Է��ϼ���.>>(����ȭ��:99)");
					eng = scan.next();
					if (eng.equals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�");
						break s_loop;
					}
					words[i][0] = eng;
					System.out.println("�ѱ��� �Է��ϼ���.>>");
					words[i][1] = scan.next();
					
					words_num++;
				}
				// 10���ݺ�
				if (words_num == 10) {
					System.out.println("10���� ��� �ԷµǾ����ϴ�");
				break;
				}
//				for (int i = 0; i < words.length; i++) {
//					System.out.println("��� �Է��ϼ���");
//					words[i][0] = scan.next();
//					for (int j = 0; j < words[i].length - 1; j++) {
//						System.out.println("�ѱ��� �Է��ϼ���");
//						words[0][j] = scan.next();
//					}
//				}

//				break;

			case 2:
				System.out.println("����Ǯ��");
				System.out.println("----------------");

				for (int i = ex_num; i < words_num; i++) {

					System.out.println(words[i][0] + "���� �����ϱ��?(����ȭ�� : 99");
					in_str = scan.nextLine();
					if (in_str.equals("99")) {
						System.out.println("����ȭ������ �̵���");
						break;
					}
					// �����
					if (words[i][1].equals(in_str)) {
						System.out.println("�����Դϴ�. �������� ����>>");
					} else {
						if (count < 3) {
							System.out.println((count + 1) + "��° �����Դϴ� . �ٽõ���!!");
							count++; // Ƚ�� �߰�
							i--; // ���繮�� �ٽ� ����
							continue;
						}

						System.out.println("�����Դϴ�." + "������?" + words[i][1]);
						ex_num++; // ����Ǯ�� 1�߰� 2��° ������ ����
						count = 0; // �ʱ�ȭ
					}

				}

//				for (int i = 0; i < words.length; i++) {
//					System.out.println(words[i][0] + "�� ���� �����ϱ��?");
//					name = scan.next();
//					if (words[i][0] == words[i][0]) {
//						System.out.println("�����Դϴ�!");
//					} else {
//						System.out.println("Ʋ�Ƚ��ϴ�");
//					}
//				}
				break;
			case 3:

				break;

			}
			
		}
//		for (int i = 0; i <= 3; i++) {
//			num[i] = scan.nextInt();
//			for (int j = 0; j <= 3; j++) {
//				if (num[i] == 1) {
//					System.out.println("�����Է�!");
//				} else if (num[i] == 2) {
//					System.out.println("����Ǯ��!");
//				} else {
//					System.out.println("���α׷� ����");
//				}
//
//			}
//		}

	}//

}//
