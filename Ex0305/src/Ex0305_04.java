import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

public class Ex0305_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2020년 3월 14일 15시 39분 42초
		// 2021년 4월 14일  12시 59분 59초
		// 몇일 몇시 몇분 몇초가 남았는지 계산
		
//		Calendar time = Calendar.getInstance();
//		Calendar sec_time = Calendar.getInstance();
//		sec_time.set(2021,3,14,13,59,59)
//;//		sec_time.set(Calendar.YEAR,2021);
////		sec_time.set(Calendar.MONTH,3);
////		sec_time.set(Calendar.DATE,14);
//		SimpleDateFormat time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sec_time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(time1.format(time.getTime()));
//		System.out.println(time.getTimeInMillis());
//		System.out.println(sec_time1.format(sec_time.getTime()));
//		System.out.println(sec_time.getTimeInMillis());
//		
//		long time5 =sec_time.getTimeInMillis() - time.getTimeInMillis();
//		System.out.println(time5);
//		long day = time5 / (1000* 60 *60 * 24);
//		long hour = (time5 % (1000  * 60 * 60 * 24)) / (60 * 60); 
//		long minute = (time5 %( 1000  * 60 * 60 * 24 - hour * 3600)) % 60; 
//		long second = time5 % 60;
//				
//		
//		System.out.println("남은 시간 "+day + "일 " + hour + "시간 " + minute + "분 " + second+ "초");
		
		
		
		 //2020년 3월 14일 15시 39분 42초
		   //2021년 4월 14 12시 59분 59초
		   
		   Calendar day1=Calendar.getInstance();
		   Calendar day2=Calendar.getInstance();
		   String[] yoil= {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		   
		   day1.set(2020,2,14,15,39,42);
		   day2.set(2021,3,14,12,59,59);
		   
		   day1.getTimeInMillis();
		   day2.getTimeInMillis();
		   
		   long diff=((day2.getTimeInMillis()-day1.getTimeInMillis())/1000);
		   long day=(diff/86400);
		   long hour=(diff%86400)/3600;
		   long minute=(diff%86400)%3600/60;
		   long second=(diff%86400)%3600%60/1;
		   
		   System.out.println(day+"일 "+hour+"시간 "+minute+"분 "+second+"초");
		   
		   int da=day2.get(Calendar.DAY_OF_WEEK);
		   System.out.println("2021년 4월 14일은 "+yoil[da]+" 입니다.");

	}

}
