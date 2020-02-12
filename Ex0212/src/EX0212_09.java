import java.util.Scanner;

public class EX0212_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//게시판 프로그램
		//번호(1) - int  이름 제목 글내용 -String 조회수 -int
		//10개까지 입력이 가능한데 
		//1 홍길동 게시판 완성 게시판이 완성되었습니다. 조회수 0
		String[][] score = new String [2][5];
		int [] name = new int [3];
		int [] num = new int[5];
		String [] subject = {"번호\t","이름\t","제목\t","글내용\t","조회수\t"};
		Scanner scan = new Scanner(System.in);
		

		
		for(int i=0; i<score.length; i++) {
			System.out.println("게시판에 들어갈 번호를 입력하세요");
			name[i] =scan.nextInt();
			for(int j=0; j<score[i].length-1; j++) {
//				System.out.println("게시판에 들어갈 <내용>을 입력하세요");
				System.out.println(subject[j]+ "을 입력해주세요.");
				score[i][j] = scan.nextLine();
				scan.nextLine();
				
			}
			System.out.println("조회수를 입력하세요");
				num[i] = scan.nextInt();
			
//			
		}
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]);
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]);
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(num[i]);
			System.out.println();
			
			
			
		}

	}

}
