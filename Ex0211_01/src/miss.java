
public class miss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [][] score = new int [3][3]; //0,1
		
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = (int)(Math.random()*2);
			}
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
