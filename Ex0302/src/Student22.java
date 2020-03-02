
public class Student22 {
	static int count = 0;
	int hak_num;
   String name;
   int kor;
   int eng;
   int math;
   int total;
   float avg;
   int rank;
   {
	   hak_num = ++count;
   }

   Student22() {

   }

   Student22(String name, int kor, int eng) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.total = kor + eng ;
      this.avg = total / 3;

   }

   void total() {
      total = kor + eng ;

   }

   void avg() {
      avg = total / 2;

   }
}
