package study;

import java.util.Scanner;

public class st0208_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100���� ���� ���߱� ����
		// 1~100���� �ƹ� ���� �Է�
		// Math.random()�� �̿��Ͽ� �������� �޾ƿ���
		// output ) ���� ����!
		// input ) ���ڸ� �Է����ּ���[0<?<101] : 50
		// output ) 50���� �����ϴ�.
		// input ) ���ڸ� �Է����ּ���[50<?<101] : 75
		// output ) 70���� �����ϴ�.
		// input ) ���ڸ� �Է����ּ���[50<?<75] : 63
		// output ) �����Դϴ�!

		int a = 0;
		int b = 101;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ����!");
		System.out.println("1~100���� ���� ���߱� ����");
		
		
		int random_num = (int) (Math.random() * 100) + 1;

		
		while (true) {
			System.out.printf("���ڸ� �Է����ּ���[ %d < ? < %d]%n" , a, b);
		
				int num = scan.nextInt();

				System.out.println(random_num);
				if (num == 101) {
					break;
				}

				if (num < random_num) {
					System.out.printf("%d���� �����ϴ�.", num);
					System.out.printf("���ڸ� �Է����ּ���[ %d < ? < %d]%n" ,a, b);
					a = num;

				} else if (num > random_num) {
					System.out.printf("%d���� �����ϴ�.", num);
					System.out.printf("���ڸ� �Է����ּ���[ %d < ? < %d]%n" , a,b  );

					b = num;
				} else if (num == random_num) {
					System.out.printf("�����Դϴ�!", num);
					break;
				}

			// for
			
		} // while

		System.out.println("����");

	} // 1

} // 2
