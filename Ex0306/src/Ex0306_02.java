import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_02 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add(new Integer(1));
		set1.add(new Integer(2));
		set1.add(new Integer(1));
		set1.add(new Integer(4));
		set1.add(new Integer(1));
		set1.add(new Integer(5));
		
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
//			it.remove();
		}
		Iterator it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println("2번째 출력");
			System.out.println(it1.next());
//			it.remove();
		
	}
	}
}
