
public class Ex0227_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		
		
		
		Caption_Tv c = new Caption_Tv();
		Caption_Tv c2 = new Caption_Tv();
		Tv t2 = new Caption_Tv();   
		
		
		t2 = (Tv)c2;        
		c2 = (Caption_Tv)t2;
		
		
		
//		Caption_Tv c2 = new Tv();
		
//		t2.caption();
		
//		t2.power();
//		t2.channel = 7;
		
		//다형성 :조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성
		
		
		
		
		
		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("Tv 객체 채널 : " +t.channel);
		
		
		c.power();
		c.channel=11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text="겨울왕국 2 영화 자막이 추가 되었습니다";
		c.caption();
		System.out.println("Caption_Tv 객체 채널" + c.channel);
	}

}
