import java.util.Scanner;

public class Ex0217_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		board[] b = new board[2];
		int b_num = 0;
		int v_num = 0;
		String [] subject = {"��ȣ","����","����","�ۼ���","��ȸ��"};
		
		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<subject.length; i++) {
//			System.out.print(subject[i]+"\t");
//		}
		
			for(int i=0; i<b.length; i++) {
				b[i] = new board();
				System.out.println("[�Խ��� �� ���]");
				b[i].num = b_num+1;
//			System.out.println("��ȣ�� �Է��ϼ���");
//			b[i].num  = scan.nextInt();
			System.out.println("������ �Է��ϼ���");
			b[i].name = scan.next();
			System.out.println("������ �Է��ϼ���");
			b[i].list = scan.next();
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			b[i].per = scan.next();
			scan.nextLine();
//			System.out.println("��ȸ���� �Է��ϼ���");
//			b[i].reading = scan.nextInt();
			b[i].view_num = v_num; //��ȸ�� �ʱ�ȭ
			b_num++; //�۹�ȣ �ڵ�����
			System.out.println("-----------------------------");
			System.out.println("      [ �� ����Ʈ ��� ]");
			System.out.println("-----------------------------");
		
				System.out.println(subject[0]+"\t"+subject[1]+"\t"+subject[2]+"\t"+subject[3]+"\t"+subject[4]+"\t");
			
			for(int j=0; j<b_num; j++) {
				
				System.out.print(b[j].num+"\t"+b[j].name+"\t"+b[j].list+"\t"+b[j].per+"\t"+b[j].view_num+"\t");
				System.out.println();
			}
//			System.out.println(subject[i]+"\t");
//			b[i].print();
		}
	
	
		
		
		
	}

}
