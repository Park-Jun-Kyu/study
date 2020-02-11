import java.util.Scanner;

public class Ex0211_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//소수점 자리 두개 입력받고
		//사칙연산
		//소수점은 2째자리까지 나타날수 있도록 해보세요%.2f
		
		//1차원 배열 크기 10 만들고
		// 배열에 랜덤수 10,100,1000 중 1개넣기
		
		
		double a = 0;
		double b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		
	
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		double d = 10/3;
		System.out.println(10%3);
		
		
		
		double c = (Math.round(67.655555*100)/100.0);
	   System.out.println(c);
		
				

		
		
		
		
				
				
				
		
	}

}
