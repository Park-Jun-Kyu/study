
public class Ex0304_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1 = new Card(1, "홍길동","마케팅실","팀장",100000000,10,25,"010111111");
		Card c2 = new Card();
		Card c3 = new Card();
		//3명의 직원을 입력하고 toString을 오버라이딩해서 출력을 해보세요.
		
System.out.println(c1);
	

		
		

	}

}


class Card{
	
	int id_num;
	String name;
	String department;
	String position; //직책
	int salary; //근무기간
	int period; //년차
	int v_count; //
	String tel; // 전화번호
	
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
	String a =	"사번 : " + id_num+","+"이름 : " + name+","+"부서 : " + department+","+"직책 : " + position+","+"월급 : " + salary+","+"직책 : " + period+","+
				"년차 : " + v_count+","+"전화번호 : " + tel;

		

		
		
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