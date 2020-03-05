import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_03 {

	public static void main(String[] args) {
		//현재 시간에서 
		//2020년 7월 24일 금요일 11:59:59
		//현재까지 몇일 몇분 몇초가 남았는지 계산해보셈
		
		Calendar time = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		
		SimpleDateFormat time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(time1.format(time.getTime()));
		
		System.out.println("현재 시간 " + time.getTimeInMillis());
		
		
		time3.set(Calendar.YEAR,2020);
		time3.set(Calendar.MONTH,6);
		time3.set(Calendar.DATE,24);
		
		SimpleDateFormat time4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(time4.format(time3.getTime()));
		System.out.println("도쿄올림픽 " + time3.getTimeInMillis());
		
		
		
		long time2 = time.getTimeInMillis();
		long time5 = time3.getTimeInMillis();
		long time6 = time5-time2;
		System.out.println(time6);
		
		
		long day = time6 / (1000* 60 *60 * 24);
		long hour = (time6 - day  * 60 * 60 * 24) / (60 * 60); 
		long minute = (time6 - day  * 60 * 60 * 24 - hour * 3600) / 60; 
		long second = time6 % 60;
//		
//		
//		
		System.out.println("남은 시간 "+day + "일 " + hour + "시간 " + minute + "분 " + second+ "초");
		
		
	}

}









//
//int totalSec = 4350000;
//
//int day = totalSec / (60 * 60 * 24);
//int hour = (totalSec - day * 60 * 60 * 24) / (60 * 60); 
//int minute = (totalSec - day * 60 * 60 * 24 - hour * 3600) / 60; 
//int second = totalSec % 60;
//
//System.out.println(day + "일 " + hour + "시간 " + minute + "분 " + second
//		+ "초");