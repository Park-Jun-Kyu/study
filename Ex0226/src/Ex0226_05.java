import java.util.Scanner;

public class Ex0226_05 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카드게임
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card c = new Card();
		d.shuffle();
		Card[] c1 = new Card[7]; // 사용자1
		Card[] c2 = new Card[7]; // 사용자 2
		int card_count = 0; // 총 배분한 카드수
		int user_count = 0; // 사용자가 가지고 있는 카드수
		int start = 0;
		int count = 0;
		int new_count = 0;

		loop: while (true) {

			System.out.println("게임시작 1.시작 // 2. 한장추가 // 3.클로버 숫자 // 4. 종료 ");
			start = scan.nextInt();
			switch (start) {
			case 1:
				System.out.println("사용자");
				for (int i = 0; i < 3; i++) {
					c1[i] = d.pick(i);
					System.out.println(c1[i]);
					card_count++;
					user_count++;
				}
				System.out.println("------------");
				System.out.println("사용자2");
				for (int i = 3; i < 6; i++) {
					c2[i - 3] = d.pick(i);
					System.out.println(c1[i - 3]);
					card_count++;
				}

				break;

			case 2:

				if (user_count <= 7) {
					System.out.println("7장 모두 분배되었습니다");
					break;
				}

				for (int i = 0; i < 2; i++) {
					c1[user_count] = d.pick(card_count);
					card_count++;
					c2[user_count] = d.pick(card_count);
					card_count++;

				}
				user_count++;

				break;
			case 3:

//				System.out.println("클로버 숫자" + c);

			case 4:

				System.out.println("시스템종료");

				break loop;
			default:
				break;

			}

		}

	}

}

//		switch (start) {
//		case 1:
//
//			for (int i = 0; i < random; i++) {
//				for (int j = 10; j < random1; j++) {
////					if( start == 99) {
////						break;
////					}
////					if (start == 1) {
//						System.out.println("user");
//						System.out.println(d.pick(count));
//						System.out.println(d.pick(i + 1));
//						System.out.println(d.pick(i + 2));
//						System.out.println("com");
//						System.out.println(d.pick(j));
//						System.out.println(d.pick(j + 1));
//						System.out.println(d.pick(j + 2));
//						break;
//					
//				}
//			}
//		case 2:
//			for (int i = 0; i < random; i++) {
//				for (int j = 10; j < random1; j++) {
//					start2 = scan.nextInt();
//					System.out.println("user");
//					System.out.println(d.pick(i));
//					System.out.println("com");
//					System.out.println(d.pick(j));
//					start2 = scan.nextInt();
//					System.out.println("user");
//					System.out.println(d.pick(i));
//					System.out.println("com");
//					System.out.println(d.pick(j));
//				}
//			}
//			break;
//		case 3:
//
//			break;
//		default:
//			break;
//
//		}
//
//	}
//
//}

//class Card extends Object {
//	
//	static final int KIND_MAX = 4;
//	static final int KIND_NUMBER = 13;
//	static final int DIAMOND = 4;
//	static final int HEART = 3;
//	static final int SPAED = 2;
//	static final int CLOVER = 1;
//	
//	int kind = 0;
//	int number = 0;
//	
//	Card(){
//		super();
//	}
//	
//	Card(int kind,int number){
//		super();
//		this.kind =kind;
//		this.number =number;
//		
//	}
//	
//	public String toString(){
//
//		String [] kinds = {"DIAMOND","HEART","SPAED","CLOVER"};
//		String numbers ="0123456789XJQK";
//		return kinds[kind] + numbers.charAt(number);
//	}
//	
//	
//}