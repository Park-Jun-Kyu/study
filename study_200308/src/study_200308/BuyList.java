package study_200308;
public class BuyList {
   String id;
   String name;
   int price;
   String buyDate;
   
   public BuyList(String id, String name, int price, String date) {
      super();
      this.id = id;
      this.name = name;
      this.price = price;
      this.buyDate = date;
   }

   @Override
   public String toString() {
      return "구매자[" + id + "], 상품명[" + name + "], 상품가격[" + price + "원], 구매날짜[" + buyDate + "]";
   }
   
   
}