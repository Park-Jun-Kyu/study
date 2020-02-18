import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		// 로또당첨번호 class // 회차, 당첨번호 6개, 보너스 번호
		// 내가 입력한 번호 class // 회차 번호 6개, 일치개수, 등수, 금액
		// 입력 > 회차입력 > 번호 6자리 입력
		// 회차 검색해서 -> 몇개 일치하는지? 등수는 몇등인지? 금액은 얼마인지?
		// 1등 10억-6개, 2등 1억-5개보너스1개, 3등 1천만원-5개, 4등 1십만원-4개, 5등 1만원-3개
		// 금액 - 1판하는데 . 1000원 처음에 1만원 적립
		
		//로또번호 배열 생성
		//로또번호 1~45번까지 입력
		//로또번호 랜덤으로 섞기
		//입력하는 번호 객체 10개 생성
		//입력 10개 받음
		//일치갯수 체크 ,등수체크,금액체크
		

		int[] lotto_num = new int[6];
		int temp = 0;
		int lotto_index = 0;
		lotto lot = new lotto();
		int[] lotto = new int[45];
		int[] win_num = new int[6];
		int ok = 0;
		System.out.println("로또게임");
		System.out.println("");

		Scanner scan = new Scanner(System.in);


		for(int i=0; i<6; i++) {
			lotto_num[i] = scan.nextInt();
		}
		
		for(int i=0; i<45; i++) {
			lotto[i]=(int)(Math.random()*45);
		}
		for(int i=0; i<45; i++) {
			
			lotto[i]= i + 1;
		}
		
//		for(int i=0; i<45; i++) {
//			lotto_index = (int)(Math.random()*45);
//			temp = lotto[i];
//			lotto[i] = lotto[lotto_index];
//			lotto[lotto_index] = temp;
		
		
		
//		}
		
		 shuffle(lotto);
		
		
		for(int i=0; i<45; i++) {
			for(int j=0; j<6; j++) {
				if(lotto_num[i]==lotto[j]) {
					ok++;
					win_num[i] = lotto[j];
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			
			System.out.println(lotto[i]);
		}
		
		if(ok==0) {
			System.out.println("당첨되지 않았습니다");
		}else {
			System.out.println("당첨되었습니다");
		
		
		switch (ok) {
		
		case 1:
			System.out.println("1개 당첨됬습니다");
			
			break;
		case 2:
			System.out.println("2개 당첨됬습니다");
			
			break;
		case 3:
			System.out.println("3개 당첨됬습니다");
			
			break;
		case 4:
			System.out.println("4개 당첨됬습니다");
			
			break;
		case 5:
			System.out.println("5개 당첨됬습니다");
			
			break;
		case 6:
			System.out.println("6개 당첨됬습니다");
			
			break;
			
		}
			for(int i=0; i<win_num.length; i++) {
				if(!(win_num[i]==0)) {
					System.out.println("당첨번호 : " + win_num[i]);
					
				}
				
			}
		}

	}//main

	
	// 섞기 메소드  
	static void shuffle(int [] lotto) {
		
		int temp = 0;
		int lotto_index = 0;
		
		for(int i=0; i<45; i++) {
			lotto_index = (int)(Math.random()*45);
			temp = lotto[i];
			lotto[i] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
		
	}
}///class
