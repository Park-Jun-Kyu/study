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
			System.out.println("aaa똑같습니다");
		}

		System.out.println("local x=" + x);
		System.out.println("인스턴스 x=" + this.x);
		System.out.println("조상 x = " + super.x);
	}

}