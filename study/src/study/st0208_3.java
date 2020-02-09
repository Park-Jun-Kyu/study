package study;

import java.util.Scanner;

public class st0208_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지 숫자 맞추기 게임
		// 1~100까지 아무 숫자 입력
		// Math.random()을 이용하여 랜덤숫자 받아오기
		// output ) 게임 시작!
		// input ) 숫자를 입력해주세요[0<?<101] : 50
		// output ) 50보다 높습니다.
		// input ) 숫자를 입력해주세요[50<?<101] : 75
		// output ) 70보다 낮습니다.
		// input ) 숫자를 입력해주세요[50<?<75] : 63
		// output ) 정답입니다!

		int a = 0;
		int b = 101;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("게임 시작!");
		System.out.println("1~100까지 숫자 맞추기 게임");
		
		
		int random_num = (int) (Math.random() * 100) + 1;

		
		while (true) {
			System.out.printf("숫자를 입력해주세요[ %d < ? < %d]%n" , a, b);
		
				int num = scan.nextInt();

				System.out.println(random_num);
				if (num == 101) {
					break;
				}

				if (num < random_num) {
					System.out.printf("%d보다 높습니다.", num);
					System.out.printf("숫자를 입력해주세요[ %d < ? < %d]%n" ,a, b);
					a = num;

				} else if (num > random_num) {
					System.out.printf("%d보다 낮습니다.", num);
					System.out.printf("숫자를 입력해주세요[ %d < ? < %d]%n" , a,b  );

					b = num;
				} else if (num == random_num) {
					System.out.printf("정답입니다!", num);
					break;
				}

			// for
			
		} // while

		System.out.println("종료");

	} // 1

} // 2
