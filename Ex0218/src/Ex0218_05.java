import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		// �ζǴ�÷��ȣ class // ȸ��, ��÷��ȣ 6��, ���ʽ� ��ȣ
		// ���� �Է��� ��ȣ class // ȸ�� ��ȣ 6��, ��ġ����, ���, �ݾ�
		// �Է� > ȸ���Է� > ��ȣ 6�ڸ� �Է�
		// ȸ�� �˻��ؼ� -> � ��ġ�ϴ���? ����� �������? �ݾ��� ������?
		// 1�� 10��-6��, 2�� 1��-5�����ʽ�1��, 3�� 1õ����-5��, 4�� 1�ʸ���-4��, 5�� 1����-3��
		// �ݾ� - 1���ϴµ� . 1000�� ó���� 1���� ����
		
		//�ζǹ�ȣ �迭 ����
		//�ζǹ�ȣ 1~45������ �Է�
		//�ζǹ�ȣ �������� ����
		//�Է��ϴ� ��ȣ ��ü 10�� ����
		//�Է� 10�� ����
		//��ġ���� üũ ,���üũ,�ݾ�üũ
		

		int[] lotto_num = new int[6];
		int temp = 0;
		int lotto_index = 0;
		lotto lot = new lotto();
		int[] lotto = new int[45];
		int[] win_num = new int[6];
		int ok = 0;
		System.out.println("�ζǰ���");
		System.out.println("");

		Scanner scan = new Scanner(System.in);


		for(int i=0; i<6; i++) {
			lotto_num[i] = scan.nextInt();
		}
		
		for(int i=0; i<45; i++) {
			lotto[i]=(int)(Math.random()*45);
		}
		for(int i=0; i<45; i++) {
			
			lotto[i]= i + 1;
		}
		
//		for(int i=0; i<45; i++) {
//			lotto_index = (int)(Math.random()*45);
//			temp = lotto[i];
//			lotto[i] = lotto[lotto_index];
//			lotto[lotto_index] = temp;
		
		
		
//		}
		
		 shuffle(lotto);
		
		
		for(int i=0; i<45; i++) {
			for(int j=0; j<6; j++) {
				if(lotto_num[i]==lotto[j]) {
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
			System.out.println("��÷�Ǿ����ϴ�");
		
		
		switch (ok) {
		
		case 1:
			System.out.println("1�� ��÷����ϴ�");
			
			break;
		case 2:
			System.out.println("2�� ��÷����ϴ�");
			
			break;
		case 3:
			System.out.println("3�� ��÷����ϴ�");
			
			break;
		case 4:
			System.out.println("4�� ��÷����ϴ�");
			
			break;
		case 5:
			System.out.println("5�� ��÷����ϴ�");
			
			break;
		case 6:
			System.out.println("6�� ��÷����ϴ�");
			
			break;
			
		}
			for(int i=0; i<win_num.length; i++) {
				if(!(win_num[i]==0)) {
					System.out.println("��÷��ȣ : " + win_num[i]);
					
				}
				
			}
		}

	}//main

	
	// ���� �޼ҵ�  
	static void shuffle(int [] lotto) {
		
		int temp = 0;
		int lotto_index = 0;
		
		for(int i=0; i<45; i++) {
			lotto_index = (int)(Math.random()*45);
			temp = lotto[i];
			lotto[i] = lotto[lotto_index];
			lotto[lotto_index] = temp;
		}
		
	}
}///class
