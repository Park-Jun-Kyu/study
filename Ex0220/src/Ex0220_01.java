
public class Ex0220_01 {

	public static void main(String[] args) {
		int result = 0;
		Data d= new Data();//��ü����
		Data c; //����Ҽ� ���� / �󲮵��� �ּҰ��� ���ִ�
		
		
		d.x = 10;
		d.y = 100;
		
		change1(d.x);
		
		d.y = change2(d.x,d.y);
		
		System.out.println(result);
		//d.x = 1000;
		System.out.println(d.y);
//		
//		change3(d);
//		System.out.println(d.y);
//		
//		
//		System.out.println(d.y);
//		d.y = change3(d.y);
//				System.out.println(d.y);
		
		
		
	}//main

	static void change1(int x) {
		x= 1000;
		
	}
	
	
	static int change2(int a, int b) {
		int result=0;
		result = a-b;
		return result;
		
	}
	
	static void change3(Data d) {
		// y�ǰ��� ���̵�� ���� y�� ���� 2000���� ��������
		d.y = 2000;
	}
//		
//		
//	static int change3(int y) {
//		// y�ǰ��� ���̵�� ���� y�� ���� 2000���� ��������
//		y = 2000;
//		return y;
//	}
	
	
	
	
		
	
	
}//class

class Data {
	int x;
	int y;
}