import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭
		String[] ganji = {"��","��","ȣ����","�䳢","��","��",
						  "��","��","������","��","��","����"
		};
		String[] ganji2 = {"��","��","��","��","��","��","��",
							"��","��","��","��","��"
		};
		// ��-> �� �� �� �� �� �� �� �� �� �� �� ��
		// ��-> �� �� ȣ����
		String select1 = "";
		char ch = ' ';
		
		
		
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String select = "";
			
		
		while(count==12) {
		System.out.println("���������� �Է��ϼ�");
		select = scan.next();
		
			
		
		for(int i=0; i<ganji2.length; i++) {
			if(select.equals(ganji2[i])) {
				System.out.println(select+ "��(��)"+(i+1)+" �������ſ��� "+ganji[i]);
			}
		}
		}
//			ch = select.charAt();
//		System.out.println(select+"��° ���?"+ganji[select-1]+"-----"+ ganji2[select-1]);
//		}
	
	}//
	

}//
