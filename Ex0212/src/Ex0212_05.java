import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름, 국어 , 영어, 수학 , 과학, 합계

		String[]name = new String[3];
		int [][] score = new int[3][5];
		String[] subject = {"","국어","영어","수학","과학","합계"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("이름을 써주세요");
				name[i] = scan.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.println("성적을 써주세요");
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
