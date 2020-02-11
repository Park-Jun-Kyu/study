import java.util.Scanner;

public class Ex0211_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5,5   ->01 - > 1 ¥Á√∑ 0 ≤Œ
		//10 ∆«
		// ¥Á√∑ : 5∞≥ ≤Œ : 5∞≥

		
		int [][] score = new int [5][5] ;
		String [][] score_in = new String [0][1];
		int ox_1 = 0;
		int yx_1 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = (int)(Math.random()*2);
//				score_in[0][1] = scan.next();
				
			}
		}
		while(true) {
			
			
			
	
		
		if(score_in[ox_1][yx_1] == ) {
			"¥Á√∑µ«æ˙Ω¿¥œ¥Ÿ";
		}
		
		
//		System.out.println("\t");
//		System.out.println("\t");
//		System.out.println("\t");
//		System.out.println("\t");
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" \t ");
			}
			System.out.println();
		}
		
		
		}//while
		
		
		
		
		
		
		
	}

}
