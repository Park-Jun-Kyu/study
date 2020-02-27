package study_200227;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Deck0227 d = new Deck0227();
//		Card0227 c = d.pick();
//		System.out.println(c);
		
		for(int i=0; i<Deck0227.CARD_MAX; i++) {
			System.out.println(d.pick(i));
		}
		
		d.shuffle();
		
		
		
		for(int i=0; i<Deck0227.CARD_MAX; i++) {
			System.out.println(d.pick(i));
		}
		
	}

}
