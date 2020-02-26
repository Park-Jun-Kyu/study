//
//public class Ex0226_01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
//
//
//class Deck {
//	
//	
//		final int CARD_NUM = 52;
//		Card [] cardArr = new Card[CARD_NUM];
//		
//	
//	
//	Deck() {
//		
//		
//		
//	}
//	
//	
//	
//	
//}
//
//
//
//
//
//
//
//class Card{
//	
//	static final int KIND_MAX = 4;
//	static final int NUMBER_MAX = 13;
//	static final int DIAMOND = 4;
//	static final int HEART = 3;
//	static final int CLOVER = 2;
//	static final int SPAED = 1;
//	
//	int kind;
//	int number;
//	
//	Card() {
//		
//		
//	}
//	
//	Card(int kind,int number){
//	this.kind = kind;
//	this.number = number;
//	}
//	
//	
//	public String toString(){
//		String [] kinds = {"클로버","하트","다이아","스페이드"};
//		String numbers = "0123456789XJQK";
//		
//		return kinds[kind] + " // " + numbers.charAt(number);
//	}
//	
//	
//	
//}