import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set -> 4,6,57,3,2,10 �����ؼ� ����غ�����
		//map -> 1,�� 2,�� 3,�� 4,�� 5,
		//�α��� ���¸� ������
		//MAP ���
		
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


		
		map.put("1","��");
		map.put("2","��");
		map.put("3","��");
		map.put("4","��");
		map.put("5","��");
		
		Iterator it1 = map.entrySet().iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
			
		

	}

}
