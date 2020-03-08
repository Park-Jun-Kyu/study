package study_200308;


public class Product {

   int code;
   String name;
   int price;
   int point;
   String option;
   
   public Product() {}
   
   public Product(int code, String name, int price, int point, String option) {
      super();
      this.code = code;
      this.name = name;
      this.price = price;
      this.point = point;
      this.option = option;
   }
}

class Tv extends Product{
   String screen;
   int inch;
   public Tv(int code, String name, int price, int point, String option, String screen, int inch) {
      super(code, name, price, point, option);
      this.screen = screen;
      this.inch = inch;
   }
   @Override
   public String toString() {
      return "��ũ��[" + screen + "], ũ��[" + inch + "��ġ]";
   }
}

class Fridge extends Product{
   int liter;
   String door;
   public Fridge(int code, String name, int price, int point, String option, int liter, String door) {
      super(code, name, price, point, option);
      this.liter = liter;
      this.door = door;
   }
   @Override
   public String toString() {
      return "����[" + liter + "], �� ����[" + door + "]";
   }
}

class Washer extends Product{
   int size;
   String shape;
   public Washer(int code, String name, int price, int point, String option, int size, String shape) {
      super(code, name, price, point, option);
      this.size = size;
      this.shape = shape;
   }
   @Override
   public String toString() {
      return "������[" + size + "], ����[" + shape + "]";
   }
}
