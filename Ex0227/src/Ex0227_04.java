import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		// 변신 카 프로그램
		// 1)소방차 생성
		// 2)앰블런스 생성
		// 3)트럭 생성
		// --------
		// 4) 기본차 변신
//		---------------------
		// 5) 원래 생성된 차로 변신
		// 6) 종료
		// 원하는 번호를 입력하시오.>>

		FireEngine fire = new FireEngine();
		Ambulance ambu = new Ambulance();
		Truck tru = new Truck();
		Scanner scan = new Scanner(System.in);
		Car car = null;
		int num = 0;
		while (true) {

			System.out.println("1 소방차생성 , 2.앰블런스생성 , 3.트럭 생성 , 4.기본차변신 5,원래 생성된 차로 변신");
			num = scan.nextInt();
			switch (num) {
			case 1:

				fire.make();
				car = fire;
				fire.water();
				break;
			case 2:

				ambu.make();
				car = ambu;
				ambu.siren();
				break;
			case 3:

				tru.make();
				car = tru;
				tru.stuff();
				break;
			case 4: //기본차로 변신
				System.out.println("기본차로 변신");
				car.drive();
				
			
				break;
			case 5:
				// 
				if(car instanceof FireEngine) {
					System.out.println("소방차로 다시 변신");
					fire = (FireEngine) car;
					fire.water();
				}
				if(car instanceof Ambulance) {
					System.out.println("구급차로 다시 변신");
					ambu = (Ambulance) car;
					ambu.siren();
				}
				if(car instanceof Truck) {
					System.out.println("트럭으로 다시 변신");
					tru = (Truck) car;
					tru.stuff();
				}

				break;
			default:
				break;
			}

		}
//		Car c = new Car();
//
//		 Ambulance a = new  Ambulance();
//		 Ambulance a2 = new  Ambulance();
//		 
//		 
//		 c.drive();
//		 
//		 c =a;
//		 a2 =(Ambulance)c;
//		 
//		 
//		 a2.siren();
//		
//		 a2.heal();

//		FireEngine fe = new FireEngine();
//		
//		if(fe instanceof FireEngine) {
//			System.out.println("네 FireEngine 맞습니다.");
//		}
//		
//		if(fe instanceof Car) {
//			System.out.println("네 Car객체 맞습니다.");
//		}
//		
//		if(fe instanceof Object) {
//			System.out.println("네 Object 객체 맞습니다.");
//		}

	}

}
