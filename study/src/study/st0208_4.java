package study;

import java.util.Scanner;

public class st0208_4 {
	
	public static void main(String[] args) {
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

    int min = 0;
    int max = 101;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("���� ����!");
    System.out.println("1~100���� ���� ���߱� ����");
    
    int random_num = (int)(Math.random()*100) + 1;
    
    while (true) {

      System.out.printf("���ڸ� �Է����ּ���[%d < ? < %d]%n" , min , max );  
      int num = scan.nextInt();

      if (num < random_num) {
         System.out.printf("%d���� �����ϴ�.", num);
         min = num;
         
      } else if (num > random_num) {
         System.out.printf("%d���� �����ϴ�.", num);
         max = num;

      } else if (num == random_num) {
         System.out.printf("�����Դϴ�!", num);
         break;
      }

    } // while
}//
}//
