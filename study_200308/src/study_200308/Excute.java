package study_200308;
import java.util.ArrayList;
import java.util.HashMap;

public interface Excute {

   public void setList(ArrayList<Product> product); // ��ǰ �Է�
   public String menu(); // �޴� ��� �� ����
   public void join(ArrayList<Member> member, HashMap<String, String> loginId); // ȸ������
   public void   login(ArrayList<Member> member, HashMap<String, String> loginId); // �α���
   public void logout(HashMap<String, String> loginId); // �α׾ƿ�
   public void productBuy(ArrayList<Member> member, ArrayList<Product> product, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // ��ǰ ����
   public void buyList(ArrayList<Member> member, ArrayList<BuyList> buyList, HashMap<String, String> loginId); // ���Ÿ��
   public void searchMember(ArrayList<Member> member); // ȸ�� �˻�
   public void memberList(ArrayList<Member> member, HashMap<String, String> loginId); // ȸ�� ����
}