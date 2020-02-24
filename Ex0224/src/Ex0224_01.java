
public class Ex0224_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		
		
		Car [] c = new Car[100];
		
	
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Car();
			
		}
		
		Car c5 = new Car("white","¼öµ¿",4);
		System.out.println(c5.color+" / "+c5.gearType+" / "+c5.door);
		
		
		
		System.out.println(c1.color+" / "+c1.gearType+" / "+c1.door);
		System.out.println(c1.door);
		
	}

}
