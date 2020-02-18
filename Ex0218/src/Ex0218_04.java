import java.util.Scanner;

public class Ex0218_04 {

	static int stu_count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생성적처리프로그램
		// 학생-class : 학번 / 이름 / 국어 / 영어 / 수학 / 합계 / 평균 / 등수
		// [학생성적처리프로그램]
		// 1, 성적추가
		// 성적추가를 입력하셨습니다. -> 학번입력하세요.>이름,국어,영어,수학
		// 2. 성적수정-> 수정할 학생의 학번을 입력하세요 .>
		// 1.이름 2.국어 3.영어. 4.수학
		// 1.이름을 입력하세요 > 홍길동 -> 홍길동 이름이 수정되었습니다
		// 3. 성적삭제
		//
		// 4. 성적검색
		// 5. 등수처리
		// 0. 종료
		stu[] stu1 = new stu[10];
		int select = 0;
		String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int num_count = 0;
		int[] stu_num = new int[3];

		Scanner scan = new Scanner(System.in);

		while (true) {
			main_print(); // 메인 출력 // 메소드 분리

			select = scan.nextInt();

			switch (select) {
			case 1:
				insert(stu1); // 학생성적추가 메소드 - 메소드 분리
				
				break;

			case 2:
				System.out.println("성적 수정");
				for (int i = 0; i < stu1.length; i++) {
					System.out.println("성적수정 -> 수정할 학생의 학번을 입력하세요.(이전으로 돌아가기 99)");
					num_count = scan.nextInt();
					if (num_count == 99) {
						break;
					}
					if (num_count == stu1[i].num) {
						System.out.println("이름을 입력하세요");
						stu1[i].name = scan.next();
						System.out.println("이름이 수정되었습니다");
						System.out.println("국어성적을 입력하세요");
						stu1[i].kor = scan.nextInt();
						System.out.println("영어성적을 입력하세요");
						stu1[i].eng = scan.nextInt();
						System.out.println("수학성적을 입력하세요");
						stu1[i].math = scan.nextInt();
					} else {
						System.out.println("잘못 입력하였습니다 다시 입력해주세요");
						continue;
					}

					System.out.println(
							"수정된 항목 : " + stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}

				break;
			case 3:
				for (int i = 0; i < stu1.length; i++) {
					System.out.println("성적을 삭제할 학생의 학번을 입력하세요");
					stu1[i].num = scan.nextInt();
					if (stu1[i].num == 99) {
						break;
					}

					stu1[i].kor = 0;
					stu1[i].eng = 0;
					stu1[i].math = 0;
					System.out.println(stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}
				;

				break;
			case 4:

				for (int i = 0; i < stu1.length; i++) {
					System.out.println("성적을 검색할 학생의 학번을 입력하세요");
					stu1[i].num = scan.nextInt();
					System.out.println(stu1[i].name + "\t" + stu1[i].kor + "\t" + stu1[i].eng + "\t" + stu1[i].math);
				}
				break;
			case 5:

				break;

			case 0:

				break;

			}

		} // while
	}//
		// 메인 출력 메소드

	static void main_print() {

		System.out.println("[학생성적처리 프로그램]");
		System.out.println("1:성적추가,2:성적수정,3:성적삭제,4:성적검색,5:등수처리,0:종료");

	}

	static void insert(stu[] stu1) {
		String insert_name = "";
		Scanner scan = new Scanner(System.in);
		
//		for (int i = 0; i < stu1.length; i++) {
//		stu1[i] = new stu();
		// 성적추가 무한반복

//		stu1[i].num=scan.nextInt();
		for (int i = stu_count; i < stu1.length; i++) {
			System.out.println("성적추가를 입력하셨습니다 -> 이름을 입력하세요(이전으로 돌아가기 99)");
			insert_name = scan.next();
			if (insert_name.equals("99")) {
				System.out.println("이전으로 돌아간당");
				break;
			}
			stu1[i] = new stu(); // 값을 넣을수 있는 공간생성
			stu1[i].num = (stu.first_num += 1);
			// Student.first_num = Studen.first_num + 1
			stu1[i].name = insert_name;
			System.out.println("국어성적을 입력하세요");
			stu1[i].kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요");
			stu1[i].eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요");
			stu1[i].math = scan.nextInt();
			Ex0218_04.stu_count++;
			System.out.println(stu_count + "번째 학생 : 학번" + stu1[i].num + "이름" + stu1[i].name + "...");
			// 합계 부르고 싶으면 class에 void 추가해서 stu1[i].total() / avg() 형태로 넣기
		} // for
			// while
	}

}//
