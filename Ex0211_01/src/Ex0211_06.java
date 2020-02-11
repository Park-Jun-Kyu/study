import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시간표
		// 월 화 수 목 금
		// 1 국어 수학 국어 영어 국사
		// 2 과학1 영어 수학 과학2 세계사
		// 3 수학 과학1 국사 윤리 체육
		// 4 음악 미술 체육 국어 영어

//		Scanner scan = new Scanner(System.in);
//		
//		String [][]time = new String[4][5];
//		
//		String time [][] = {{"국어,수학,국어,영어,국사"},{"과학1,영어,수학,과학2,세계사"},{"수학,과학1,국사,윤리,체육"},
//		{"음악,미술,체육,국어,영어"}};
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println("요일을 입력하세요");
//				time[i][j] = scan.next();
//			}
//		}
//		
//		for(int i=0; i<time.length; i++) {
//			for(int j=0; j<time[i].length; j++) {
//				System.out.println(time[i][j]);
//			}
//			System.out.println();
//		}

//		Scanner scan = new Scanner(System.in);
//		
//		String [][]time = new String[4][5];
//		
//		for(int i=0; i<time.length; i++) {
//		for(int j=0; j<time[i].length; j++) {
//			System.out.println((i*5)+j+1+"번째 과목을 입력하세요.");
//			time[i][j] = scan.next();
//		}
//		System.out.println();
//	}
//		
//		
//		System.out.println("시간표");
////		System.out.print("\t");
////		for(int i=0;i<5;i++) {
//			System.out.print("월");
//			System.out.print("\t화");
//			System.out.print("\t수");
//			System.out.print("\t목");
//			System.out.print("\t금\n");
////		}
//		for(int i=0; i<time.length; i++) {
//			System.out.print(i+1);
//		for(int j=0; j<time[i].length; j++) {
//			System.out.print(time[i][j]+"\t");
//		}
//		System.out.println();
//	}
//		

		// 2,4,6,8,10,12,14,16
		// 18 ..........

//		int[][] score = new int[5][8];
//
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				score[i][j] = ((i*8)+j+1)*2;  //0~39
//
//			}
//		}
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}

		
		Scanner scan = new Scanner(System.in);
		
		int in_x = 0 ;
		int in_y = 0 ;
		
		int [][] score = new int [3][3]; //0,1
		String [][] score_in = new String[3][3]; //내가 입력해서 저장하는 배열
		
		while(true) {
			
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = (int)(Math.random()*2);
				
				
			}
		}
		
		System.out.println("x좌표를 입력하세요.>>(종료:99)");
		in_x = scan.nextInt();
		if(in_x == 99) {
			System.out.println("시스템 종료");
			break;
		}
		System.out.println("y좌표를 입력하세요.>>");
		in_y = scan.nextInt();
		
		if(score[in_x][in_y]==1) {
			score_in[in_x][in_y] = "당첨";
		}else {
		   score_in[in_x][in_y] ="꽝";
		}
		
		System.out.println("--------------------------");
		System.out.println("     [ 좌표맞추기 게임 ]");
		System.out.println("--------------------------");
		System.out.print("\t0\t1\t2\n");
		
		
		for(int i=0; i<score_in.length; i++) {
			System.out.print(i+"\t");
			for(int j=0; j<score_in[i].length; j++) {
				System.out.print(score_in[i][j]+ "\t");
			}
			
			
			System.out.println();
		}
		
		}
		
		//좌표x 1
		//좌표y 2 [1,2] -> 1들어가 있으면 score_in[1,2] 당첨 입력
		//0들어가 있으면 score_in[1,2]  꽝 입력
		// 	  0  1  2
		// 0
		// 1
 		// 2
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // class
}// main
