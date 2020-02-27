package study_200227;

public class SamsungTv1 extends Product1{

	static int count;
	int product_n;
	int tv_inch;

	{
		product_n = ++count;
	}

	SamsungTv1(){
		price = 1000;
		name = "lcd";
	}
}
