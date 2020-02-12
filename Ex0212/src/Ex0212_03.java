import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열
		String[] ganji = {"쥐","소","호랑이","토끼","용","뱀",
						  "말","양","원숭이","개","닭","돼지"
		};
		String[] ganji2 = {"자","축","인","묘","진","사","오",
							"미","신","유","술","해"
		};
		// 쥐-> 자 축 인 묘 진 사 오 미 신 유 술 해
		// 축-> 쥐 소 호랑이
		String select1 = "";
		char ch = ' ';
		
		
		
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String select = "";
			
		
		while(count==12) {
		System.out.println("십이지신을 입력하셈");
		select = scan.next();
		
			
		
		for(int i=0; i<ganji2.length; i++) {
			if(select.equals(ganji2[i])) {
				System.out.println(select+ "는(은)"+(i+1)+" 십이지신에서 "+ganji[i]);
			}
		}
		}
//			ch = select.charAt();
//		System.out.println(select+"번째 띠는?"+ganji[select-1]+"-----"+ ganji2[select-1]);
//		}
	
	}//
	

}//
