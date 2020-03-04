
public class Ex0304_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Person p1 = new Person(88801011105519L);
		Person p2 = new Person(88801011105519L);
		
		System.out.println("P1의 값 = "+p1);
		System.out.println("p2의 값 = "+p2);
		
		System.out.println("==비교연산결과 : "+(p1==p2));
		System.out.println("equals로 비교결과 : "+p1.equals(p2));
		
		
	}

}








class Person{
	
	long id;
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			Person p = (Person)obj;
//			if(id==p.id) {
//				return true;
//			}
			
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "변수 값"+id;
	}
	
	
	
}