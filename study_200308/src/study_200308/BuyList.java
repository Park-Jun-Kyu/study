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
      return "������[" + id + "], ��ǰ��[" + name + "], ��ǰ����[" + price + "��], ���ų�¥[" + buyDate + "]";
   }
   
   
}