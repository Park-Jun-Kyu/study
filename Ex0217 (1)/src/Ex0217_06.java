import java.util.Scanner;

public class Ex0217_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��,�� - 24,60 int �� float - 59.5 �Ҽ��� ù°�ڸ����� ����
		// 10���� time��  �޽��ϴ�. �˶��ð� ����
		//�迭�� �����ؼ� ��������.
		//13 : 20: 52. 1�� �˶�����
//		time t = new time();
		
		
//		int []time = new int [10];
//		int [] minute = new int [10];
//		float[] secound = new float [ 10];
////		int [] alam = new int[60];
//		int time_count = 0;
//		
//		Scanner scan = new Scanner(System.in);

		
//		for(int i=0; i<60; i++) {
//			if(time[i] == 13 && minute[i] == 20 && secound[i] == 32.1 ) {
//				System.out.println(time[i]+"��"+minute[i]+"��"+secound[i]+"�ʷ� �˶��� �����Ǿ����ϴ�");
//			}
			
//			for(int i=0; i<10; i++) {
//				System.out.println("��,���� 99");
//				time[i] = scan.nextInt();
//				if(time[i] == 99) {
//					break;
//				}
//				System.out.println("��");
//				minute[i] = scan.nextInt();
//				System.out.println("��");
//				secound[i] = scan.nextFloat();
//				time_count++;
//			}
//			
//			for(int i=0; i<time_count; i++) {
//				System.out.println(time[i]+"��"+minute[i]+"��"+secound[i]+"�ʷ� �˶��� �����Ǿ����ϴ�");
//			}
		
		time[] t = new time[3];
		Scanner scan = new Scanner(System.in);
		String[] subject = {"��","��","��"};
		
		
		for(int i=0; i<t.length; i++) {
			t[i] = new time();
			System.out.print("�ø� �Է��ϼ���. >> ");
			t[i].time = scan.nextInt();
			System.out.print("���� �Է��ϼ���. >> ");
			t[i].minute = scan.nextInt();
			System.out.print("�ʸ� �Է��ϼ���. >> ");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
