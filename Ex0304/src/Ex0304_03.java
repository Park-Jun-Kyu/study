
public class Ex0304_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1 = new Card(1, "ȫ�浿","�����ý�","����",100000000,10,25,"010111111");
		Card c2 = new Card();
		Card c3 = new Card();
		//3���� ������ �Է��ϰ� toString�� �������̵��ؼ� ����� �غ�����.
		
System.out.println(c1);
	

		
		

	}

}


class Card{
	
	int id_num;
	String name;
	String department;
	String position; //��å
	int salary; //�ٹ��Ⱓ
	int period; //����
	int v_count; //
	String tel; // ��ȭ��ȣ
	
	Card(){	
		
	}
	
	Card(int id_num,String name,String department,String position,int salary,int period,int v_count,String tel){
		this.id_num = id_num;
		this.name = name;
		this.department = department;
		this.position = position;
		this.salary = salary;
		this.period = period;
		this.v_count = v_count;
	}
	
	
	public String toString() {
	String a =	"��� : " + id_num+","+"�̸� : " + name+","+"�μ� : " + department+","+"��å : " + position+","+"���� : " + salary+","+"��å : " + period+","+
				"���� : " + v_count+","+"��ȭ��ȣ : " + tel;

		

		
		
		return a;
	}
	
	
	
	
//	String kind;
//	int number;
//	
//	Card(){this("SPADE",1);}
//	
//	Card(String kind,int number){
//		this.kind = kind;
//		this.number = number;
//	}
	
}