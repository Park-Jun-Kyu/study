package study_200227;

public class SamsungTv2 extends Product2 {

	static int count;
	int product_n;
	int tv_inch;
	
	{
		product_n = ++count;
	}
	
	SamsungTv2(){
		price = 1000;
		name = "icd";
	}
	
}
