import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ð�ǥ
		// �� ȭ �� �� ��
		// 1 ���� ���� ���� ���� ����
		// 2 ����1 ���� ���� ����2 �����
		// 3 ���� ����1 ���� ���� ü��
		// 4 ���� �̼� ü�� ���� ����

//		Scanner scan = new Scanner(System.in);
//		
//		String [][]time = new String[4][5];
//		
//		String time [][] = {{"����,����,����,����,����"},{"����1,����,����,����2,�����"},{"����,����1,����,����,ü��"},
//		{"����,�̼�,ü��,����,����"}};
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println("������ �Է��ϼ���");
//				time[i][j] = scan.next();
//			}
//		}
//		
//		for(int i=0; i<time.length; i++) {
//			for(int j=0; j<time[i].length; j++) {
//				System.out.println(time[i][j]);
//			}
//			System.out.println();
//		}

//		Scanner scan = new Scanner(System.in);
//		
//		String [][]time = new String[4][5];
//		
//		for(int i=0; i<time.length; i++) {
//		for(int j=0; j<time[i].length; j++) {
//			System.out.println((i*5)+j+1+"��° ������ �Է��ϼ���.");
//			time[i][j] = scan.next();
//		}
//		System.out.println();
//	}
//		
//		
//		System.out.println("�ð�ǥ");
////		System.out.print("\t");
////		for(int i=0;i<5;i++) {
//			System.out.print("��");
//			System.out.print("\tȭ");
//			System.out.print("\t��");
//			System.out.print("\t��");
//			System.out.print("\t��\n");
////		}
//		for(int i=0; i<time.length; i++) {
//			System.out.print(i+1);
//		for(int j=0; j<time[i].length; j++) {
//			System.out.print(time[i][j]+"\t");
//		}
//		System.out.println();
//	}
//		

		// 2,4,6,8,10,12,14,16
		// 18 ..........

//		int[][] score = new int[5][8];
//
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				score[i][j] = ((i*8)+j+1)*2;  //0~39
//
//			}
//		}
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}

		
		Scanner scan = new Scanner(System.in);
		
		int in_x = 0 ;
		int in_y = 0 ;
		
		int [][] score = new int [3][3]; //0,1
		String [][] score_in = new String[3][3]; //���� �Է��ؼ� �����ϴ� �迭
		
		while(true) {
			
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = (int)(Math.random()*2);
				
				
			}
		}
		
		System.out.println("x��ǥ�� �Է��ϼ���.>>(����:99)");
		in_x = scan.nextInt();
		if(in_x == 99) {
			System.out.println("�ý��� ����");
			break;
		}
		System.out.println("y��ǥ�� �Է��ϼ���.>>");
		in_y = scan.nextInt();
		
		if(score[in_x][in_y]==1) {
			score_in[in_x][in_y] = "��÷";
		}else {
		   score_in[in_x][in_y] ="��";
		}
		
		System.out.println("--------------------------");
		System.out.println("     [ ��ǥ���߱� ���� ]");
		System.out.println("--------------------------");
		System.out.print("\t0\t1\t2\n");
		
		
		for(int i=0; i<score_in.length; i++) {
			System.out.print(i+"\t");
			for(int j=0; j<score_in[i].length; j++) {
				System.out.print(score_in[i][j]+ "\t");
			}
			
			
			System.out.println();
		}
		
		}
		
		//��ǥx 1
		//��ǥy 2 [1,2] -> 1�� ������ score_in[1,2] ��÷ �Է�
		//0�� ������ score_in[1,2]  �� �Է�
		// 	  0  1  2
		// 0
		// 1
 		// 2
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // class
}// main
