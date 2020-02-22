import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		int[] lotto2 = new int[6];
		int num = 0;
		Scanner scan = new Scanner(System.in);
		// ��ȣ�ֱ�
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}
		// ���� \ ' -' /
		for (int i = 0; i < 45; i++) {
			int random = (int) (Math.random() * 45) ;
			int temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}

		for (int i = 0; i < 6; i++) {
			lotto2[i] = lotto[i]; /// 1~45
		}
		while (true) {
			System.out.println("1.�迭����ϱ�");
			System.out.println("2.�迭����");
			System.out.println("3.�迭��");
			System.out.println("4.�迭����");
			num = scan.nextInt();
			switch (num) {

			case 1:
				System.out.println("6���� �迭�� ����մϴ�.");
				printArr(lotto2);
				break;

			case 2:
				System.out.println("�迭����");
				shuffle(lotto,lotto2);
				break;
			case 3:
				System.out.println("6�� �迭 ��");
				int sum = 0;
//				sum = sumArr(lotto2[1],lotto2[2],lotto2[3],lotto2[4],lotto2[5],lotto2[6]);
				sum = sumArr(lotto2);
				System.out.println("�հ� : " +sum);
				break;

			case 4 :
				System.out.println("�迭����");
				sortArr(lotto2);
				
			}//switch
			System.out.println("���ڸ� �Է��ϼ���.");

		}//while

	}// main

	static void sortArr(int lotto2[]) {
		
		for(int i=0; i<lotto2.length-1; i++) {
			boolean change = false;
			for(int j=0; j<lotto2.length-1-i; j++) {
				if(lotto2[j] < lotto2[j+1]) {
					int temp = lotto2[j+1];
					lotto2[j+1] = lotto2[j];
					lotto2[j] = temp;
					change = true;
				}
				if(change==false) {
					break;
				}
			}
		}
		
	}
	
	
	static void printArr(int lotto2[]) {
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto2[i]+ " ");
			
		}
	}
	static void shuffle(int lotto[], int lotto2[]) {
		
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}
		// ���� \ ' -' /
		for (int i = 0; i < 45; i++) {
			int random = (int) (Math.random() * 45) ;
			int temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}

		for (int i = 0; i < 6; i++) {
			lotto2[i] = lotto[i]; /// 1~45
		
		}
	}
//	static int sumArr(int lotto1, int lotto2, int lotto3, int lotto4, int lotto5 , int lotto6) {
	static int sumArr(int lotto2[]) {
		
		int sum = 0;
		for(int i =0 ; i<lotto2.length; i++) {
			sum = sum + lotto2[i];
		}
		
		
		
//		int sum = 0;
//		
////				sum1 =  lotto1 + lotto2 + lotto3 + lotto4 + lotto5 + lotto6;
//				sum = sum + lotto2[0];
//				sum = sum + lotto2[1];
//				sum = sum + lotto2[2];
//				sum = sum + lotto2[3];
//				sum = sum + lotto2[4];
//				sum = sum + lotto2[5];
		
		
			return sum;
			}
		
		
	
	
}// class


