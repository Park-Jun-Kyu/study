
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
	

	//x,y,y -> 값을 받아서 3개의 값을 더하여 리턴해서 p.x 넣으세여
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
// merge메소드에 리턴값을 만들어서 , 2개의 변수의 값을 합쳐보세요
//	static String merge(String x , String y) {
//		String result = "";
//		result = x + y;
//		
//		return result;
//		
//	}
//merge메소드에 void 주소값을 넘겨서 합쳐보세요
//	static void merge(Str s) {
//
//	s.x = s.x + s.y;
//
//}