import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ܾ� ���߱� ����
		//���� - �ѱۼ���
		//����,�ѱ� ������ �Է� - �̸� �Է¸���.
		//���� ����� �ѱ� �Է¹���
		//�ѱ��� �´���? Ȯ��
		//��� ���
		//�ٽ� ���� ���
		
		
		// ������ �Է� words [3][2]
		String[][] words = {
				{"chair","����"},{"computer","��ǻ��"},{"array","�迭"},
		};
		String in_str = "";
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i][0] + "���� �����ϱ��?");
			in_str = scan.nextLine();
			//�����
			if(words[i][1].equals(in_str)) {
				System.out.println("�����Դϴ�. �������� ����>>");
			}else {
				if(count<3) {
					System.out.println((count+1)+"��° �����Դϴ� . �ٽõ���!!");
					count++; // Ƚ�� �߰�
					i--; // ���繮�� �ٽ� ����
					continue;
				}
					
				System.out.println("�����Դϴ�." + "������?"+words[i][1]);
				count = 0; // �ʱ�ȭ
				}

				
				
			}
		
			
		
		
		
	}//

}//
