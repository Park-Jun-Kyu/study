import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex0305_02 {

	public static void main(String[] args) {
		// ���糯¥ ���� �ð��� ����ϼ���
		// 2020�� 3�� �� ����� -> ����Ͻÿ� DAY_OF_WEEK
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
		System.out.println("���� �⵵ : " + year);
		int month = today.get(Calendar.MONTH);
		System.out.println("���� �⵵ : " + month);
		int date = today.get(Calendar.DATE);
		System.out.println("���� �⵵ : " + date);
		int week = today.get(Calendar.DAY_OF_WEEK);
//		System.out.println(dayweek+days);
		
	
	
		String weeks = "";
		switch (week) {
		case 1:
			weeks = "��";
			break;
		case 2:
			weeks = "��";
			break;
		case 3:
			weeks = "ȭ";
			break;
		case 4:
			weeks = "��";
			break;
		case 5:
			weeks = "��";
			break;
		case 6:
			weeks = "��";
			break;
		case 7:
			weeks = "��";
			break;
		default:
			break;
		}

System.out.println(year+"��"+month+"��"+date+"��"+weeks);

	}//
}///
