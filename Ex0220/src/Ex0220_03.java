
public class Ex0220_03 {

	public static void main(String[] args) {

		Arith a = new Arith();
		int[] r = new int[4];
		int add = 0;
		int sub = 0;
		int mult = 0;
		int div = 0;

		
		
		a.x = 60;
		a.y = 10;
		a.z = 2;
		
//		rule(a);

		rule3(r, a.x, a.y, a.z);
		add=r[0];
		sub=r[1];
		mult=r[2];
		div=r[3];
		
//		rule2(a);
//		System.out.println(a.add);
//		System.out.println(a.sub);
//		System.out.println(a.mult);
//		System.out.println(a.div);

	}// main
		// x,y,z 더하기 빼기 곱하기 나누기 해서 4개의 값을 출력해보세요
		// 2. 리턴을ㅇ 해서 add sub mult div 에서 값을 넣어 출력해보세요

//	static void rule(Arith a) {
//		System.out.println(a.x + a.y + a.z);
//		System.out.println(a.x - a.y - a.z);
//		System.out.println(a.x * a.y * a.z);
//		System.out.println(a.x / a.y / a.z);
////		a.add = a.x + a.y +a.z;
////		a.sub = a.x - a.y -a.z;
////		a.mult = a.x * a.y * a.z;
////		a.div = a.x / a.y / a.z;
//
//	}
//
//	static void rule2(Arith a) {
//		a.add = a.x + a.y + a.z;
//		a.sub = a.x - a.y - a.z;
//		a.mult = a.x * a.y * a.z;
//		a.div = a.x / a.y / a.z;
//
//	}

	static void rule3(int r [], int x, int y, int z) {
		r[0] = x + y + z;
		r[1] = x - y - z;
		r[2] = x * y - z;
		r[3] = x / y / z;

	}

}// class

class Arith {
	int x;
//	static int add(int x, int y, int z) {
//		int result = 0;
	int y;
	int z;
	int result;
	int result2;
	int result3;
	int result4;
	int add;
	int sub;
	int mult;
	int div;
}
//		result = x + y + z;
//
//		return result;
//	}
//
//	static void add2(Arith a) {
//
//		a.result = a.x + a.y + a.z;
//		
//	}
//
//	static int sub(int x, int y, int z){
//		int result = 0;
//		result = x-y-z;
//
//		return result; // x - y-  z 
//	}
//	
//	
//	static void sub2(Arith a) {
//		
//		a.result = a.x - a.y - a.z;
//	}
//	
//static int mult(int x, int y , int z){
//	int result = 0;
//	result = x * y * z;
//	
//	return result;
//}
//
//static void mult (Arith a) {
//	a.result = a.x * a.y * a.z;
//}
//
//static int div ( int x, int y, int z) {
//	int result = 0;
//	result = x / y / z;
//	
//	return result;
//}
//static void div (Arith a) {
//	a.result = a.x / a.x / a.z;
//}

//div(){
//	
//}
//	

//		a.result = add(a.x, a.y, a.z);
//		System.out.println(a.result);
//
//		// add 1 -> a, b ,c 더해서 값을 리턴 받아서 result에서 넣어보세요.
//		// add -> 리턴없이 주소값 넘겨서 result에 값을 넣어보세요.
//
//		add2(a);
//		System.out.println(a.result);
//
//		
//		
//		a.result = sub(a.x , a.y , a.z);
//		System.out.println(a.result);
//		
//		
//		sub2(a);
//		System.out.println(a.result);
//		
//		a.result = mult(a.x , a.y, a.z);
//		System.out.println(a.result);
//		
//		mult(a);
//		System.out.println(a.result);
//		
//		
//		a.result = div(a.x , a.y , a.z);
//		System.out.println(a.result);
//			
//		
//		div(a);
//		System.out.println(a.result);