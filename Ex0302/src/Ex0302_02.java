import java.util.ArrayList;
import java.util.Scanner;

public class Ex0302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Student22> list = new ArrayList<Student22>();
		Scanner scan = new Scanner(System.in);
		ArrayList<Stu_info> list = new ArrayList<Stu_info>();
		String name[] = { "ȫ�浿", "�̼���" ,"ȫ�浿"};
		String major[] = { "�����а�", "�����а�" , "�̼��а�" };
		int[] grade = { 1, 2 , 4 };
		String[] tel = { "02-222-3333", "02-2222-2222", "02-782-3232" };

		list.add(new Stu_info(name[0], major[0], grade[0], tel[0]));
		list.add(new Stu_info(name[1], major[1], grade[1], tel[1]));
		list.add(new Stu_info(name[2], major[2], grade[2], tel[2]));

		while (true) {
			System.out.println("1) �л������Է� 2)��� 3)�˻�");
			int num = scan.nextInt();
			scan.nextLine();

			switch (num) {
			case 1:

//				while (true) {
//					System.out.println("�̸��� �Է��ϼ��� (����ȭ�� 99");
//					String name1 = scan.next();
//					if (name1.equals("99")) {
//						System.out.println("����ȭ������ ���ư�");
//						break;
//					}
//					System.out.println("������ �Է��ϼ���.>>");
//					String major1 = scan.next();
//					System.out.println("�г��� �Է��ϼ���.>>");
//					int grade1 = scan.nextInt();
//					scan.nextLine();
//					System.out.println("��ȭ��ȣ�� �Է��ϼ���.>>");
//					String tel1 = scan.nextLine();
//					list.add(new Stu_info(name1, major1, grade1, tel1));
//					list.add(new Stu_info(name[0], major[0], grade[0], tel[0]));
//				}
				break;
			case 2:
				// �����Ͱ� �ִ��� Ȯ��
				if(list.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�");
					break;
				}
				//�ݺ����
				for(int i=0; i<list.size(); i++) {
					Stu_info stu = (Stu_info)list.get(i);
					System.out.print(stu.hak_num+"\t"+stu.name+"\t");
					System.out.println(stu.major);
				
						}
				break;

			case 3:
				System.out.println("�˻��� �̸��� �Է��ϼ���.>> (����ȭ�� 99");
				while(true) {
				String name2 = scan.next();
				if(name2.equals("99")) {
					break;
				}
				for(int i =0; i<list.size(); i++) {
					Stu_info stu = (Stu_info)list.get(i);
					if(name2.equals(stu.name)) {
						System.out.println("ã�� �л���");
						System.out.println(stu.hak_num + " " + stu.name + " " + stu.major + " " + stu.grade + " " + stu.tel);
						
					}
				}
				}
				break;
			}
		}
	}
}
