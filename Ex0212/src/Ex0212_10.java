import java.util.Scanner;

public class Ex0212_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] score = new int [3][5] ;
		String [] name = new String [3];
		String [] subject = {"이름","국어","영어","수학","과학","총점"};
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.println("이름 입력");
				name[i] =  scan.next();
			for(int j=0; j<score[i].length-1; j++) {
				System.out.print(subject[j+1]);
				System.out.println("점수 입력");
				score[i][j]= scan.nextInt();
			    score[i][score[i].length-1] += score[i][j];
			}
		}
		
//		for (int i = 0; i < score.length-1; i++) {
//			for (int j = 0; i < score[i].length-1; i++) {

//			}
//
//		}
		
		
		
		
		for(int i=0; i<subject.length; i++ ) {
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
		
		
		
		
	}//

}//
