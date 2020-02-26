import java.util.Scanner;

public class Ex0226_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Time1 t = new Time1();

		while (true) {

			System.out.println("시간을 입력하세요");
			int h = scan.nextInt();
			if (!(t.setHour(h))) {

				continue;
			}
			;
			System.out.println("시간이 입력되었습니다");
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
			System.out.println("잘못된 시간이 들어왔습니다.");
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
			System.out.println("잘못된 분이 들어왔습니다");
			return;
		}
		this.minute = mintue;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("잘못된 초가 들어왔습니다.");
			return;
		}
		this.second = second;
	}

	public String toString() {

		return hour + "시" + minute + "분" + second + "초";
	}

}