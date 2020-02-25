

public class Ex0225_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//원과 삼각형 그리기
		// 원 -> 좌표,반지름,도면색칠
		// 삼각형 -> 좌표3개,도면색칠
		Point1 p = new Point1(50, 100);
		Circle1 c1 = new Circle1(p,200);
		
//		p, 200
	}

}

//도면 -> 색깔,색칠하기 메소드
class Shape1 {

	String color = "white";

	void draw() {

		System.out.println("색깔 : " + color);
	}

}

class Point1 {

	int x;
	int y;

	Point1() {
		this(0, 0);

	}

	Point1(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void getXY() {
		System.out.println("(" + "x의 좌표" + "ㄴㄹㅇㄻㄴ");
	}
}
	class Circle1 extends Shape1 {

		Point1 p1;
		int r;

		Circle1() {

		}
	
		Circle1(Point1 p1, int r) {
			this.p1 = p1;
			this.r = r;
		}

		void draw() {
			System.out.println("원을 그리기");
			System.out.println("x좌표 : " + p1.x + "y좌표 : " + p1.y + "반지름: " + r + "색상 : " + color);
		}

	}

	class Triangle extends Shape1 {
		Point1[] p = new Point1[3]; // 3개

		void draw() {
			System.out.println("삼각형 그리기");
			System.out.println("x좌표 : " + p[0].x + "y좌표 : " + p[0].y + "x좌표 : " + p[1].x + "y좌표 : " + p[1].y + "x좌표 : "
					+ p[2].x + "y좌표 : " + p[2].y);
		}

	}

