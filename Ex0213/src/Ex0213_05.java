import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생성적처리프로그램
		// 1.학생점수추가 2.학생점수수정 3.학생점수삭제 0.종료
		// 1-> 국어점수입력
		// 1.국어 2.영어 3.합계
		// 3명 입력

//		int[][] score = new int[3][4]; //점수,합계
//		String[] name = new String[3]; //이름
//		int [] rank = new int[3]; //등수.
//		int rank_count = 1; //등수카운트
//		double[] avg = new double[3]; //평균
//		String[] subject = {"이름", "국어", "영어","수학", "합계" ,"평균","등수"};
//		Scanner scan = new Scanner(System.in);
//		//이름입력
////		for(int i=0; i<name.length; i++) {
////			name[i]= scan.next();
////		}
//		
//		// 점수입력
//		for (int i = 0; i < score.length; i++) {
//			System.out.println("이름을 입력하세염");
//			name[i] = scan.next();
//			// name[i].trim();
//			//String -> charAt(),subString,length.toupercase
//			for (int j = 0; j < score[i].length - 1; j++) {
//				System.out.println((i+1 ) + "번째 " + subject[j+1] + "점수를 입력하세요..>>");
//				score[i][j] = scan.nextInt();
//				if (!(score[i][j] <= 100 && score[i][j] > 0)) { // 유효성 검사
//					System.out.println("점수 입력상한이 틀렸습니다 다시 입력하셈");
//
//					j--;
//					continue;
//
//				}
//				
//	
//				
//				
//				// 합계= 합계 + 추가점수
//				score[i][score[i].length - 1] += score[i][j];
//			}
//				avg[i] = score[i][score[i].length - 1] / 2;
////				score[i][2] |= score[i][j];
//		}
//		//등수계산
//		for(int i=0; i<score.length;i++ ) { // 0,1,2
//			rank_count=1;
//			for(int j=0;j<score.length; j++) { // 0,1,2
//				if(score[i][2] < score[j][2]) { // 200 199 180 
//					rank_count++;
//					
//				}
//
//			
//			}
//			rank[i] = rank_count; // 등수입력 
//		}
//		
//		
//
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + "\t");
//		}
//		System.out.println();
//		//이름,점수,합계,평균,등수출력
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(name[i] + "\t");
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.print(avg[i]+"\t");
//			System.out.print(rank[i]+"\t");
//			System.out.println();
//		}

//		------------------------------------------------------------------------

		Scanner scan = new Scanner(System.in);

		int stu = 0;
		System.out.println("몇명의 학생을 입력하시겠습니까?>>");
		stu = scan.nextInt();
		int[][] score = new int[stu][4]; // 점수,합계
		String[] name = new String[stu]; // 이름
		int[] rank = new int[stu]; // 등수.
		int rank_count = 1; // 등수카운트
		double[] avg = new double[stu]; // 평균
		String[] subject = { "이름", "투기장평점", "레이더점수", "인성점수", "합계", "평균", "등수" };
		String[][] name_2 = new String[3][4];
		// 이름입력
//		for(int i=0; i<name.length; i++) {
//			name[i]= scan.next();
//		}

		// 점수입력
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력하세염");
			name[i] = scan.next();
			// name[i].trim();
			// String -> charAt(),subString,length.toupercase
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println((i + 1) + "번째 " + subject[j + 1] + "점수를 입력하세요..>>");
				score[i][j] = scan.nextInt();
				if (!(score[i][j] <= 100 && score[i][j] > 0)) { // 유효성 검사
					System.out.println("점수 입력상한이 틀렸습니다 다시 입력하셈");

					j--;
					continue;

				}

				// 합계= 합계 + 추가점수
				score[i][score[i].length - 1] += score[i][j];
			}
			avg[i] = score[i][score[i].length - 1] / 2;
//				score[i][2] |= score[i][j];
		}
		// 등수계산
		for (int i = 0; i < score.length; i++) { // 0,1,2
			rank_count = 1;
			for (int j = 0; j < score.length; j++) { // 0,1,2
//				if(score[i][2] < score[j][2]) { // 200 199 180 
				if (score[i][rank.length - 1] < score[j][rank.length - 1]) {
					rank_count++;

				}

			}
			rank[i] = rank_count; // 등수입력
		}

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		// 이름,점수,합계,평균,등수출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}

	}//

}//
