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
			System.out.println("id와 password를 입력하세요.(대소문자구별)");
			System.out.println("id : ");
			String id = scan.nextLine().trim();
			if(!(map.containsKey(id))) {
				System.out.println("입력한 ID가 없습니다. 다시 입력하세요.");
				continue;
			}
			System.out.println(map.get(id));
			
			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			
			if(!(map.get(id).equals(pw))) {
				System.out.println("패스워드가 일치하지않습니다 다시 입력하셈");
				continue;
			}else {
				System.out.println("로그인 되었습니다.");
				break;
			}
			
			
			
		}//while
		System.out.println("시스템 종료");
	}//main

}//class
