
public class Deck {

	static final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];

	Deck() { // kind, number
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUMBER_MAX; j++) {
				cardArr[(i * 13) + j] = new Card(i + 1, j + 1);
			}
		}

	}

	Card pick(int index) {

		return cardArr[index];
	}

	Card pick() {
		int index = 0;
		index = (int) (Math.random() * 52);
		return cardArr[index];
	}

	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int num = (int) (Math.random() * 52);
			Card temp = cardArr[num];
			cardArr[num] = cardArr[0];
			cardArr[0] = temp;
		}
	}

}
