import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �̸�, ���� , ����, ���� , ����, �հ�

		String[]name = new String[3];
		int [][] score = new int[3][5];
		String[] subject = {"","����","����","����","����","�հ�"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("�̸��� ���ּ���");
				name[i] = scan.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.println("������ ���ּ���");
				score[i][j]= scan.nextInt();
		}
		}
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				
//				for(int j=0; j<score[i].length-1;j++) {
//				score[i][3] = score[i][3] + score[i][j];
//			}
//			System.out.println();
				
				
			}
		}
		
		
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
			
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
