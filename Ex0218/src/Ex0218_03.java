
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x= 10;
		Data.y = 50;
		
		System.out.println("1번째 d.x : " + d.x);
		
		//클래스명.변수
		int dx = change(d);
		
		System.out.println("2번째 d.x : "+ dx);
		System.out.println("2번째 d.x : "+ d.x);
		
	}// main

static int change(Data d) { // 클래스메소드, 인스턴스 메소드
		d.x = d.x + 200;
	return d.x;
		
}
	
	
	
	
	
	
	
}//class
