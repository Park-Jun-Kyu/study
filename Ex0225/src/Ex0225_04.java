
public class Ex0225_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv c1 = new CaptionTv();
		Data d1 = new Data();
		
		System.out.println(d1);
		

		
//		c1.channel = 7;
//		c1.channelUp(); // 8��
//		c1.channelUp(); // 9��
//		c1.channelDown(); // 8��
//		System.out.println("���� ä�� : " + c1.channel);
//		c1.caption = true;
//		c1.displayCap("Hello java");
	}
}

class Tv {
	boolean power; // ���� on-true off -false
	int channel;
	int volume;

	void power() {
		power = !power;
	}

	void channelUp() {
		// 100�� - 1������ ���ư��� ��������.0-> 1

		if (channel >= 101) {
			channel = 1;
		}
		++channel;
	}

	void channelDown() { // -1 100
		if (channel <= -1) {
			channel = 101;
		}
		--channel;

	}
}// Tv

class CaptionTv extends Tv {
	Tv t1 = new Tv();
	int channel = t1.channel;
	boolean caption;

	void displayCap(String text) {
		if (caption == true) {
			System.out.println("caption On");
			System.out.println(text);
		}
	}

}

class Data{
	int x;
	int y;
	
	Data(){
		x=10;
		y=20;
	}
	
	public String toString() {
		
		return "x�� �� :"+x+" Y�� �� :"+y;
	}
	
}




