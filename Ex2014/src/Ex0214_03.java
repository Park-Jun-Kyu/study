import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제입력
		// 문제풀이
		String name = "";
		String[][] words = new String[10][2];
		String eng = ""; // 영어변수
		int score = 0;
		int words_num = 0; // 문제번호
		int ex_num = 0; // 문제풀이 변수
		Scanner scan = new Scanner(System.in);
		String in_str = "";
		int count = 0;
		int num = 0;
	
		while (true) {

			System.out.println("1.문제입력!, 2.문제풀이!, 3.프로그램종료");
			System.out.println("원하는 번호를 입력하세요");
			
			num = scan.nextInt();
			scan.nextLine();
			
			s_loop:
			switch (num) {

			case 1:
				System.out.println("문제입력");

				for (int i = 0; i < words.length; i++) {
					System.out.println("----------------");
					System.out.println("영어를 입력하세요.>>(이전화면:99)");
					eng = scan.next();
					if (eng.equals("99")) {
						System.out.println("이전화면으로 이동합니다");
						break s_loop;
					}
					words[i][0] = eng;
					System.out.println("한글을 입력하세요.>>");
					words[i][1] = scan.next();
					
					words_num++;
				}
				// 10번반복
				if (words_num == 10) {
					System.out.println("10개가 모두 입력되었습니다");
				break;
				}
//				for (int i = 0; i < words.length; i++) {
//					System.out.println("영어를 입력하세요");
//					words[i][0] = scan.next();
//					for (int j = 0; j < words[i].length - 1; j++) {
//						System.out.println("한글을 입력하세요");
//						words[0][j] = scan.next();
//					}
//				}

//				break;

			case 2:
				System.out.println("문제풀이");
				System.out.println("----------------");

				for (int i = ex_num; i < words_num; i++) {

					System.out.println(words[i][0] + "뜻은 무엇일까요?(이전화면 : 99");
					in_str = scan.nextLine();
					if (in_str.equals("99")) {
						System.out.println("이전화면으로 이동함");
						break;
					}
					// 정답비교
					if (words[i][1].equals(in_str)) {
						System.out.println("정답입니다. 다음문제 도전>>");
					} else {
						if (count < 3) {
							System.out.println((count + 1) + "번째 오답입니다 . 다시도전!!");
							count++; // 횟수 추가
							i--; // 현재문제 다시 출제
							continue;
						}

						System.out.println("오답입니다." + "정답은?" + words[i][1]);
						ex_num++; // 문제풀이 1추가 2번째 문제가 출제
						count = 0; // 초기화
					}

				}

//				for (int i = 0; i < words.length; i++) {
//					System.out.println(words[i][0] + "의 뜻은 무엇일까요?");
//					name = scan.next();
//					if (words[i][0] == words[i][0]) {
//						System.out.println("정답입니다!");
//					} else {
//						System.out.println("틀렸습니당");
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
//					System.out.println("문제입력!");
//				} else if (num[i] == 2) {
//					System.out.println("문제풀이!");
//				} else {
//					System.out.println("프로그램 종료");
//				}
//
//			}
//		}

	}//

}//
