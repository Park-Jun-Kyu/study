import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л�����ó�����α׷�
		// 1.�л������߰� 2.�л��������� 3.�л��������� 0.����
		// 1-> ���������Է�
		// 1.���� 2.���� 3.�հ�
		// 3�� �Է�

//		int[][] score = new int[3][4]; //����,�հ�
//		String[] name = new String[3]; //�̸�
//		int [] rank = new int[3]; //���.
//		int rank_count = 1; //���ī��Ʈ
//		double[] avg = new double[3]; //���
//		String[] subject = {"�̸�", "����", "����","����", "�հ�" ,"���","���"};
//		Scanner scan = new Scanner(System.in);
//		//�̸��Է�
////		for(int i=0; i<name.length; i++) {
////			name[i]= scan.next();
////		}
//		
//		// �����Է�
//		for (int i = 0; i < score.length; i++) {
//			System.out.println("�̸��� �Է��ϼ���");
//			name[i] = scan.next();
//			// name[i].trim();
//			//String -> charAt(),subString,length.toupercase
//			for (int j = 0; j < score[i].length - 1; j++) {
//				System.out.println((i+1 ) + "��° " + subject[j+1] + "������ �Է��ϼ���..>>");
//				score[i][j] = scan.nextInt();
//				if (!(score[i][j] <= 100 && score[i][j] > 0)) { // ��ȿ�� �˻�
//					System.out.println("���� �Է»����� Ʋ�Ƚ��ϴ� �ٽ� �Է��ϼ�");
//
//					j--;
//					continue;
//
//				}
//				
//	
//				
//				
//				// �հ�= �հ� + �߰�����
//				score[i][score[i].length - 1] += score[i][j];
//			}
//				avg[i] = score[i][score[i].length - 1] / 2;
////				score[i][2] |= score[i][j];
//		}
//		//������
//		for(int i=0; i<score.length;i++ ) { // 0,1,2
//			rank_count=1;
//			for(int j=0;j<score.length; j++) { // 0,1,2
//				if(score[i][2] < score[j][2]) { // 200 199 180 
//					rank_count++;
//					
//				}
//
//			
//			}
//			rank[i] = rank_count; // ����Է� 
//		}
//		
//		
//
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + "\t");
//		}
//		System.out.println();
//		//�̸�,����,�հ�,���,������
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(name[i] + "\t");
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.print(avg[i]+"\t");
//			System.out.print(rank[i]+"\t");
//			System.out.println();
//		}

//		------------------------------------------------------------------------

		Scanner scan = new Scanner(System.in);

		int stu = 0;
		System.out.println("����� �л��� �Է��Ͻðڽ��ϱ�?>>");
		stu = scan.nextInt();
		int[][] score = new int[stu][4]; // ����,�հ�
		String[] name = new String[stu]; // �̸�
		int[] rank = new int[stu]; // ���.
		int rank_count = 1; // ���ī��Ʈ
		double[] avg = new double[stu]; // ���
		String[] subject = { "�̸�", "����������", "���̴�����", "�μ�����", "�հ�", "���", "���" };
		String[][] name_2 = new String[3][4];
		// �̸��Է�
//		for(int i=0; i<name.length; i++) {
//			name[i]= scan.next();
//		}

		// �����Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = scan.next();
			// name[i].trim();
			// String -> charAt(),subString,length.toupercase
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println((i + 1) + "��° " + subject[j + 1] + "������ �Է��ϼ���..>>");
				score[i][j] = scan.nextInt();
				if (!(score[i][j] <= 100 && score[i][j] > 0)) { // ��ȿ�� �˻�
					System.out.println("���� �Է»����� Ʋ�Ƚ��ϴ� �ٽ� �Է��ϼ�");

					j--;
					continue;

				}

				// �հ�= �հ� + �߰�����
				score[i][score[i].length - 1] += score[i][j];
			}
			avg[i] = score[i][score[i].length - 1] / 2;
//				score[i][2] |= score[i][j];
		}
		// ������
		for (int i = 0; i < score.length; i++) { // 0,1,2
			rank_count = 1;
			for (int j = 0; j < score.length; j++) { // 0,1,2
//				if(score[i][2] < score[j][2]) { // 200 199 180 
				if (score[i][rank.length - 1] < score[j][rank.length - 1]) {
					rank_count++;

				}

			}
			rank[i] = rank_count; // ����Է�
		}

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		// �̸�,����,�հ�,���,������
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}

	}//

}//
