import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex0305_03 {

	public static void main(String[] args) {
		//���� �ð����� 
		//2020�� 7�� 24�� �ݿ��� 11:59:59
		//������� ���� ��� ���ʰ� ���Ҵ��� ����غ���
		
		Calendar time = Calendar.getInstance();
		Calendar time3 = Calendar.getInstance();
		
		SimpleDateFormat time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(time1.format(time.getTime()));
		
		System.out.println("���� �ð� " + time.getTimeInMillis());
		
		
		time3.set(Calendar.YEAR,2020);
		time3.set(Calendar.MONTH,6);
		time3.set(Calendar.DATE,24);
		
		SimpleDateFormat time4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(time4.format(time3.getTime()));
		System.out.println("����ø��� " + time3.getTimeInMillis());
		
		
		
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
		System.out.println("���� �ð� "+day + "�� " + hour + "�ð� " + minute + "�� " + second+ "��");
		
		
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
//System.out.println(day + "�� " + hour + "�ð� " + minute + "�� " + second
//		+ "��");