package study_200308;
import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {

   public void setList(ArrayList<Product> product); // 상품 입력
   public String menu(); // 메뉴 출력 및 선택
   public void join(ArrayList<Member> member, HashMap<String, String> loginId); // 회원가입
   public void   login(ArrayList<Member> member, HashMap<String, String> loginId); // 로그인
   public void logout(HashMap<String, String> loginId); // 로그아웃
   public void productBuy(ArrayList<Member> member, ArrayList<Product> product, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // 상품 구매
   public void buyList(ArrayList<Member> member, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // 구매목록
   public void searchMember(ArrayList<Member> member); // 회원 검색
   public void memberList(ArrayList<Member> member, HashMap<String, String> loginId); // 회원 정보
}