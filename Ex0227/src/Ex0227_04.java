import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		// ���� ī ���α׷�
		// 1)�ҹ��� ����
		// 2)�ں��� ����
		// 3)Ʈ�� ����
		// --------
		// 4) �⺻�� ����
//		---------------------
		// 5) ���� ������ ���� ����
		// 6) ����
		// ���ϴ� ��ȣ�� �Է��Ͻÿ�.>>

		FireEngine fire = new FireEngine();
		Ambulance ambu = new Ambulance();
		Truck tru = new Truck();
		Scanner scan = new Scanner(System.in);
		Car car = null;
		int num = 0;
		while (true) {

			System.out.println("1 �ҹ������� , 2.�ں������� , 3.Ʈ�� ���� , 4.�⺻������ 5,���� ������ ���� ����");
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
			case 4: //�⺻���� ����
				System.out.println("�⺻���� ����");
				car.drive();
				
			
				break;
			case 5:
				// 
				if(car instanceof FireEngine) {
					System.out.println("�ҹ����� �ٽ� ����");
					fire = (FireEngine) car;
					fire.water();
				}
				if(car instanceof Ambulance) {
					System.out.println("�������� �ٽ� ����");
					ambu = (Ambulance) car;
					ambu.siren();
				}
				if(car instanceof Truck) {
					System.out.println("Ʈ������ �ٽ� ����");
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
//			System.out.println("�� FireEngine �½��ϴ�.");
//		}
//		
//		if(fe instanceof Car) {
//			System.out.println("�� Car��ü �½��ϴ�.");
//		}
//		
//		if(fe instanceof Object) {
//			System.out.println("�� Object ��ü �½��ϴ�.");
//		}

	}

}
