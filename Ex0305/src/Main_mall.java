import java.util.ArrayList;
import java.util.Scanner;

public class Main_mall {

	public static void main(String[] args) {
		// 메뉴 명령어 ( 카드 형태에서 메인 메소드 따로있고 deck로 따로 뽑아 썻던거
		// 8 회원정보 검색 9 회원 정보 보기

		Scanner scan = new Scanner(System.in);
		Member m = new Member(null, null);
		Product p = new Product();
		ArrayList<Member> m1 = new ArrayList<Member>();
		ArrayList<Member> login = new ArrayList<Member>();
		ArrayList<Product> User = new ArrayList<Product>();
		int num = 0;
		String id = "", pw = "", name = "", tel = "";
		int money = 0, bonus_point = 0;
		int LCD_count =0 , LED_count = 0 , OLEDTV_count = 0;
		while (true) {
			System.out.println("1.회원가입,2 로그인 ,4:제품검색 ,8.회원검색 9.회원출력");
			num = scan.nextInt();

			switch (num) {
			case 1:
				loop: while (true) {
					System.out.println("회원가입을 위해 id를 입력하세요");
					m.id = scan.next();
					for (int i = 0; i < m.id.length(); i++) {
						if (m.id.length() < 3) {
							System.out.println("3글자 이상이어야 합니다");
							continue loop;
						}
					}
					System.out.println("비밀번호를 입력하세요");
					m.pw = scan.next();
					System.out.println("이름을 입력하세요");
					m.name = scan.next();
					System.out.println("전화번호를 입력하세요");
					m.tel = scan.next();
					System.out.println("보유금액을 입력하세요");
					m.money = scan.nextInt();
					System.out.println("회원가입이 완료되었습니다");
					break;

				}
				m1.add(new Member(m.id, m.pw, m.name, m.tel, m.money));
				break;
			case 2:

				System.out.println("로그인 창");
				System.out.println("아이디를 입력하세요");
				id = scan.next();
				if (!(id.equals(m.id))) {
					System.out.println("일치하는 아이디가 없습니다 다시 입력하세요");
					break;
				}
				for (int i = 0; i < login.size(); i++) {
					Member m_list = (Member) m1.get(i);
				}
				if (id.equals(m.id)) {
					System.out.println("패스워드를 입력하세요");
					pw = scan.next();
					if (!(pw.equals(m.pw))) {
						System.out.println("일치하는 비밀번호가 없습니다 다시 입력하세요");
					} else if (pw.equals(m.pw)) {
						login.add(new Member(m.id, m.pw));
						System.out.println("로그인 되었습니다");
					}
				}

				break;

			case 4:
				System.out.println("상품 보기");
				num = scan.nextInt();

				switch (num) {
				case 1:
					for (int i = 0; i < m1.size(); i++) {
						Member m_list = (Member) m1.get(i);
					}
					if (m.money < p.price) {
						System.out.println("잔액이 부족해서 구매가 안됬습니다");
						return;
					}
				System.out.println("LCD TV를 구매하셨습니다");
				if (p instanceof SamsungTv) {
					LCD_count++;
					System.out.println("현재 tv 대수 : " + LCD_count);
					System.out.println("현재 잔액 : " +m. money);
				}
				m.money = m.money - p.price;
				bonus_point = bonus_point + m.money/10;
				System.out.println("현재 돈과 포인트  : " + m.money + "//" + bonus_point);
				
				
				
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;

				default:
					break;
				}

				break;

			case 8:
				System.out.println("회원 정보 검색");
				System.out.println("검색할 아이디를 입력하세요");
				id = scan.next();
				for (int i = 0; i < m1.size(); i++) {
					Member m_list = (Member) m1.get(i);
					if (id.equals(m.id)) {
						System.out.println(m.id + "가 있습니다");
					} else {
						System.out.println("회원이 없습니다");
					}
				}

				break;

			case 9:
				System.out.println("회원 정보 출력");
				for (int i = 0; i < m1.size(); i++) {
					Member m_list = (Member) m1.get(i);
				}

				System.out.println("회원 아이디 : " + m.id + "\t비밀번호 : " + m.pw + "\t이름" + m.name + "\t전화번호" + m.tel
						+ "\t보유금액" + m.money);
			default:
				break;
			}

		}

	}

}
