
public class Ex0221_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for kind -문을 돌려서 클로버 하트 스페이스 다이아 
		//number - 1부터 13까지 총 52개 만들어보세[요
//		
//			c.kind = "클로버";
//			c.number = 1;
//			System.out.println("기본생성자 : "+c.kind + c.number);
//			
//			
//			
//			Card c2 = new Card("하트",2);
//			System.out.println("매개변수가 있는 생성자 : "+c2.kind + c2.number);
//			
//			for(int i=0; i<)
//			String num2 = "0123456789XJQK";
//			Card[][] c = new Card[4][13];
//			String[] kind = {"스페이드","하트","클로버","다이아"};
//			int[] num = new int[13];
//			
//			for(int i=0;i<kind.length;i++) {
//				for(int j=0;j<num.length;j++) {
//					c[i][j] = new Card(kind[i],j+1);
//					System.out.println(c[i][j].kind + c[i][j].number);
//				}
//			}
			
		
		String [] kind = new String[] {"클로버","하트","다이아몬드","스페이스"};
		Card[] c = new Card [52];
		Card [] c2 = new Card [52];
		String num ="0123456789XJPQ";
		String [] card2 = { "1","2","3","4","5","6","7","8","9","10","J","Q","K"
		};
//		
//		
//		
		for(int i=0; i<kind.length; i++) {
			for(int j=0; j<card2.length; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].kind = kind[i]; //모양 -클로버,하트,스페이스,다이아몬드
				c[(i*13)+j].number = j+1;
				// num.charAt(c[(i*13)+j].number) = 1,2,3,4 num.charAt(1) ->
				System.out.println(c[(i*13)+j].kind+" / "+num.charAt(c[(i*13)+j].number));
			}
		}
//		
//		
//		System.out.println("2번째 카드");
//		for(int i=0; i<kind.length; i++) {
//			for(int j=0; j<13; j++) {
//				c2[(i*13)+j] = new Card(kind[i],j+1);
//				System.out.println(c2[(i*13)+j].kind+" / "+ num.charAt(c[(i*13)+j].number));
//			}
//		}
////		System.out.println("기본생성자 : "+c.kind + c.number);
		
		
	}

}
