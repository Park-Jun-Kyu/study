import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �л����� ������ �Է��ϴ� �迭
		// �̸��� �Է��ϴ� �迭 3��, ������ �Է��ϴ� �迭 [3],[3]��


//		String[] name = { "ȫ�浿", "�̼���", "������" };
		 int[][] score = new int[3][4];
		 String [] name = new String[3];
//		int[][] score = { { 100, 88, 79 }, { 100, 99, 87 }, { 79, 88, 85 } 
//		};
		
		Scanner scan = new Scanner(System.in);
		
		//���
		

		for(int i=0; i<score.length;i++) {
			System.out.println("�̸��� �Է��ϼ�");
			//�̸��Է�
			name[i] = scan.next();
			//�����Է�
			for(int j=0;j<score[i].length-1;j++) {
				System.out.println("������ �Է����ּ���");
				score[i][j] = scan.nextInt();
	
			}
		}
				
			
			//�հ��Է�
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length-1;j++) {
				score[i][3] = score[i][3] + score[i][j];
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.print("\t"+"����\t"+"����\t"+"����\t\n"+"�հ�\t\n");
		for(int i=0; i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
	
				System.out.print(score[i][j]+"\t ");
			}
			System.out.println();
		}
		//�л��� ���� ���� ���� �հ� �迭 �ֱ�
		//�迭 1 ����
		
		
		
		
		
		
		
	}//

}//
