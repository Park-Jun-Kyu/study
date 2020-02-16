import java.util.Scanner;

public class Ex0214_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적처리 프로그램
		// ----------------------
		int score[][] = new int[10][4];
		int num = 0;
		int in_put = 0;
		String [] subject = {"이름","국어","영어","수학","합계","평균","등수"};
		String [] name = new String[3];
		String name_ch = "";
		int words_num = 0;
		while (true) {
		double [] avg = new double [10];
		int rank_count = 0; //등수 변수
		int stu_num = 0,s_num=0; //학생입력 수, 선택번호
		String y_or_n =""; // 선택
		System.out.println("성적처리 프로그램");
		System.out.println("1.성적입력!, 2.성적출력!, 3.프로그램종료 ,4.학생성적검색");
		System.out.println("원하는 번호를 입력하세요");
	

		Scanner scan = new Scanner(System.in);

		
		num = scan.nextInt();
		scan.nextLine();
		loop:
			switch (num) {
			case 1:
//				System.out.println("성적입력!");
				
				
				
				
				
					for(int i=0; i<score.length; i++) {
							System.out.println("누구의 성적을 입력하시겠습니까, 종료 99");
							name_ch = scan.next();
							if(name_ch.equals("99")) {
							System.out.println("이전으로 돌아갑니다");
							break loop;
						}
						name[i]=name_ch;
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println(subject[j+1]+"점수는 몇점입니까");
						score[i][j] = scan.nextInt();
						score[i][score[i].length-1] += score[i][j];
					}
					
					avg[i] = score[i][score[i].length-1]/3;
					words_num++;
					
				}
				
				

				break;
			case 2:
				while(true) {
				
				for(int i=0; i<subject.length; i++) {
					System.out.print(subject[i] +"\t");
				}
				System.out.println();
				
				for(int i=0; i<words_num; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(avg[i]+"\t");
					System.out.println();
//					System.out.print(avg[i]+"\t");
				System.out.println();
				}
				System.out.println("다시 출력하시겠습니까?(y/n)");
				scan.nextLine();
				
				if(y_or_n.equals("n")||y_or_n.equals("n")) {
					System.out.println("이전화면으로 이동합니다");
					break;
				}
	
				}

				
			case 3:
				
				System.out.println("등수처리를 하셨습니다");
				for(int i=0; i<words_num; i++) {
					rank_count = 1;
					for(int j=0; j<words_num; j++) {
					if(	score[i][score[i].length-1] < score[j][score[i].length-1]) {
						rank_count++;
					}//if
						
					}//for2
				}//for1
				

			
				
			case 4:
				System.out.println("학생성적 검색을 입력하셨슴");
				
				System.out.println("원하는 학생의 이름 입력하셈");
				name_ch = scan.nextLine();
				//학생 이름으로
				for(int i=0; i<words_num; i++) {
					if(name_ch.equals(name[i])) {
						num = i;
						break;
					}
						num =-1; // 없을때 -1로 셋팅
					
					
				}
				if(!(num==1)) {
					

					for(int i=0; i<subject.length; i++) {
						System.out.print(subject[i] +"\t");
					}
					System.out.println();
					
					
				
//				for(int i=0; i<words_num; i++) {
					System.out.print(name[num]+"\t");
					for(int j=0; j<score[num].length; j++) {
						System.out.print(score[num][j]+"\t");
					}
					System.out.print(avg[num]+"\t");
					System.out.println();
//				}
				break;
			}
				System.out.println("원하는 학생이 없습니다");
				// 학생을 입력
				// 이름을 비교합니다.. in_name.equals(name[i])
				

			default:
				break;
			}

		}

	}

}
