
public class Ex0218_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x= 10;
		Data.y = 50;
		
		System.out.println("1��° d.x : " + d.x);
		
		//Ŭ������.����
		int dx = change(d);
		
		System.out.println("2��° d.x : "+ dx);
		System.out.println("2��° d.x : "+ d.x);
		
	}// main

static int change(Data d) { // Ŭ�����޼ҵ�, �ν��Ͻ� �޼ҵ�
		d.x = d.x + 200;
	return d.x;
		
}
	
	
	
	
	
	
	
}//class
