import java.util.Scanner;

public class Ex0214_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ó�� ���α׷�
		// ----------------------
		int score[][] = new int[10][4];
		int num = 0;
		int in_put = 0;
		String [] subject = {"�̸�","����","����","����","�հ�","���","���"};
		String [] name = new String[3];
		String name_ch = "";
		int words_num = 0;
		while (true) {
		double [] avg = new double [10];
		int rank_count = 0; //��� ����
		int stu_num = 0,s_num=0; //�л��Է� ��, ���ù�ȣ
		String y_or_n =""; // ����
		System.out.println("����ó�� ���α׷�");
		System.out.println("1.�����Է�!, 2.�������!, 3.���α׷����� ,4.�л������˻�");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
	

		Scanner scan = new Scanner(System.in);

		
		num = scan.nextInt();
		scan.nextLine();
		loop:
			switch (num) {
			case 1:
//				System.out.println("�����Է�!");
				
				
				
				
				
					for(int i=0; i<score.length; i++) {
							System.out.println("������ ������ �Է��Ͻðڽ��ϱ�, ���� 99");
							name_ch = scan.next();
							if(name_ch.equals("99")) {
							System.out.println("�������� ���ư��ϴ�");
							break loop;
						}
						name[i]=name_ch;
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println(subject[j+1]+"������ �����Դϱ�");
						score[i][j] = scan.nextInt();
						score[i][score[i].length-1] += score[i][j];
					}
					
					avg[i] = score[i][score[i].length-1]/3;
					words_num++;
					
				}
				
				

				break;
			case 2:
				while(true) {
				
				for(int i=0; i<subject.length; i++) {
					System.out.print(subject[i] +"\t");
				}
				System.out.println();
				
				for(int i=0; i<words_num; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(avg[i]+"\t");
					System.out.println();
//					System.out.print(avg[i]+"\t");
				System.out.println();
				}
				System.out.println("�ٽ� ����Ͻðڽ��ϱ�?(y/n)");
				scan.nextLine();
				
				if(y_or_n.equals("n")||y_or_n.equals("n")) {
					System.out.println("����ȭ������ �̵��մϴ�");
					break;
				}
	
				}

				
			case 3:
				
				System.out.println("���ó���� �ϼ̽��ϴ�");
				for(int i=0; i<words_num; i++) {
					rank_count = 1;
					for(int j=0; j<words_num; j++) {
					if(	score[i][score[i].length-1] < score[j][score[i].length-1]) {
						rank_count++;
					}//if
						
					}//for2
				}//for1
				

			
				
			case 4:
				System.out.println("�л����� �˻��� �Է��ϼ̽�");
				
				System.out.println("���ϴ� �л��� �̸� �Է��ϼ�");
				name_ch = scan.nextLine();
				//�л� �̸�����
				for(int i=0; i<words_num; i++) {
					if(name_ch.equals(name[i])) {
						num = i;
						break;
					}
						num =-1; // ������ -1�� ����
					
					
				}
				if(!(num==1)) {
					

					for(int i=0; i<subject.length; i++) {
						System.out.print(subject[i] +"\t");
					}
					System.out.println();
					
					
				
//				for(int i=0; i<words_num; i++) {
					System.out.print(name[num]+"\t");
					for(int j=0; j<score[num].length; j++) {
						System.out.print(score[num][j]+"\t");
					}
					System.out.print(avg[num]+"\t");
					System.out.println();
//				}
				break;
			}
				System.out.println("���ϴ� �л��� �����ϴ�");
				// �л��� �Է�
				// �̸��� ���մϴ�.. in_name.equals(name[i])
				

			default:
				break;
			}

		}

	}

}
