import java.util.Scanner;

public class EX0212_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Խ��� ���α׷�
		//��ȣ(1) - int  �̸� ���� �۳��� -String ��ȸ�� -int
		//10������ �Է��� �����ѵ� 
		//1 ȫ�浿 �Խ��� �ϼ� �Խ����� �ϼ��Ǿ����ϴ�. ��ȸ�� 0
		String[][] score = new String [2][5];
		int [] name = new int [3];
		int [] num = new int[5];
		String [] subject = {"��ȣ\t","�̸�\t","����\t","�۳���\t","��ȸ��\t"};
		Scanner scan = new Scanner(System.in);
		

		
		for(int i=0; i<score.length; i++) {
			System.out.println("�Խ��ǿ� �� ��ȣ�� �Է��ϼ���");
			name[i] =scan.nextInt();
			for(int j=0; j<score[i].length-1; j++) {
//				System.out.println("�Խ��ǿ� �� <����>�� �Է��ϼ���");
				System.out.println(subject[j]+ "�� �Է����ּ���.");
				score[i][j] = scan.nextLine();
				scan.nextLine();
				
			}
			System.out.println("��ȸ���� �Է��ϼ���");
				num[i] = scan.nextInt();
			
//			
		}
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]);
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]);
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(num[i]);
			System.out.println();
			
			
			
		}

	}

}
