import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����ó�� ���α׷�
		// �̸�,����,����,���� �հ� ���
		
		int [][] score = new int [3][5] ;
		String [] name = new String [3];
		String [] subject = {"","�̸�","����","����","����"};
		double [] avg = new double[3];
		Scanner scan = new Scanner(System.in);
		
		
//		for(int i=0; i<subject.length; i++) {
//			for(int j=0; j<subject[i].length(); i++) {
//			System.out.println(subject);
//			}
//		}
			
		for(int i=0; i<score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = scan.next();
			for(int j=0; j<score[i].length-2; j++) {
				System.out.println("������ �Է��ϼ���");
				score[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length-2; j++) {
				score[i][score[i].length-2] = score[i][score[i].length-2]+ score[i][j];
				
			}
			avg[i] = score[i][score[i].length-2] / 2.0;
			
		}
		
		
		
		
		
//		for(int i=0; i<subject.length; i++) {
//			for(int j=0; j<subject[i].length(); i++) {
//			System.out.println(subject);
//			}
//		}
		System.out.println("�̸�\t����\t����\t����\t�հ�\t���");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ "\t");
		
			}
			System.out.print(avg[i]+ "\t");
			System.out.println();
	
		
		}
		
		
		
		
		

	}//

}//
