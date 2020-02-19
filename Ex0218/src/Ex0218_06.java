import java.util.Scanner;

public class Ex0218_06 {
	public static void main(String[] args) {

		int lotto[] = new int[45];
		int lotto_num[] = new int[6];
		int win_num[] = new int[6];
		int temp = 0;
		int lotto_index = 0;
		int ok = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			lotto_num[i] = scan.nextInt();
		}

		for (int i = 0; i < 45; i++) {
			lotto[i] = (int) (Math.random() * 45) ;
		}
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}
		for (int i = 0; i < 45; i++) {
			lotto_index = (int) (Math.random() * 45) ;
			temp = lotto[i];
			lotto[i] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto_num[i] == lotto[j]) {
					ok++;
					win_num[i] = lotto[j];
				}
			}
		}
		
		
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		
		if(ok==0) {
			System.out.println("��÷���� �ʾҽ��ϴ�");
		}else {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�!");
		
			
		
	
			
		switch (ok) {
		case 1:System.out.println("1����÷");
		
			break;

		case 2:
			System.out.println("2����÷");
			break;
		case 3:
			System.out.println("3����÷");
			break;
		case 4:
			System.out.println("4����÷");
			break;
		case 5:
			System.out.println("5����÷");
			break;
		case 6:
			System.out.println("6����÷");
			break;
			
		default:
			break;
			

		}
		for(int i=0; i<win_num.length; i++) {
			if(!(win_num[i] == 0)) {
				System.out.println("��÷�Ǽ̽��ϴ�!"+win_num[i]);
			}
			
			
		}
		
		
		
		}
		
		
		

	}//
}//
//