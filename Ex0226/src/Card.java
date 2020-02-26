
public class Card {
	
	static final int KIND_MAX = 4;
	static final int NUMBER_MAX = 13;
	static final int DIAMOND = 4;
	static final int HEART = 3;
	static final int SPAED = 2;
	static final int CLOVER = 1;
	
	
	int kind = 0;
	int number = 0;
	
	Card(){
		super();
	}
	
	 Card(int kind,int number){
		super();
		this.kind =kind;
		this.number =number;
		
	}
	
	public String toString(){

		String [] kinds = {"","DIAMOND","HEART","SPAED","CLOVER"};
		String numbers ="0123456789XJQK";
		return kinds[kind] + numbers.charAt(number);
	}
	
}
