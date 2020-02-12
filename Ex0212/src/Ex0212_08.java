import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= new String[3];
		int [][] score = new int [3][4];
		// [ 0,0][0.1][0.2]-점수 [0,3]-합계
		double [] avg = new double[3];
		String [] subject = {"이름","국어","영어","수학","합계","평균"};
		
		Scanner scan = new Scanner(System.in);
		//입력폼
		
		for (int i=0;i<score.length;i++) {  // score.length
			//이름입력
			System.out.println((i+1)+"번 학생의 이름을 입력해주세요.");
			name[i] = scan.next();
			//점수입력
			for(int j=0; j<score[i].length-1; j++ ) {// [ 0,0][0.1][0.2]
			System.out.println(subject[j+1]+ "점수를 입력해주세요.");
			score[i][j] = scan.nextInt();	
			//합계입력
			score[i][score[i].length-1] += score[i][j];
			}
			//avg[i] = score[i][3] / 3; //합계의 나누기 3
			avg[i] = score[i][score[i].length-1] / (score[i].length-1);
		}
		
		//출력
		for(int i = 0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println(); //타이틀 모두출력후 엔터키
		
		for(int i=0; i<score.length; i++) { //int[3][4] 여기는 앞쪽 [3]
			//이름출력
			System.out.print(name[i]+"\t");
			//점수출력
			for(int j=0; j<score[i].length;j++) {  // int[3][4] 여기는 뒤쪽 [4]
				System.out.print(score[i][j]+"\t");
				 
			}
			//평균출력
			System.out.print(avg[i]+"\n");
		}
		
		
		
		
		
		
	}//

}//
