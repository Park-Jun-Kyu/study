
public class test3 {
	public static void main(String[] args) {
		
	Data d = new Data();
	
		d.x = 5;
		d.y = 10;
	
		str(d. x,d. y);
		System.out.println(d.x);
	}//main
	
	
	static int str (int x , int y) {
		int result =0;
		result = x + y;
		
		return result;
	}
	
	
}//calss


class Data{
	
	int x;
	int y;
	int z;
	
}