import java.util.Scanner;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Ex0219_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.학생점수입력
		// 2,학생수정
		// 3,학생삭제
		// 4.학생 검색
		// 5.등수처리
		// 6.종료

		Student[] stu = new Student[10];

		Scanner scan = new Scanner(System.in);

		String name;
		int kor = 0, eng = 0, math = 0;
		int num = 0;

		while (true) {

			System.out.println("1.학생점수 입력 2.학생수정 3,학생삭제, 4.학생검색");
			num= scan.nextInt();
			scan.nextLine();
			loop:
			switch (num) {
			case 1:
				System.out.println("성적입력");
				for (int i = 0; i < stu.length; i++) {
					System.out.println("이름을 넣으세요 << 이전으로 돌아가기 99.>>");
					name = scan.next();
					if (name.equals("99")) {
						System.out.println("이전으로 돌아갑니다");
						break loop;
					}
					System.out.println("국어점수를 넣으세요 .>>");
					kor = scan.nextInt();
					System.out.println("영어점수를 넣으세요 .>>");
					eng = scan.nextInt();
					System.out.println("수학점수를 넣으세요 .>>");
					math = scan.nextInt();
					scan.nextLine();
					stu[i] = new Student(name, kor, eng, math);
					System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);
				}

				break;

			case 2:
				System.out.println("성적 수정");
				System.out.println("수정할 학생의 이름을 넣으세요 << 이전으로 돌아가기 99.>>");
				name = scan.nextLine();
				loop3:
				for (int i = 0; i < stu.length; i++) {
					if (name.equals("99")) {
						System.out.println("이전으로 돌아갑니다");
						break loop3;
					}
					if (stu[i].name.equals(name)) {
						System.out.println(stu[i].name + "이 검색되었습니다. 수정하고 싶은 번호를 입력하세요");
						System.out.println("1.국어점수 2.영어점수 3.수학점수");
						switch (scan.nextInt()) {
						case 1:
							System.out.println("변경점수를 입력하세요.>>");
							stu[i].kor = scan.nextInt();
							scan.nextLine();
							System.out.println("국어점수"+stu[i].kor+"변경되었습니다.");
							break loop3;

			
						case 3:

							break;
						default:
							break;
						}
						
					} else {
						System.out.println("찾을수 없으니 다시 검색해주셈");
						break;
					}

				}

				break;

			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			default:
				break;
			}// swich

			// for

		} // while

//		lotto[] l = new lotto[45];
//		for(int i=0; i<l.length; i++) {
//			l[i] = new lotto(i+1);
//		}

//		for(int i=0; i<l.length; i++) {
//			l[i] = new lotto();
//			l[i].number = i+1;
//		}

//		 Card 52장의 배열을 만들어서
//		 1~13까지, 클로버,다이아몬드,하트,스페이스
//		 만들어보세요
//		Card c1 = new Card(1,"클로버");
//		Card c2 = new Card(2,"클로버");
//		Card c3 = new Card(3,"클로버");
//		Card c4 = new Card(4,"클로버");
//		Card c5 = new Card(5,"클로버");
//		Card c6 = new Card(6,"클로버");
//		System.out.println(c1.number + " "+c1.kind);
//		
//		Card cc1 = new Card();
//		String [] kind = {"클로버","다이아몬드","하트","스페이스"};
//		
//		Card[] c = new Card[52];
//		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {				
//		c[(i*13)+j] = new Card (j+1,kind[i]);
//		c[(i*13)+j] = new Card();
//		c[(i*13)+j].number = j+1;
//		c[(i*13)+j].kind = kind[i];
//		
//			
//		
//			System.out.println(c[i].number+" "+c[i].kind);
//		
//		
//			}
//		
//		}

//		Card c1 = new Card();
//		c1.number = 10;
//		c1.kind = "클로버";
//		System.out.println(c1.number + " "+c1.kind);

	}

}
