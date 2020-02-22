
public class Ex0220_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최대값 1~25까지에서 랜덤으로 5개의 숫자를 배열에 넣고
		// 그 가운데 최대값을 구하시오.
		int result = 0;
		int[] lotto = new int[25];
		int[] lotto2 = new int[5];
		int result1 = 0;
//		for(int i=0; i<lotto.length; i++ ) {
//			lotto[i]= (int)(Math.random()*25);
//		}
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*25);
		}
		
		

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random()*25);
			int temp = lotto[random];
			lotto[random] = lotto[0];
			lotto[0] = temp;
		}

		for (int i = 0; i < lotto2.length; i++) {
			System.out.println(lotto[i]);
		}
		
		for(int i =0; i<5; i++) {
			
			result = (int)(Math.max(result, lotto[i]));
			
			
		}
		System.out.println("제일 큰값" + result);	
	
		
		
//
//		if (lotto[0] > lotto[1]) {
//			System.out.println("제일 큰수" + lotto[0]);
//		} else if (lotto[1] > lotto[2]) {
//			System.out.println("제일 큰수" + lotto[1]);     
//		} else if (lotto[2] > lotto[3]) {
//			System.out.println("제일 큰수" + lotto[2]);
//		} else if (lotto[3] > lotto[4]) {
//			System.out.println("제일 큰수" + lotto[3]);
//		} else if (lotto[4] > lotto[0]) {
//			System.out.println("제일 큰수" + lotto[4]);
//		}

		
//		for(int i=0; i<lotto2.length-1; i++) {
//			boolean change = false;
//			for(int j=0; j<lotto2.length-1-i; j++) {
//				if(lotto2[j] < lotto2[j+1]) {
//					int temp = lotto2[j+1];
//					lotto2[j+1] = lotto2[j];
//					lotto2[j] = temp;
//					change = true;
//				}
//				if(change==false) {
//					break;
//				}
//			}
//		}
		
		
		
	}//

}//
