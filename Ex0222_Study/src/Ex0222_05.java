
public class Ex0222_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card [] c = new Card[52];
		String [] kind = { "하트","다이아","스페이스","클로버"};
		String [] kind2 = {"0","1","2","3","4","5","6","7","8","9","X","J","Q","K"};
		String kind3 = "0123456789XJQK";
		
		
		
		for(int i =0; i<kind.length; i++) {
			for(int j =0; j<kind2.length-1; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].kind = kind[i];
				c[(i*13)+j].number = j+1;
//				System.out.println(c[(i*13)+j].kind + " //" +kind3.charAt(c[(i*13)+j]).number);
				System.out.println(c[(i*13)+j].kind + " //" +kind3.charAt(c[(i*13)+j].number));
			}
		}
		
	}

}
