
public class Ex0221_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for kind -���� ������ Ŭ�ι� ��Ʈ �����̽� ���̾� 
		//number - 1���� 13���� �� 52�� ������[��
//		
//			c.kind = "Ŭ�ι�";
//			c.number = 1;
//			System.out.println("�⺻������ : "+c.kind + c.number);
//			
//			
//			
//			Card c2 = new Card("��Ʈ",2);
//			System.out.println("�Ű������� �ִ� ������ : "+c2.kind + c2.number);
//			
//			for(int i=0; i<)
//			String num2 = "0123456789XJQK";
//			Card[][] c = new Card[4][13];
//			String[] kind = {"�����̵�","��Ʈ","Ŭ�ι�","���̾�"};
//			int[] num = new int[13];
//			
//			for(int i=0;i<kind.length;i++) {
//				for(int j=0;j<num.length;j++) {
//					c[i][j] = new Card(kind[i],j+1);
//					System.out.println(c[i][j].kind + c[i][j].number);
//				}
//			}
			
		
		String [] kind = new String[] {"Ŭ�ι�","��Ʈ","���̾Ƹ��","�����̽�"};
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
				c[(i*13)+j].kind = kind[i]; //��� -Ŭ�ι�,��Ʈ,�����̽�,���̾Ƹ��
				c[(i*13)+j].number = j+1;
				// num.charAt(c[(i*13)+j].number) = 1,2,3,4 num.charAt(1) ->
				System.out.println(c[(i*13)+j].kind+" / "+num.charAt(c[(i*13)+j].number));
			}
		}
//		
//		
//		System.out.println("2��° ī��");
//		for(int i=0; i<kind.length; i++) {
//			for(int j=0; j<13; j++) {
//				c2[(i*13)+j] = new Card(kind[i],j+1);
//				System.out.println(c2[(i*13)+j].kind+" / "+ num.charAt(c[(i*13)+j].number));
//			}
//		}
////		System.out.println("�⺻������ : "+c.kind + c.number);
		
		
	}

}
