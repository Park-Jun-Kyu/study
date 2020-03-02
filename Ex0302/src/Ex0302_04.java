
public class Ex0302_04 {

	public static void main(String[] args) {

		Marine1 m1 = new Marine1();
		Tank1 t1 = new Tank1();
		SCV s1 = new SCV();
		Dorpship1 d1 = new Dorpship1();

		t1.hitPoint -= 100; // 150-100= 10
		System.out.println("데미지후 체력 : " + t1.hitPoint);
		m1.hitPoint -= 10; // 40-10 =30
		System.out.println("데미지후 체력 : " + m1.hitPoint);
		d1.hitPoint -= 70; // 100- 70= 30
		System.out.println("데미지후 체력 : " + d1.hitPoint);

		s1.repair(t1); // 충전
		s1.repair(m1); //
		s1.repair(d1); //

		System.out.println("복구후 체력 : " + t1.hitPoint);
		System.out.println("복구후 체력 : " + m1.hitPoint);
	}

}

interface Repairble{}

class Unit1 {
	int hitPoint;
	int MAX_HP1;

	Unit1() {
	}

	Unit1(int hp) {
		MAX_HP1 = hp;
	}
}

class Tank1 extends GroundUnit1 implements Repairble{
	Tank1() {
		super(150);
		hitPoint = MAX_HP1;
	}

}

class Marine1 extends GroundUnit1 {
	Marine1() {
		super(40);
		hitPoint = MAX_HP1;
	}
}

class Dorpship1 extends AirUnit1 implements Repairble {

	Dorpship1() {
		super(100);
		hitPoint = MAX_HP1;
	}

}

class SCV extends GroundUnit1 implements Repairble{
	SCV() {
		super(60);
		hitPoint = MAX_HP1;
	}

	void repair(Repairble r) {
		Unit1 u = (Unit1)r;
		while (u.hitPoint != u.MAX_HP1) {
			u.hitPoint++;
		}
	}

//	void repair(Dorpship1 d) {
//		while (d.hitPoint != d.MAX_HP1) {
//			d.hitPoint++;
//		}
//	}
//
//	void repair(SCV s) {
//		while (s.hitPoint != s.MAX_HP1) {
//			s.hitPoint++;
//		}
//	}

//	void repair(GroundUnit1 u) {
//		while (u.hitPoint != u.MAX_HP1) {
//			u.hitPoint++;
//		}
//	}
}

class GroundUnit1 extends Unit1 {
	GroundUnit1() {
	}

	GroundUnit1(int hp) {
		super(hp);
	}
}

class AirUnit1 extends Unit1 {
	AirUnit1() {
	}

	AirUnit1(int hp) {
		super(hp);
	}

}