import java.util.Scanner;

public class EX0213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lotto = new int[45];
		int [] lotto_num = new int[45];
		int [] win_num = new int[6];
		int temp = 0;
		int lotto_index = 0;
		int ok = 0;
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
		
		for(int i=0; i<45; i++) {
			lotto_index = (int)(Math.random()*45);
			temp = lotto[i];
			lotto[i] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
		
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
		
	}//

}//
