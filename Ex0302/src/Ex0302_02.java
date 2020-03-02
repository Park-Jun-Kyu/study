import java.util.ArrayList;
import java.util.Scanner;

public class Ex0302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Student22> list = new ArrayList<Student22>();
		Scanner scan = new Scanner(System.in);
		ArrayList<Stu_info> list = new ArrayList<Stu_info>();
		String name[] = { "홍길동", "이순신" ,"홍길동"};
		String major[] = { "영문학과", "경제학과" , "미술학과" };
		int[] grade = { 1, 2 , 4 };
		String[] tel = { "02-222-3333", "02-2222-2222", "02-782-3232" };

		list.add(new Stu_info(name[0], major[0], grade[0], tel[0]));
		list.add(new Stu_info(name[1], major[1], grade[1], tel[1]));
		list.add(new Stu_info(name[2], major[2], grade[2], tel[2]));

		while (true) {
			System.out.println("1) 학생정보입력 2)출력 3)검색");
			int num = scan.nextInt();
			scan.nextLine();

			switch (num) {
			case 1:

//				while (true) {
//					System.out.println("이름을 입력하세요 (이전화면 99");
//					String name1 = scan.next();
//					if (name1.equals("99")) {
//						System.out.println("이전화면으로 돌아감");
//						break;
//					}
//					System.out.println("전공을 입력하세요.>>");
//					String major1 = scan.next();
//					System.out.println("학년을 입력하세요.>>");
//					int grade1 = scan.nextInt();
//					scan.nextLine();
//					System.out.println("전화번호를 입력하세요.>>");
//					String tel1 = scan.nextLine();
//					list.add(new Stu_info(name1, major1, grade1, tel1));
//					list.add(new Stu_info(name[0], major[0], grade[0], tel[0]));
//				}
				break;
			case 2:
				// 데이터가 있는지 확인
				if(list.isEmpty()) {
					System.out.println("데이터가 없습니다");
					break;
				}
				//반복출력
				for(int i=0; i<list.size(); i++) {
					Stu_info stu = (Stu_info)list.get(i);
					System.out.print(stu.hak_num+"\t"+stu.name+"\t");
					System.out.println(stu.major);
				
						}
				break;

			case 3:
				System.out.println("검색할 이름을 입력하세요.>> (이전화면 99");
				while(true) {
				String name2 = scan.next();
				if(name2.equals("99")) {
					break;
				}
				for(int i =0; i<list.size(); i++) {
					Stu_info stu = (Stu_info)list.get(i);
					if(name2.equals(stu.name)) {
						System.out.println("찾는 학생은");
						System.out.println(stu.hak_num + " " + stu.name + " " + stu.major + " " + stu.grade + " " + stu.tel);
						
					}
				}
				}
				break;
			}
		}
	}
}
