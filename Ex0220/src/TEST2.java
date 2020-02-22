
public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data a = new Data();
		
		
		a.x = 10;
		a.y = 5;
		
		
		
		sum(a);
	System.out.println(a.x);
		
		a.x = sum2(a.x , a.y);
		System.out.println(a.x);
	} // main
	
	
	static void sum(Data a) {
	a.x	= a.x + a.y; 
		
		
	}

	
	static int sum2(int x, int y) {
	int result = 0;
	result = x + y; 
		
		return result;
	}
	
	
}//class

class Data {

	int x;
	int y;
	int result;
	int z;
	
}