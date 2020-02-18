import java.util.Scanner;

public class Ex0217_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		board[] b = new board[2];
		int b_num = 0;
		int v_num = 0;
		String [] subject = {"번호","제목","내용","작성자","조회수"};
		
		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<subject.length; i++) {
//			System.out.print(subject[i]+"\t");
//		}
		
			for(int i=0; i<b.length; i++) {
				b[i] = new board();
				System.out.println("[게시판 글 등록]");
				b[i].num = b_num+1;
//			System.out.println("번호를 입력하세요");
//			b[i].num  = scan.nextInt();
			System.out.println("제목을 입력하세요");
			b[i].name = scan.next();
			System.out.println("내용을 입력하세요");
			b[i].list = scan.next();
			System.out.println("작성자를 입력하세요");
			b[i].per = scan.next();
			scan.nextLine();
//			System.out.println("조회수를 입력하세요");
//			b[i].reading = scan.nextInt();
			b[i].view_num = v_num; //조회수 초기화
			b_num++; //글번호 자동증가
			System.out.println("-----------------------------");
			System.out.println("      [ 글 리스트 출력 ]");
			System.out.println("-----------------------------");
		
				System.out.println(subject[0]+"\t"+subject[1]+"\t"+subject[2]+"\t"+subject[3]+"\t"+subject[4]+"\t");
			
			for(int j=0; j<b_num; j++) {
				
				System.out.print(b[j].num+"\t"+b[j].name+"\t"+b[j].list+"\t"+b[j].per+"\t"+b[j].view_num+"\t");
				System.out.println();
			}
//			System.out.println(subject[i]+"\t");
//			b[i].print();
		}
	
	
		
		
		
	}

}
