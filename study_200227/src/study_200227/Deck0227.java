package study_200227;

public class Deck0227 {

	static final int CARD_MAX = 52;
	Card0227[] cardarr = new Card0227[CARD_MAX];

	Deck0227() {
		for (int i = 0; i < Card0227.KIND_MAX; i++) {
			for (int j = 0; j < Card0227.NUM_MAX; j++) {
				cardarr[(i * 13) + j] = new Card0227(i + 1, j + 1);
			}
		}

	}

	Card0227 pick(int index) {
			return cardarr[index];
	}
	
	Card0227 pick() {
		int index = 0;
		index = (int)(Math.random()*52);
		return cardarr[index];
		
		
	}
	
	void shuffle() {
		int num = 0;
		for(int i=0; i<2000; i++) {
		num = (int)(Math.random()*52);
		Card0227 temp = cardarr[num];
		cardarr[num] = cardarr[0];
		cardarr[0] = temp;
		}
		
	}
	
	
	
	
}
