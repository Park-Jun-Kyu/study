
public class Ex0220_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Plus p = new Plus();
		
		p.x = 10;
		p.y = 20;
		p.z = 30;
		
		
//		p.x = add(p.x,p.y,p.z);
//		System.out.println(p.x);
		
		add2(p);
		System.out.println(p.x);
		
		
	}//main
	

	//x,y,y -> ���� �޾Ƽ� 3���� ���� ���Ͽ� �����ؼ� p.x ��������
//	static int add (int x, int y , int z) {
//		int result = 0;
//		result = x + y + z;
//		
//		return result;
//	}	
	
	static void add2 (Plus p) {
		p.x = p.x + p.y + p.z;
		
	}
	
	
	
}//class



class Plus {
	int x;
	int y;
	int z;
	

	

}

//class Str {
//	String x;
//	String y;
//	
//}
//		Str s = new Str();
//		String result = ""; 
//		
//		s.x = "abc";
//		s.y = "def";
//		
//		s.x = merge(s.x,s.y);
//		//s.x -> abcdef
//		System.out.println(s.x);
//		System.out.println(result);
//		System.out.println(s.x);
//		
//		
//		merge(s);
//		System.out.println(s.x);

//}//main
// merge�޼ҵ忡 ���ϰ��� ���� , 2���� ������ ���� ���ĺ�����
//	static String merge(String x , String y) {
//		String result = "";
//		result = x + y;
//		
//		return result;
//		
//	}
//merge�޼ҵ忡 void �ּҰ��� �Ѱܼ� ���ĺ�����
//	static void merge(Str s) {
//
//	s.x = s.x + s.y;
//
//}