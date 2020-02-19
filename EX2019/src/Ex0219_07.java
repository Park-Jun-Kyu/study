import java.util.Scanner;

public class Ex0219_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1[] stu = new Student1[10];
		int num1 = 0;
		String name = "";
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.성적입력 , 2.성적수정 , 3.성적삭제");
			num1 = scan.nextInt();
			switch (num1) {
			case 1:
				for (int i = 0; i < stu.length; i++) {
					System.out.println("이름을 적어주세요");
					name = scan.next();
					if (name.equals("99")) {
						System.out.println("이전으로 돌아갑니다");
						break;
					}
					System.out.println("국어점수를 입력하세요");
					kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					math = scan.nextInt();
					stu[i] = new Student1(name, kor, eng, math);
					System.out.println(stu[i].name + " " + stu[i].total + " " + stu[i].avg);
				}
				break;

			case 2:
				loop:
				for (int i = 0; i < stu.length; i++) {
					System.out.println("수정할 학생의 이름을 입력하세요");
					name = scan.next();
					if (stu[i].name.equals(name)) {
						System.out.println("어떤 과목을 수정하시겠습니까 1,국어 2,수학 3,영어");
						switch (scan.nextInt()) {
						case 1:
							System.out.println("수정할 국어점수를 입력해주세요");
							stu[i].kor = scan.nextInt();
							System.out.println("국어점수가 수정되었습니다!");
							
							break loop;
						case 2:
							System.out.println("수정할 수학점수를 입력해주세요");
							stu[i].kor = scan.nextInt();
							System.out.println("수학점수가 수정되었습니다!");
							
							break loop;
						case 3:
							System.out.println("수정할 영어점수를 입력해주세요");
							stu[i].kor = scan.nextInt();
							System.out.println("영어점수가 수정되었습니다!");
							
							break loop;

						default:
							break;
						}
						
					}
				}

				break;
			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}

		} // while

	}// main

}// class
