package study;

import java.util.Scanner;

public class st0209_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1; // 가위
		int b = 2; // 바위
		int c = 3; // 보]
		int win = 0;
		int lose = 0;
		int x = 0;
		int fight = 0;
		String list = "";
		String id = "aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int count = 0;
//		if (login_check > 4) {
//			System.out.println("4번 이상 입력되었습니다");
//			break;
//		}
		System.out.println("가위바위보 게임!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("먼저 로그인을 해야합니다 아이디를 입력해주세요");
		while (true) {
			System.out.println("id를 입력해주세요");
			id_check = scan.nextLine();
			if (count > 3) {
				System.out.println("4번 이상 입력되었습니다");
				break;
			}
			if (!(id.equals(id_check))) {
				System.out.println("잘못입력하였습니다 다시 입력해주세요. 5회가 초과되면 종료됩니다");
				count++;
				continue;
			}
			System.out.println("pass를 입력해주세요");
			pass_check = scan.nextLine();
			if (count > 3) {
				System.out.println("4번 이상 입력되었습니다");
				break;
			}
			if (!(pass.equals(pass_check))) {
				System.out.println("잘못입력하였습니다 다시 입력해주세요. 5회가 초과되면 종료됩니다");
				count++;
				continue;
			}

			System.out.println("게임을 몇판할건지 정해주세요");
			fight = scan.nextInt();

			for (int i = 1; i <= fight; i++) {
				if (i == 10) {
					break;
				}

				System.out.println("1.가위 , 2.바위 , 3.보   ,중 원하는 숫자를 입력하세요");
				int num = scan.nextInt();
				int com = (int) (Math.random() * 3 + 1);

				System.out.println(com);

				if (num == a && com == c || num == b && com == a || num == c && com == b) {
					System.out.println("승리!");
					win = win + 1;

				} else if (num == com) {
					System.out.println("무승부!");
					x = x + 1;

				} else {
					System.out.println("패배!");
					lose = lose + 1;

				}

			} // for
			break;
		} // while

		System.out.printf("게임종료! 승리%d, 무승부%d, 패배%d!!%n", win, x, lose);
		System.out.println("승률 " + win * 100 / fight);

	}//

}//
