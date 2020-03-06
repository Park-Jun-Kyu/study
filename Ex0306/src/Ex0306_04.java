import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_04 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		HashSet set1 = new HashSet();
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		
		map.put("myId","1234");
		map.put("dream","d1111");
		map.put("aaa","aoooo");
		map.put("bbb","d1111");
		map.put("aaa","axxxx");
		
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
