import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//
//		Point p = new Point(150,30);
//		Circle c2 = new Circle(p,200);
//		c2.draw();
//		//
//		Point p2 = new Point(0,0);
//		Circle c3 = new Circle(p2,50);
//		c3.draw();
//		//
//		Point p3 = new Point(300,300);
//		Circle c4 = new Circle(p3,70);
//		c4.draw();
//		
//		Point [] p5 = new Point[3];
//		p5[0] = new Point(100,100);
//		p5[1] = new Point(200,200);
//		p5[2] = new Point(300,300);
//		Circle [] c5 = new Circle[3];
//		Circle c1 = new Circle();
//		c1.draw();
		// scan ��ǥ 60,50 -> 100, 2�� �� �־��

//		Point[] pp = new Point[] { new Point(100, 100), new Point(200, 200), new Point(300, 300) };

		int[] r = { 50, 60, 70 };
		int[] r2 = new int[3];

		Point[] pp1 = new Point[3];

//		for (int i = 0; i < c.length; i++) {
//			c[i] = new Circle(pp[i], r[i]);
//			c[i].draw();
//		}
		int[] num = new int[3];
		Scanner scan = new Scanner(System.in);
		Circle[] c = new Circle[3];
		Point[] pp = new Point[3] ;
		String [] sub = {"x","y","������"};
		
		for(int j=0; j<num.length; j++) {
			for (int i = 0; i < num.length; i++) {
				System.out.println(sub[i]+"���� ��������.>>");
				num[i] = scan.nextInt();	
			}
			pp[j] = new Point(num[0],num[1]);
			c[j] = new Circle(pp[j ],num[2]);
//			
//		}
//		c[0].draw();
//		c[1].draw();
//		c[2].draw();

		
		//Triangle
		
		Triangle t1 = new Triangle();
		t1.draw();
		
		//20,20 // 40,100 //30,10
		
//		Point[] pp = {new Point(20,20), new Point(40,100) , new Point(30,10)};
//		Triangle t = new Triangle(p1,p2,p3);
//		
//		
//		for(int i=0; i<t.length; i++) {
//			pp[i] = new Point();
//			t[i] = new Triangle();
			
		}
		
		
		
		
//		for (int i = 0; i < c.length; i++) {
//
//			ppi[i] = scan.nextInt();
//			for (int j = 0; j < r2.length; j++)
//				r2[j] = scan.nextInt();
//		}

	}

}

//�����׸��� Ŭ����
//class shape {
//	String color = "black";
//
//	void draw() {
//		System.out.println("���� ����ϴ�.");
//		System.out.println("���� ���� : " + color);
//	}
//}
//
////��ǥ�� Ŭ����
//class Point {
//	int x;
//	int y;
//
//	Point() {
//
//		this(0, 0);
//	}
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	String getXY() {
//
//		return "(" + "x�� ��ǥ : " + x + ",y�� ��ǥ :;" + y + ")";
//	}
//
//}
//
////���� �׸��� �Ѥ�����
////class Circle extends shape {
////	Point center; // Point p
////	int r;
//////	color = "white";
////
////	Circle() {
////		center = new Point(0, 0);
////		r = 150;
////	}
////
//////	Circle c1 = new Circle(p1,50);
////	Circle(Point center, int r) {
////		this.center = center;
////		this.r = r;
////	}
////
////	void draw() {
////		System.out.println("������ �׸��ϴ�.");
////		System.out.println("(" + "���� :" + center.x + "," + center.y + "/ ������ : " + r + "/���� :" + color + ")");
////	}
////
////}
//
////�ﰢ�� �׸��� Ŭ����
//class Triangle extends shape {
//	Point[] p = new Point[3];
//
//	Triangle() {
//
//		this(new Point(0, 0), new Point(100, 0), new Point(0, 100));
////		p[0] = new Point(0, 0);
////		p[1] = new Point(100, 0);
////		p[2] = new Point(0, 100);
//
//	}
//
//	Triangle(Point[] p) {
//		this.p = p;
//	}
//
//	Triangle(Point p1, Point p2, Point p3) {
//		p = new Point[] { p1, p2, p3 };
//
//	}
//
//	void draw() {
//		System.out.println("�ﰢ���� �׸��ϴ�.");
//		System.out.println(
//				"(��ǥ1 : " + p[0].getXY() + "/��ǥ2 : " + p[1].getXY() + "/��ǥ3 :" + p[2].getXY() + "/���� :" + color);
//	}
//}

