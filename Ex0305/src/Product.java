




public class Product {

	int price;
	String name;
	int count;
	String color;
	Product(){
		
	}

		Product(int price,String name,String color){
			this.price=price;
			this.name = name;
			this.color = color;
		}
	}
	
	
class SamsungTv_LCD extends Product{
	SamsungTv_LCD(){price = 1000; name = "Tv_LCD" ; color = "black";};
}
class SamsungTv_LED extends Product{
	SamsungTv_LED(){price = 1200; name = "Tv_LED" ; color = "white";};
}
class SamsungTv_OLEDTV extends Product{
	SamsungTv_OLEDTV(){price = 1500; name = "Tv_OLEDTV" ; color = "pink";};
}








class SamsungTv extends Product{
	
	String name = "";
	int product_n;
	
	{
		product_n = ++count;
	}
	
	SamsungTv(){
		price = 1000;
		name = "Tv";
	}
}