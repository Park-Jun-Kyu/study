package study_200308;


public class Member {
   
   String id;
   String pw;
   String name;
   int point;
   String joinDate;
   
   public Member() {}
   
   public Member(String id, String pw, String name, String date) {
      super();
      this.id = id;
      this.pw = pw;
      this.name = name;
      this.point = 0;
      this.joinDate = date;
   }

   @Override
   public String toString() {
      return "���̵�[" + id + "], ��й�ȣ[" + pw + "], �̸�[" + name + "], ����Ʈ[" + point
            + "], ���Գ�¥[" + joinDate + "]";
   }
   
   
}