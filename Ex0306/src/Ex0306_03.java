import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex0306_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("myid","1234");
		map.put("aaa","1234");
		map.put("koitt","k0001");
		map.put("bbb","1111");
		map.put("dream","d0001");
		
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.(��ҹ��ڱ���)");
			System.out.println("id : ");
			String id = scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("�Է��� ID�� �����ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			System.out.println(map.get(id));
			
			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			
			if(!(map.get(id).equals(pw))) {
				System.out.println("�н����尡 ��ġ�����ʽ��ϴ� �ٽ� �Է��ϼ�");
				continue;
			}else {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			
			
			
		}//while
		System.out.println("�ý��� ����");
	}//main

}//class