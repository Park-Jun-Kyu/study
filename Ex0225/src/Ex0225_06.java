
public class Ex0225_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck();
		Card c = d.pick(10);
		System.out.println(c);
		
		for(int i=0; i < d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
		d.shuffle();
		Card c2 = d.pick(10);
		for(int i=0; i<d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
		
		
		
		
	}

}

class Deck1{
	
	final int CARD_NUM = 52;
	Card [] cardArr = new Card[CARD_NUM];
	
	
	
	Deck1() {
		for(int i=0; i<Card.KIND_MAX; i++) {
			for(int j=0; i <Card.NUM_MAX; j++) {
				cardArr[(i*13) + j] = new Card(i + 1, j + 1);
			}
		}
	}
	
	Card pick(int index){
		return cardArr[index];
	}
	Card pick() {
		
		int index = 0;
		index = (int)(Math.random ()*52);
		
		return cardArr[index];
	}
	
	
	void shuffle() {
		for(int i=0; i< 2000; i++) {
		int num = (int)(Math.random()*52);	
		Card temp = cardArr[num];
		cardArr[num] = cardArr[0];
		cardArr[0] = temp;
		
	}
	
	
	
}



}






class Card1{
	
	static final int KIND_MAX = 4; //Ä«µå¹«´Ì °¹¼ö
	static final int KIND_NUMBER = 13; // ¼ýÀÚ °¹¼ö
	
	static final int SPADE = 4;
	static final int HEART = 3;
	static final int CLOVER = 2;
	static final int DIAMOND = 1;
	
	
	int kind;
	int number;
	
	
	
	Card1(){
		
	}
	
	Card1(int kind,int number){
		
		this.kind = kind;
		this.number = number;
		
	}
	
	public String tostring() {
		String [] kinds = {"SPADE","HEART","CLOVER","DIAMOND"};
		String numbers = "0123456789XJQK";
		
		return kinds[kind + numbers.charAt(number)];
	}
	
	
	
	
}