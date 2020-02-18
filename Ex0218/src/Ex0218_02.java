
public class Ex0218_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("카드의 넓이 : " + card.width); // 100
		System.out.println("카드 높이 : " + card.height); // 250
		System.out.println("-------------------------");
		card c1 = new card();
		c1.kind = "Heart";
		c1.number = 7;

		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 5;

		System.out.println("c1카드 :" + c1.kind + "/" + c1.number);
		System.out.println("c1카드 크기 :" + c1.width + "/" + c1.height);
		System.out.println("--------------------------------");
		System.out.println("c2카드 :" + c2.kind + "/" + c2.number);
		System.out.println("c2카드 크기 :" + c2.width + "/" + c2.height);
		System.out.println("--------------------------------");
		
		c1.width = 50;
		c1.height = 80;
		
		
		
		//클래스 내에 선언되면서 static이 선언/비선언 /메소드 안에선언된변수
		
		System.out.println("c1카드 :" + c1.kind + "/" + c1.number);
		System.out.println("c1카드 크기 :" + c1.width + "/" + c1.height);
		System.out.println("--------------------------------");
		System.out.println("c2카드 :" + c2.kind + "/" + c2.number);
		System.out.println("c2카드 크기 :" + c2.width + "/" + c2.height);
		System.out.println("--------------------------------");
		
		
		
		
		

	}

}
