
public class Ex0211_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] pay = new int [10];
		int [] pay2 = new int [10];
		
		int [] money = {0,500,1000,3000};
		int select = 0;
		
		
		for(int i=0; i<pay.length; i++) {
//			select = (int)(Math.random()*5);
			select = (int)(Math.random()*3);
//			pay[i] = money[10*select];
//			pay[i] = 10*select;
			
			
			switch(select) {
			case 0:
				pay[i] = 1;
				break;
			case 1:
				pay[i] =(10*1);
				break;
			case 2:
				pay[i] =(10*10);
				break;
			case 3:
				pay[i] = (10*10*10);
				break;
			}
			
		}
		System.out.println("1차원 배열 값 : ");
		for(int i=0; i<pay.length; i++) {
			System.out.print(pay[i]+" ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
