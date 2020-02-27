
public class SamsungTv extends Product {
	static int count;
	int product_n;
	int tv_inch;
	
	{
		product_n = ++count;
	}

	SamsungTv() {
		price = 1000;
		name = "lcd";
	
	}

}
