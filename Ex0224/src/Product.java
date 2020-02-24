
public class Product {

	static int count;
	int serialNo;
	String color; // white , black ,red
	int tvInch; // 42,50,72
	String standard; // lcd, led,oled
	
	{
		count++;
		serialNo = count;
	}

	Product() {


	}

	Product(String color, int tvInch, String standard) {
		count++;
		serialNo = count;
		this.color = color;
		this.tvInch = tvInch;
		this.standard = standard;
	}
	
	Product(String color){
	
	}

}
