
public class Ex0225_05 {

	public static void main(String[] args) {

		//������ 7�常 ����Ʈ�ϱ�
		
		
		
		Deck d = new Deck(); // 52���� ī�� �����
		Card c = d.pick(10); // cardArr[10] Card[] cardArr = new CardArr[52];
		System.out.println(c);

		for (int i = 0; i < d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
		d.shuffle();
		Card c2 = d.pick(10);
		for (int i = 0; i < d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}

	}

}

class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];

//1~13 , 4�� �ʱ�ȭ
	Deck() { // kind, number
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				cardArr[(i * 13) + j] = new Card(i + 1, j + 1);

			}
		}

	}

	// Card �̱�
	Card pick(int index) {
		return cardArr[index]; // 10 -> Ŭ�ι�,11
	}

	// ���� �̱�
	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52); // 0~51�� �迭�� ����

//		return pick(index);
		return cardArr[index];
	}

	// ī�弯��
	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = cardArr[num];
			cardArr[num] = cardArr[0];
			cardArr[0] = temp;

		}
	}

}

class Card {

	static final int KIND_MAX = 4; // ī�� ���� ����
	static final int NUM_MAX = 13; // ���̺� ī�� ��

	static final int SPADE = 4;
	static final int DIANMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind; // 1=Ŭ�ι� 2=��Ʈ 3=���̾Ƹ�� 4=�����̵�
	int number; // 1,2,3,4, ... 9,X,J,Q,K

	Card() {

	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";

		return kinds[kind] + " // " + numbers.charAt(number);
	}

}