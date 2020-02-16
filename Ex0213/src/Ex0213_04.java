import java.util.Scanner;

public class Ex0213_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~100까지 숫자 1개를 랜덤으로 뽑습니다
		// 무한 돌려서, 숫자를 맞추는 게임
		// 입력한 숫자가 랜덤숫자 1개보다 높은 숫자가 큽니다.다시입력
		//작으면 작습니다. 다시 입력
		// 맞으면 빙고
		//정답은 예)5번입니다
		
		//옵션>
		//자신이 입력한 숫자를 모두 추력을 해주세요.
		//최대 20번까지 하겠습니다
		
		
		Scanner scan = new Scanner(System.in);
		
		int max = 10;
		int min = 0;
		
		int score = 0;
		int win = 0;
		int [] num = new int [100];
		int [][] score_num = new int [1][20];
		int [] count2 = new int[20];
		int count = 0;	
		
		score = (int)(Math.random()*100)+1;
		int win_num = 0;
		
		while(count < 20) {
			
			System.out.println("랜덤숫자를 입력하세요");
			num[100] = scan.nextInt();
			
			if(num[100] < score) {;
				
				min = num[100];
				System.out.println(min +"< ?? <" + max);
				System.out.println("입력한 숫자가 랜덤숫자보다 작습니다");
				System.out.println();
				System.out.println(score);
				
				continue;
				
				
			}
			else if (num[100] > score) {
				max = num[100];
				System.out.println(min +"> ?? >" + max);
				System.out.println("입력한 숫자가 랜덤숫자보다 큽니다");
				continue;
			}
			else {
			System.out.println("당첨!" + score + "번이었습니다.");
			}
			for (int i=0; i<count; i++) {
				System.out.print(i+"\t");
				for ( int j=0; i<count; j++) {
					System.out.print(num[100]+"\t");
					
					
				}
				System.out.println(count+"번째" + num[count]);
				
			}
				
			
			
			
			
			
		}
		
		
		
		
	}

}
