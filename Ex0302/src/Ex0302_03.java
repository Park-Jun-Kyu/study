
public class Ex0302_03 {

	public static void main(String[] args) {
			Marine m1 = new Marine();
			m1.move(10, 10);
			
			Unit[] group = new Unit[10];
			group[0] = new Marine();
//			group[1] = new Tank();
//			group[2] = new Marine();
			group[3] = new Dropship();
			
			for(int i=0; i<group.length; i++) {
				if(!(group[i] == null)) {
				group[i].move(1000, 1000);
				}
			}
	} // main

}// classs

abstract class Unit {
	int x, y;

	abstract void move(int x, int y) ;

	void stop() {
		System.out.println("현재 위치에서 멈춤");
	}
}

class Marine extends Unit{
//	int x, y;
	
	void move(int x, int y) {
//		System.out.println(x + " , " + y + " : " +  "땅으로 움직임. 움직이는 속도 5");

		System.out.println("좌표 : " + x+ ","+y);
		System.out.println("움직인 거리 : " + (x+y));
		int time = (x+y)*4;
		
		System.out.println("움직인 시간 : " + (x+y)*4);
//		System.out.println(x + " , " + y + " 으로 이동, 걸리는 시간");
		
		
		
		System.out.println("[h:" + (time / 3600) + ", m:" + (time % 3600 / 60) + ", s:" + (time % 3600 % 60) + "]");
	 


		
	}

	void stimPack() {

	}

}

class Tank extends Unit{
	int x, y,z ;

	void move(int x, int y) {
		System.out.println(Math.sqrt(Math.pow(x,2) + (y*y))*6);
//		System.out.println(x + " , " + y + " : " +  "땅으로 움직임. 움직이는 속도 6");
	}
	void movetime(int z) {
		
		
	}

	void stop() {
		System.out.println("현재 위치에서 멈춤");
	}

	void changeMode() {

	}
}

class Dropship extends Unit {
	int x, y;

	void move(int x, int y) {
		
		Math.sqrt(Math.pow(x,2) + (y*y)*2);
		System.out.println(Math.sqrt(Math.pow(x,2) + (y*y))*2);
		System.out.println("좌표 : " + x+ ","+y); 
		System.out.println("움직인 거리 : " + (x+y));
		System.out.println("움직인 시간 : " + (x+y)*2);
		
		double time = Math.sqrt(Math.pow(x,2) + (y*y))*2;
		System.out.println("[h:" + (time / 3600) + ", m:" + (time % 3600 / 60) + ", s:" + (time % 3600 % 60) + "]");
//		System.out.println(x + " , " + y + " : " +  "하늘로 움직임. 움직이는 속도 10");
	}

	void stop() {

	}

	void load() {

	}

	void unload() {

	}
}
