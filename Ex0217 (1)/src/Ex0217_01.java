import java.util.Scanner;

public class Ex0217_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int [][] score = new int [3][3];
		String [] name = new String[3];
		String [] subject = {"�̸�","����","����","����","�հ�","���"};
		
		
		
		
		for(int i=0; i<score.length; i++) {
			System.out.println("�̸��Է�");
			name[i] = scan.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.println(subject[j+1]+"�����Է�");
				score[i][j]=scan.nextInt();
				score[i][score[i].length] += score[i][j];
			}
			avg[i]= score[i][score[i].length] / 3;
		}
		
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}//

}//
