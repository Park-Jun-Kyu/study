import java.util.Scanner;

public class Ex0213_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5};
		int [] num2 = new int[5];
		
		
		
		System.arraycopy(num, 2, num2, 5, 3);
		
		
//		for(int i=0;i<num.length;i++) {	
//			num2[i] = num[i];
//	}
		
		
		
		
		for(int i=0;i<num.length;i++) {	
		System.out.println("num �迭�� :" +num[i]+"\n");
	}
		
		
		
		for(int i=0;i<num2.length;i++) {	
		System.out.println("num2 �迭�� :" +num2[i]+"\n");
	}
		System.out.println();
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) { //0,1,2,3
//			System.out.println("���� �Է��ϼ���.>>");
//			for(int i=0; i<4; i++) {
//				System.out.println("���� �Է��ϼ���");
//				num[i] = scan.nextInt();
//				
//				System.out.println("�Է°� :"+num[i]);
//				
//			}
//		}
		

	}

}
