
public class Ex0218_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ī���� ���� : " + card.width); // 100
		System.out.println("ī�� ���� : " + card.height); // 250
		System.out.println("-------------------------");
		card c1 = new card();
		c1.kind = "Heart";
		c1.number = 7;

		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 5;

		System.out.println("c1ī�� :" + c1.kind + "/" + c1.number);
		System.out.println("c1ī�� ũ�� :" + c1.width + "/" + c1.height);
		System.out.println("--------------------------------");
		System.out.println("c2ī�� :" + c2.kind + "/" + c2.number);
		System.out.println("c2ī�� ũ�� :" + c2.width + "/" + c2.height);
		System.out.println("--------------------------------");
		
		c1.width = 50;
		c1.height = 80;
		
		
		
		//Ŭ���� ���� ����Ǹ鼭 static�� ����/�񼱾� /�޼ҵ� �ȿ�����Ⱥ���
		
		System.out.println("c1ī�� :" + c1.kind + "/" + c1.number);
		System.out.println("c1ī�� ũ�� :" + c1.width + "/" + c1.height);
		System.out.println("--------------------------------");
		System.out.println("c2ī�� :" + c2.kind + "/" + c2.number);
		System.out.println("c2ī�� ũ�� :" + c2.width + "/" + c2.height);
		System.out.println("--------------------------------");
		
		
		
		
		

	}

}
