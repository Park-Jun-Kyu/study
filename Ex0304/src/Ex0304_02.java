
public class Ex0304_02 {

	public static void main(String[] args) {
		
		People1 p1= new People1(10001);
		People1 p2 = new People1(10001);
		//equals메소드를 사용해서 비교를 해보세요.
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}

}


class People1 {
	int stu_number1;
	
	People1(){}
	People1(int stu_number1){
		this.stu_number1 = stu_number1;
	}
	
	public boolean equals(Object obj) {
		
	if(obj!=null && obj instanceof People1 ) {
		return stu_number1 ==  ((People1)obj).stu_number1;
	}
	return false;
	}
	
	
	

	
}