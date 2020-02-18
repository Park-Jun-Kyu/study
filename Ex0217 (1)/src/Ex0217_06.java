import java.util.Scanner;

public class Ex0217_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시,분 - 24,60 int 초 float - 59.5 소수점 첫째자리까지 받음
		// 10개의 time을  받습니다. 알람시간 맞춤
		//배열을 선언해서 받으세요.
		//13 : 20: 52. 1초 알람맞춤
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
//				System.out.println(time[i]+"시"+minute[i]+"분"+secound[i]+"초로 알람이 설정되었습니다");
//			}
			
//			for(int i=0; i<10; i++) {
//				System.out.println("시,종료 99");
//				time[i] = scan.nextInt();
//				if(time[i] == 99) {
//					break;
//				}
//				System.out.println("분");
//				minute[i] = scan.nextInt();
//				System.out.println("초");
//				secound[i] = scan.nextFloat();
//				time_count++;
//			}
//			
//			for(int i=0; i<time_count; i++) {
//				System.out.println(time[i]+"시"+minute[i]+"분"+secound[i]+"초로 알람이 설정되었습니다");
//			}
		
		time[] t = new time[3];
		Scanner scan = new Scanner(System.in);
		String[] subject = {"시","분","초"};
		
		
		for(int i=0; i<t.length; i++) {
			t[i] = new time();
			System.out.print("시를 입력하세요. >> ");
			t[i].time = scan.nextInt();
			System.out.print("분을 입력하세요. >> ");
			t[i].minute = scan.nextInt();
			System.out.print("초를 입력하세요. >> ");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
