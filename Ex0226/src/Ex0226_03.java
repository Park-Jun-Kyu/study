
public class Ex0226_03 extends Object {

	Ex0226_03(){
		super();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(100, 100);
		System.out.println(p.getLocation());

	}

}

class Point extends Object {
	int x;
	int y;
	
	
	
	Point(){
		
	}
	

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "XÁÂÇ¥ : " + x + " / " + "YÁÂÇ¥ : " + y;
	}

}

class Point3D extends Point {
	
	int z;
	
	Point3D(int x , int y, int z){
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "XÁÂÇ¥ : " + x + " / " + "YÁÂÇ¥ : " + y+" /"+"zÁÂÇ¥ : "+z;
	}
	
	

}