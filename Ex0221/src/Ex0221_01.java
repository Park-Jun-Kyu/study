import java.util.Scanner;

public class Ex0221_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� 10���� 1���� �迭�� ����
		// 1~45�� ���� �־����. ^-^

		int[] lotto = new int[45];
		int[] lotto2 = new int[10];
		int temp = 0;
		int result = 0;
		int sum = 0;
		int s_num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
//			System.out.println("1. 45���� ���ֱ�");
//			System.out.println("2. ��������");
//			System.out.println("3. 10���� ���ֱ�");
//			System.out.println("4. 10�� ���");
//			System.out.println("5. 10�� �ձ��ϱ�");
//			System.out.println("6. 10���� ���ֱ�");
//			s_num = scan.nextInt();
			s_num = main_pArr();
//			scan.nextLine();
			switch (s_num) {
			case 1:
				lotto22(lotto);
				System.out.println("45�� ���ֱ�");
				
				break;
			case 2:
				lotto33(lotto);
				System.out.println("��������");
				break;
			case 3:
				lotto44(lotto,lotto2);
				System.out.println("10�� ���ֱ�");
				break;
			case 4:
				lotto45(lotto2);
				System.out.println("10�� ���");
				
				break;
			case 5:
				lotto66(lotto2);
				System.out.println("10�� �ձ��ϱ�");
				
				break;
			case 6:
				int [] lotto3 = new int[10];
			 //�ٲ�� ���� �迭
				lotto44(lotto2,lotto3);
				for(int i=0; i<lotto3.length; i++) {
					lotto3[i] = lotto2[i];
				}
				lotto45(lotto2);
				lotto45(lotto3);
		
				System.out.println("10�� �����ϱ�");
		
			}//switch
		}//while

//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = i+1;
//		}
//		
//		lotto33(lotto);
//		
//		for(int i=0; i<lotto2.length; i++) {
//			System.out.println(lotto2[i]);
//		}
//		
//		}

	}// main
	
	
	
	static int main_pArr() {
		Scanner scan = new Scanner(System.in);
		int s_num = 0;
		System.out.println("1. 45���� ���ֱ�");
		System.out.println("2. ��������");
		System.out.println("3. 10���� ���ֱ�");
		System.out.println("4. 10�� ���");
		System.out.println("5. 10�� �ձ��ϱ�");
		System.out.println("6. 10���� ���ֱ�");
		s_num = scan.nextInt();
		return s_num;
		
	}
	
	

	static void lotto22(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
			
		} // 

	} //lotto22

	static void lotto33(int[] lotto) {
		
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			int temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}
		
	}
	
	
	static void lotto44(int[] lotto , int[] lotto2) {
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto[i];
			System.out.println(lotto[i]);
		}
		
	}
	
	
	
	static void lotto45(int [] lotto2) {
		for(int i=0; i<lotto2.length; i++) {
			
		System.out.println(lotto2[i]);
		}
	}
	
	
	static void lotto55(int[] lotto) {
	for (int i = 0; i < lotto.length; i++) {
		lotto[i] = (int)(Math.random()*25);
	}
		}
	


	
	
	static int lotto66(int [] lotto2) {
		int sum = 0;
		for(int i=0; i<lotto2.length-1; i++) {
			
			sum = sum + lotto2[i];
			
		}
		System.out.println("��ģ��" + sum);
		return  sum;
		
	}
	
	
	
	static int [] sortArr(int [] lotto, int lotto2[]) {
	
		for(int i=0; i<lotto2.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto2.length-1-i; j++) {
				if(lotto[j] < lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
//					System.out.println(lotto[i]);
					change = true;
				}//if2
			}//for2
			if(change==false) {
				break;
			}//if1
		}//for1
		
		
		
		for(int i =0; i<lotto2.length; i++) {
			System.out.println(lotto[i]);
		}
	return lotto;
}
	
	
	

}// class
