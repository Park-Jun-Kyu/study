
public class Tv {

	String color; // tv의 색상
	boolean power; // 전원
	int channel; // 채널
	
	void power() {
		if(power==true) {
			System.out.println("전원을 off 합니다");
			power = !power;
			
		}else {
			System.out.println("전원을 on 합니다");
		}
		
	}
		void channelUp(){
			System.out.println("채널을 1증가합니다.");
			channel++;
			System.out.println("현재채널 : "+channel);
		}
		void channelDown() {
			System.out.println("채널을 1감소합니다.");
			channel--;
			System.out.println("현재채널 : "+channel);
			

			
	}//
}//

