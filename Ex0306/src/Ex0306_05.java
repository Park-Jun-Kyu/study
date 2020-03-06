import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set -> 4,6,57,3,2,10 저장해서 출력해보세요
		//map -> 1,개 2,소 3,말 4,범 5,
		//로그인 형태를 만들어봇ㅁ
		//MAP 출력
		
		HashSet set = new HashSet();
		HashMap map = new HashMap();
		ArrayList list = new ArrayList();
		
		set.add(new Integer(4));
		set.add(new Integer(6));
		set.add(new Integer(57));
		set.add(new Integer(3));
		set.add(new Integer(2));
		set.add(new Integer(10));
		
		System.out.println(set);


		
		map.put("1","개");
		map.put("2","소");
		map.put("3","닭");
		map.put("4","말");
		map.put("5","범");
		
		Iterator it1 = map.entrySet().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
			
		

	}

}
