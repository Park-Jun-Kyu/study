import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~100���� ���� 1���� �������� �̽��ϴ�
		// ���� ������, ���ڸ� ���ߴ� ����
		// �Է��� ���ڰ� �������� 1������ ���� ���ڰ� Ů�ϴ�.�ٽ��Է�
		//������ �۽��ϴ�. �ٽ� �Է�
		// ������ ����
		//������ ��)5���Դϴ�
		
		//�ɼ�>
		//�ڽ��� �Է��� ���ڸ� ��� �߷��� ���ּ���.
		//�ִ� 20������ �ϰڽ��ϴ�
		
		
		Scanner scan = new Scanner(System.in);
		
		int max = 10;
		int min = 0;
		
		int score = 0;
		int win = 0;
		int [] num = new int [100];
		int [][] score_num = new int [1][20];
		int [] count2 = new int[20];
		int count = 0;	
		
		score = (int)(Math.random()*100)+1;
		int win_num = 0;
		
		while(count < 20) {
			
			System.out.println("�������ڸ� �Է��ϼ���");
			num[100] = scan.nextInt();
			
			if(num[100] < score) {;
				
				min = num[100];
				System.out.println(min +"< ?? <" + max);
				System.out.println("�Է��� ���ڰ� �������ں��� �۽��ϴ�");
				System.out.println();
				System.out.println(score);
				
				continue;
				
				
			}
			else if (num[100] > score) {
				max = num[100];
				System.out.println(min +"> ?? >" + max);
				System.out.println("�Է��� ���ڰ� �������ں��� Ů�ϴ�");
				continue;
			}
			else {
			System.out.println("��÷!" + score + "���̾����ϴ�.");
			}
			for (int i=0; i<count; i++) {
				System.out.print(i+"\t");
				for ( int j=0; i<count; j++) {
					System.out.print(num[100]+"\t");
					
					
				}
				System.out.println(count+"��°" + num[count]);
				
			}
				
			
			
			
			
			
		}
		
		
		
		
	}

}
