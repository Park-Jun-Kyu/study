
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
		// �ڼ��� ���������� ������ ��ü�� �����ϴ°��� �ȵȴ�

//		Car c = new Car();
//		FireEngine f = new FireEngine();
//		Car c2 = new FireEngine(); // ������
////		FireEngine f2 = new Car();  �̷��� �ȵ�
//		FireEngine f2 = new FireEngine();   //f1 �ذ��
//		
//		FireEngine f3 = null;
//		
//		c = f2; 
//		f3 = (FireEngine)c; // int a=0; long b = 1L; a=(long)b;
//		f3.water();  //f1 �ذ��
//		
//		
//		System.out.println("������");
//		c.drive();
//		c.stop();
////		c.water(); c�� water()�� ����  �ذ�� f1����
//		System.out.println("�ҹ���");
//		f.drive();
//		f.stop();
//		f.water();

	}

}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("������ ������ ���~~~");
	}

	void stop() {
		System.out.println("�극��ũ�� ������ ����");
	}
	void make() {
		System.out.println("�� ����");
	}

}

class FireEngine extends Car {

	void water() {
		System.out.println("���� �߻�~");
	}
	void make() {
		System.out.println("�ҹ��� ����");
	}
	void reform() {
		System.out.println("�ҹ����� �ٽ� ��������ϴ�");
	}

}

class Ambulance extends Car {
	void siren() {
		System.out.println("���̷��� �︳�ϴ�.");
	}

	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
	
	void heal() {
		System.out.println("����� ġ���մϴ�");
	}
	
	void make() {
		System.out.println("������ ����");
	}
	void transform () {
		System.out.println("�⺻�� ����");
	}
	void reform() {
		System.out.println("�������� �ٽ� ��������ϴ�");
	
}
}

class Truck extends Car {
	void stuff() {
		System.out.println("������ �ű�ϴ�.");
	}
	void make() {
		System.out.println("Ʈ�� ����");
		
	}
	void reform() {
		System.out.println("Ʈ������ �ٽ� ��������ϴ�");
}
	
}
	

	
	
	
	
	
	
	
	
