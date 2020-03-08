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
      return "아이디[" + id + "], 비밀번호[" + pw + "], 이름[" + name + "], 포인트[" + point
            + "], 가입날짜[" + joinDate + "]";
   }
   
   
}