import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ð�� 1���ܱ� 2����� �� ���
		// 200���� �ֹ̼�,�⺸��,������
		// 3�� 200���̻��̸� �ٽ� �Է��ؾ���

		int[][] score = new int[3][4];
		String[] name = new String[3];
		double[] avg = new double[3];
		String[] subject = {" ", "1�����","2�����","�հ�","���"};

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("��ü����� �̸��� �Է��ϼ���");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println("��������� �Է��ϼ���");
				score[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
//				score[i][2] = score[i][2] + score[i][j];
				score[i][score[i].length - 1] += score[i][j];
			}
//			score[i][3] = score[i][2] / 3;
			if(score[i][0]>score[i][1]){
				score[i][3] = score[i][0];
//				score[i][score[i].length-1];
				
			}else{
				score[i][3] = score[i][1];
				
			}
			
			
			
			//��հ��� 2������
			avg[i] = score[i][score[i].length - 1]/2.0;
		}
		
//		if(score[0][1] < score[0][2] || score[1][1] < score[1][2] || score[2][1] < score[2][2]) {
//			
//			
//		}
//		else {
//			
//		}
//		if(score[0][1] < score[0][2]) {
//		score[0][5]	= score[0][2]; 
//		}
		
		
		
		

		System.out.println("�̸�\t1��\t2��\t�հ�\t���");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

			}
			System.out.print(avg[i] + "\t");
			System.out.println();
		}

	}//

}//
