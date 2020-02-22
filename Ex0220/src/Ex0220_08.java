
public class Ex0220_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int[] lotto = new int[100];
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
//			System.out.println(lotto[i]);
		}
		
		
		
		
	
		for(int i=0; i<lotto2.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto2.length-1-i; j++) {
				if(lotto[j] < lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
//					System.out.println(lotto[i]);
					change = true;
				}
			}
			if(change==false) {
				break;
			}
		}
		
		
		
		for(int i =0; i<lotto2.length; i++) {
			System.out.println(lotto[i]);
		}
		System.out.println("-----------------------------------");
		
		for(int i=0; i<lotto2.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto2.length-1-i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = temp;
//					System.out.println(lotto[i]);
					change = true;
				}
			}
			if(change==false) {
				break;
			}
		}
		
		
		
		for(int i =0; i<lotto2.length; i++) {
			System.out.println(lotto[i]);
		}
		
		
		
		
		
		
		
		
//		for(int i=0; i<lotto2.length-1; i++) {
//			boolean change = false;
//			for(int j=0; j<lotto2.length-1-i; j++) {
//				if(lotto2[j] > lotto2[j+1]) {
//					int temp = lotto2[j+1];
//					lotto2[j+1] = lotto2[j];
//					lotto2[j] = temp;
//					System.out.println(lotto2[i]);
//					change = true;
//				}
//				if(change==false) {
//					break;
//				}
//			}
//		}
		
		
		
		
		
//		sortArr(lotto2);
//		System.out.println(lotto2);
		
//		for(int i =0; i<4; i++) {
//			
//			result = (int)(Math.max(lotto[i], lotto[i+1]));
//			
//			
//		}
//		System.out.println("力老 奴蔼" + result);	
	
		
		
//
//		if (lotto[0] > lotto[1]) {
//			System.out.println("力老 奴荐" + lotto[0]);
//		} else if (lotto[1] > lotto[2]) {
//			System.out.println("力老 奴荐" + lotto[1]);     
//		} else if (lotto[2] > lotto[3]) {
//			System.out.println("力老 奴荐" + lotto[2]);
//		} else if (lotto[3] > lotto[4]) {
//			System.out.println("力老 奴荐" + lotto[3]);
//		} else if (lotto[4] > lotto[0]) {
//			System.out.println("力老 奴荐" + lotto[4]);
//		}

		

		
		
		
		
	}//main
	
//	static void sortArr(int lotto2[]) {
//		
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
//		
//	}
	
	

}//class
