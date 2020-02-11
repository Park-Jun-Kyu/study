
public class Ex0211_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coin = {500,100,50,10};
		int[] money = new int [4];
		
		money[0] = coin[0];
				
		for(int i=0;i<money.length;i++) {
			System.out.println(money[i]);
			// 1) 500, 0 , 0 , 0 2) 0,0,0,0,   3) 500,100,50.10
		}
		
		money[0] = 5000;
		for(int i=0;i<coin.length;i++) {
			System.out.println(coin[i]);
			//1) 500,100,50,10  , 2) 5000,100,50,10
		}
		
	}

}
