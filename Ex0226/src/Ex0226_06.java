import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Time1 t = new Time1();

		while (true) {

			System.out.println("�ð��� �Է��ϼ���");
			int h = scan.nextInt();
			if (!(t.setHour(h))) {

				continue;
			}
			;
			System.out.println("�ð��� �ԷµǾ����ϴ�");
			break;
		}

	}

}

class Time1 {
	private int hour;
	private int minute;
	private int second;

	Time1() {
		this(1, 1, 1);

	}

	Time1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public boolean setHour(int hour) {
		if (hour < 0 || hour > 24) {
			System.out.println("�߸��� �ð��� ���Խ��ϴ�.");
			return false;
		}
		this.hour = hour;
		return true;
	}

	public int getMintue() {
		return minute;
	}

	public void setMintue(int mintue) {
		if (minute < 0 || minute > 59) {
			System.out.println("�߸��� ���� ���Խ��ϴ�");
			return;
		}
		this.minute = mintue;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("�߸��� �ʰ� ���Խ��ϴ�.");
			return;
		}
		this.second = second;
	}

	public String toString() {

		return hour + "��" + minute + "��" + second + "��";
	}

}