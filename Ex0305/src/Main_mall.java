import java.util.ArrayList;
import java.util.Scanner;

public class Main_mall {

	public static void main(String[] args) {
		// �޴� ��ɾ� ( ī�� ���¿��� ���� �޼ҵ� �����ְ� deck�� ���� �̾� ������
		// 8 ȸ������ �˻� 9 ȸ�� ���� ����

		Scanner scan = new Scanner(System.in);
		Member m = new Member(null, null);
		Product p = new Product();
		ArrayList<Member> m1 = new ArrayList<Member>();
		ArrayList<Member> login = new ArrayList<Member>();
		ArrayList<Product> User = new ArrayList<Product>();
		int num = 0;
		String id = "", pw = "", name = "", tel = "";
		int money = 0, bonus_point = 0;
		int LCD_count =0 , LED_count = 0 , OLEDTV_count = 0;
		while (true) {
			System.out.println("1.ȸ������,2 �α��� ,4:��ǰ�˻� ,8.ȸ���˻� 9.ȸ�����");
			num = scan.nextInt();

			switch (num) {
			case 1:
				loop: while (true) {
					System.out.println("ȸ�������� ���� id�� �Է��ϼ���");
					m.id = scan.next();
					for (int i = 0; i < m.id.length(); i++) {
						if (m.id.length() < 3) {
							System.out.println("3���� �̻��̾�� �մϴ�");
							continue loop;
						}
					}
					System.out.println("��й�ȣ�� �Է��ϼ���");
					m.pw = scan.next();
					System.out.println("�̸��� �Է��ϼ���");
					m.name = scan.next();
					System.out.println("��ȭ��ȣ�� �Է��ϼ���");
					m.tel = scan.next();
					System.out.println("�����ݾ��� �Է��ϼ���");
					m.money = scan.nextInt();
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
					break;

				}
				m1.add(new Member(m.id, m.pw, m.name, m.tel, m.money));
				break;
			case 2:

				System.out.println("�α��� â");
				System.out.println("���̵� �Է��ϼ���");
				id = scan.next();
				if (!(id.equals(m.id))) {
					System.out.println("��ġ�ϴ� ���̵� �����ϴ� �ٽ� �Է��ϼ���");
					break;
				}
				for (int i = 0; i < login.size(); i++) {
					Member m_list = (Member) m1.get(i);
				}
				if (id.equals(m.id)) {
					System.out.println("�н����带 �Է��ϼ���");
					pw = scan.next();
					if (!(pw.equals(m.pw))) {
						System.out.println("��ġ�ϴ� ��й�ȣ�� �����ϴ� �ٽ� �Է��ϼ���");
					} else if (pw.equals(m.pw)) {
						login.add(new Member(m.id, m.pw));
						System.out.println("�α��� �Ǿ����ϴ�");
					}
				}

				break;

			case 4:
				System.out.println("��ǰ ����");
				num = scan.nextInt();

				switch (num) {
				case 1:
					for (int i = 0; i < m1.size(); i++) {
						Member m_list = (Member) m1.get(i);
					}
					if (m.money < p.price) {
						System.out.println("�ܾ��� �����ؼ� ���Ű� �ȉ���ϴ�");
						return;
					}
				System.out.println("LCD TV�� �����ϼ̽��ϴ�");
				if (p instanceof SamsungTv) {
					LCD_count++;
					System.out.println("���� tv ��� : " + LCD_count);
					System.out.println("���� �ܾ� : " +m. money);
				}
				m.money = m.money - p.price;
				bonus_point = bonus_point + m.money/10;
				System.out.println("���� ���� ����Ʈ  : " + m.money + "//" + bonus_point);
				
				
				
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;

				default:
					break;
				}

				break;

			case 8:
				System.out.println("ȸ�� ���� �˻�");
				System.out.println("�˻��� ���̵� �Է��ϼ���");
				id = scan.next();
				for (int i = 0; i < m1.size(); i++) {
					Member m_list = (Member) m1.get(i);
					if (id.equals(m.id)) {
						System.out.println(m.id + "�� �ֽ��ϴ�");
					} else {
						System.out.println("ȸ���� �����ϴ�");
					}
				}

				break;

			case 9:
				System.out.println("ȸ�� ���� ���");
				for (int i = 0; i < m1.size(); i++) {
					Member m_list = (Member) m1.get(i);
				}

				System.out.println("ȸ�� ���̵� : " + m.id + "\t��й�ȣ : " + m.pw + "\t�̸�" + m.name + "\t��ȭ��ȣ" + m.tel
						+ "\t�����ݾ�" + m.money);
			default:
				break;
			}

		}

	}

}
