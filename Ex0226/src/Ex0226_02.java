import java.util.Scanner;

public class Ex0226_02 extends Object {
	
	Ex0226_02(){
		super();
	}
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.method();

	}

}

class Parent extends Object {
	int x = 20;

	Parent() {
		super();

	}

}

class Child extends Parent {

	Child() {
		super();
	}

	void method() {
		String a = "aaa";
		String b = "aaa";
		if (a.equals(b)) {
			System.out.println("aaa�Ȱ����ϴ�");
		}

		System.out.println("local x=" + x);
		System.out.println("�ν��Ͻ� x=" + this.x);
		System.out.println("���� x = " + super.x);
	}

}