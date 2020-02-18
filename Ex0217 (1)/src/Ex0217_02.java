import java.util.Scanner;

public class Ex0217_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] score =new int [3][4] ;
		String [] name = new String [3];
		String [] subject = {"이름","국어","영어","수학","합계","평균","등수"};
		double avg [] = new double [10];
		int [] rank = new int [3];
		int rank_count = 0;
		String name_check = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("학생 이름을 입력하세요,종료하시려면 0번을 눌러주세요");
			name_check=scan.next();
			if(name_check.equals("0")) {
				break;
			}
			
			name[i] = name_check;
			for(int j=0; j<score[i].length-1; j++) {
				System.out.println(subject[j+1]+"성적을 입력하세요");
				score[i][j]=scan.nextInt();
				score[i][score[i].length-1] += score[i][j];
			}
			avg[i] = score[i][score[i].length-1] /3;
		}
		
		
		for(int i=0; i<score.length; i++) {
			rank_count = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i][0] < score[j][0]) {
					
			rank_count++;
				}
				
			}
			
			rank[i] = rank_count;
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
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
		
		
		
		
	}//

}//


