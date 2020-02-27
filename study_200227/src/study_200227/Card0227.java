package study_200227;

public class Card0227 {
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int DIAMOND = 4;
	static final int HEART = 3;
	static final int SPAED = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card0227(){
		
	}
	
	Card0227(int kind,int number){
		this.kind = kind;
		this.number = number;
		
	}
	
	
	public String toString() {
		String [] kinds = {"","하트","다이아","클로버","스페이드"};
		String numbers = "0123456789XJQK";
			
		
		return kinds[kind] + numbers.charAt(number);
	}
	

}
