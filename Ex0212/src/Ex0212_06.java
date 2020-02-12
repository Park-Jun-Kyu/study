import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 양궁경기 1차겨기 2차경기 합 평균
		// 200만점 최미선,기보배,장혜진
		// 3명 200점이상이면 다시 입력해야함

		int[][] score = new int[3][4];
		String[] name = new String[3];
		double[] avg = new double[3];
		String[] subject = {" ", "1차경기","2차경기","합계","평균"};

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("양궁선수의 이름을 입력하세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println("경기점수를 입력하세요");
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
			
			
			
			//평균게임 2개점수
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
		
		
		
		

		System.out.println("이름\t1차\t2차\t합계\t평균");
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
