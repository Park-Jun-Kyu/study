package study_200308;

import java.util.ArrayList;
import java.util.HashMap;

public class Mall {

   public static void main(String[] args) {
      Excute excute = new ExcuteImpl();
      ArrayList<Member> member = new ArrayList<Member>(); // ȸ�� ����Ʈ
      ArrayList<Product> product = new ArrayList<Product>(); // ��ǰ ����Ʈ
      ArrayList<BuyList> buyList = new ArrayList<BuyList>(); // ���� ����Ʈ
      HashMap<String, String> loginId = new HashMap<>(); // �α��� ����
      excute.setList(product); // ��ǰ �Է�
      
end:   while(true) {
         switch (excute.menu()) {
         case "1":
            excute.join(member, loginId); // ȸ������
            break;
         case "2":
            excute.login(member, loginId); // �α���
            break;
         case "3":
            excute.logout(loginId); // �α׾ƿ�
            break;
         case "4":
            excute.productBuy(member, product, buyList, loginId); // ��ǰ ���� 
            break;
         case "5":
            excute.buyList(member, buyList, loginId); // ���Ÿ��
            break;
         case "6":
            excute.searchMember(member); // ȸ�� �˻�
            break;
         case "7":
            excute.memberList(member, loginId); // ȸ�� ����/ȸ�� ����Ʈ
            break;
         case "0":
            break end;
         default:
            System.out.println("[�߸��� �Է��Դϴ�.]");
            break;
         }
      }
   }
}