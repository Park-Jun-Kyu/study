import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex0305_02 {

	public static void main(String[] args) {
		// 현재날짜 현재 시간을 출력하세요
		// 2020년 3월 일 목요일 -> 출력하시오 DAY_OF_WEEK
		Scanner scan = new Scanner(System.in);
		Calendar today = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(today.getTime());
		System.out.println(format1.format(today.getTime()));
		today.set(Calendar.YEAR, 2021);
		today.set(Calendar.MONTH, 3);
		today.set(Calendar.DATE, 5);
		int year = today.get(Calendar.YEAR);
		System.out.println("현재 년도 : " + year);
		int month = today.get(Calendar.MONTH);
		System.out.println("현재 년도 : " + month);
		int date = today.get(Calendar.DATE);
		System.out.println("현재 년도 : " + date);
		int week = today.get(Calendar.DAY_OF_WEEK);
//		System.out.println(dayweek+days);
		
	
	
		String weeks = "";
		switch (week) {
		case 1:
			weeks = "일";
			break;
		case 2:
			weeks = "월";
			break;
		case 3:
			weeks = "화";
			break;
		case 4:
			weeks = "수";
			break;
		case 5:
			weeks = "목";
			break;
		case 6:
			weeks = "금";
			break;
		case 7:
			weeks = "토";
			break;
		default:
			break;
		}

System.out.println(year+"년"+month+"월"+date+"일"+weeks);

	}//
}///
