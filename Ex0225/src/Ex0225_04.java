
public class Ex0225_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv c1 = new CaptionTv();
		Data d1 = new Data();
		
		System.out.println(d1);
		

		
//		c1.channel = 7;
//		c1.channelUp(); // 8번
//		c1.channelUp(); // 9번
//		c1.channelDown(); // 8번
//		System.out.println("현재 채널 : " + c1.channel);
//		c1.caption = true;
//		c1.displayCap("Hello java");
	}
}

class Tv {
	boolean power; // 전원 on-true off -false
	int channel;
	int volume;

	void power() {
		power = !power;
	}

	void channelUp() {
		// 100번 - 1번으로 돌아가게 만들어보세요.0-> 1

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
		
		return "x의 값 :"+x+" Y의 값 :"+y;
	}
	
}




