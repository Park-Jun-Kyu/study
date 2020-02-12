import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 학생들의 점수를 입력하는 배열
		// 이름을 입력하는 배열 3개, 점수를 입력하는 배열 [3],[3]개


//		String[] name = { "홍길동", "이순신", "강감찬" };
		 int[][] score = new int[3][4];
		 String [] name = new String[3];
//		int[][] score = { { 100, 88, 79 }, { 100, 99, 87 }, { 79, 88, 85 } 
//		};
		
		Scanner scan = new Scanner(System.in);
		
		//출력
		

		for(int i=0; i<score.length;i++) {
			System.out.println("이름을 입력하셈");
			//이름입력
			name[i] = scan.next();
			//점수입력
			for(int j=0;j<score[i].length-1;j++) {
				System.out.println("점수를 입력해주세요");
				score[i][j] = scan.nextInt();
	
			}
		}
				
			
			//합계입력
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length-1;j++) {
				score[i][3] = score[i][3] + score[i][j];
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.print("\t"+"국어\t"+"영어\t"+"수학\t\n"+"합계\t\n");
		for(int i=0; i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
	
				System.out.print(score[i][j]+"\t ");
			}
			System.out.println();
		}
		//학생의 국어 영어 수학 합계 배열 넣기
		//배열 1 증가
		
		
		
		
		
		
		
	}//

}//
