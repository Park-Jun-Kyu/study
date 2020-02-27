
public class Ex0227_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Car c2 = null;

		FireEngine f = null;

		c.drive();
		FireEngine f2 = new FireEngine();

		c.drive();
		c = (Car) f2;
		c.drive();
		f = (FireEngine) c2;
		f.water();
		// FireEngine f = new Car();
		// 자손의 참조변수로 조상의 객체를 선언하는것은 안된다

//		Car c = new Car();
//		FireEngine f = new FireEngine();
//		Car c2 = new FireEngine(); // 다형성
////		FireEngine f2 = new Car();  이렇겐 안됨
//		FireEngine f2 = new FireEngine();   //f1 해결법
//		
//		FireEngine f3 = null;
//		
//		c = f2; 
//		f3 = (FireEngine)c; // int a=0; long b = 1L; a=(long)b;
//		f3.water();  //f1 해결법
//		
//		
//		System.out.println("깡통차");
//		c.drive();
//		c.stop();
////		c.water(); c는 water()가 없음  해결법 f1으로
//		System.out.println("소방차");
//		f.drive();
//		f.stop();
//		f.water();

	}

}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("엑셀을 밟으면 출발~~~");
	}

	void stop() {
		System.out.println("브레이크를 밟으면 멈춤");
	}
	void make() {
		System.out.println("차 생성");
	}

}

class FireEngine extends Car {

	void water() {
		System.out.println("물이 발사~");
	}
	void make() {
		System.out.println("소방차 생성");
	}
	void reform() {
		System.out.println("소방차로 다시 변형됬습니다");
	}

}

class Ambulance extends Car {
	void siren() {
		System.out.println("사이렌이 울립니다.");
	}

	void move() {
		System.out.println("사람도 옮깁니다.");
	}
	
	void heal() {
		System.out.println("사람을 치료합니다");
	}
	
	void make() {
		System.out.println("구급차 생성");
	}
	void transform () {
		System.out.println("기본차 변신");
	}
	void reform() {
		System.out.println("구급차로 다시 변형됬습니다");
	
}
}

class Truck extends Car {
	void stuff() {
		System.out.println("물건을 옮깁니다.");
	}
	void make() {
		System.out.println("트럭 생성");
		
	}
	void reform() {
		System.out.println("트럭으로 다시 변형됬습니다");
}
	
}
	

	
	
	
	
	
	
	
	
