import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class Ex0305_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long between = 0;
		
		Calendar today = Calendar.getInstance();
		
		//
		
		Calendar today2 = Calendar.getInstance();
		
	
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("포멧없는 일시출력 : "+today.getTime());
		System.out.println("포멧있는 일시출력 : "+format1.format(today.getTime()));
		
		
		System.out.println("현재시간을 밀리세컨드로 표시 : "+today.getTimeInMillis());
		
		today2.set(Calendar.YEAR,2021);
		today2.set(Calendar.MONTH,02);
		today2.set(Calendar.HOUR,11);
		today2.set(Calendar.MINUTE,59);
		today2.set(Calendar.SECOND,59);
		
		
		
		int year = today.get(Calendar.YEAR);
		System.out.println("today현재 년도 :"+year);
		int month = today.get(Calendar.MONTH);
		System.out.println("today현재 달 : " + (month+1));
		int date = today.get(Calendar.DATE);
		System.out.println("today현재 일 :" + date);
		System.out.println("------------------------------------------");
		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2현재 년도 :"+year2);
		int month2 = today2.get(Calendar.MONTH);
		System.out.println("today2현재 달 : " + (month2+1));
		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2현재 일 :" + date2);
		System.out.println("today2 밀리세컨 :" + today2.getTimeInMillis());
		
		
		System.out.println("-------------------------------------");
		String d_day = "2020-03-14 11:59:59";
		
		try {
			Date enddate = format1.parse(d_day);
			System.out.println("직접입력 일시 : " + enddate.getTime());
			between =  today.getTimeInMillis()-enddate.getTime();
			System.out.println("long 타입 변수 = " +  between);
			System.out.println("현재 시간과 직접입력시간 " + (today.getTimeInMillis()-enddate.getTime()));
			System.out.println("현재 시간과 직접입력시간 " + Math.abs(today.getTimeInMillis()-enddate.getTime()));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
