import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] score = new int [3][4];
		String [] name = new String [3];
		String [] subject = {"�̸�","����","����","����","�հ�","���","���"};
		Scanner scan = new Scanner(System.in);
		int [] avg = new int[3];
		int [] rank = new int [3];
		int rank_count = 0;
		for(int i=0; i<score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = scan.next();
			for(int j=0; j<score[i].length-1; j++) {
				System.out.println(subject[j+1]+"������ �Է��ϼ���");
				score[i][j] = scan.nextInt();
				score[i][score[i].length-1]+=score[i][j];
			}
			avg[i] = score[i][score[i].length-1] /3;
		}
		
		for(int i=0; i<score.length; i++) {
			rank_count=1;
			for(int j=0; j<score.length; j++) {
				if( score[i][rank.length-1] <  score[j][rank.length -1]) {

					rank_count ++;
				}
					
			}
			rank[i] = rank_count;
			
		}
		
		
		
		
		
		
		
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
				System.out.print(avg[i] + "\t");
				System.out.print(rank[i] + "\t");
				System.out.println();
		}
		
		
	}

}
