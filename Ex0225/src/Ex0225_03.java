

public class Ex0225_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���� �ﰢ�� �׸���
		// �� -> ��ǥ,������,�����ĥ
		// �ﰢ�� -> ��ǥ3��,�����ĥ
		Point1 p = new Point1(50, 100);
		Circle1 c1 = new Circle1(p,200);
		
//		p, 200
	}

}

//���� -> ����,��ĥ�ϱ� �޼ҵ�
class Shape1 {

	String color = "white";

	void draw() {

		System.out.println("���� : " + color);
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
		System.out.println("(" + "x�� ��ǥ" + "����������");
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
			System.out.println("���� �׸���");
			System.out.println("x��ǥ : " + p1.x + "y��ǥ : " + p1.y + "������: " + r + "���� : " + color);
		}

	}

	class Triangle extends Shape1 {
		Point1[] p = new Point1[3]; // 3��

		void draw() {
			System.out.println("�ﰢ�� �׸���");
			System.out.println("x��ǥ : " + p[0].x + "y��ǥ : " + p[0].y + "x��ǥ : " + p[1].x + "y��ǥ : " + p[1].y + "x��ǥ : "
					+ p[2].x + "y��ǥ : " + p[2].y);
		}

	}

