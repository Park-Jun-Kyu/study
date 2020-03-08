package study_200308;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class ExcuteImpl implements Excute {

   Scanner sc = new Scanner(System.in);

   
   // ��ǰ �Է�
   @Override
   public void setList(ArrayList<Product> product) {
      product.add(new Tv(1, "LCDTV", 1000, 100, null, "LCD", 40));
      product.add(new Tv(2, "LEDTV", 1500, 150, null, "LED", 50));
      product.add(new Tv(3, "OLEDTV", 2000, 200, "HDR", "OLED", 60));
      product.add(new Fridge(4, "�Ϲ� �����", 1000, 100, null, 100, "�Ϲ�"));
      product.add(new Fridge(5, "�繮�� �����", 1500, 150, "���� �ð�", 200, "�繮"));
      product.add(new Washer(6, "�뵹�� ��Ź��", 1000, 100, null, 100, "�뵹��"));
      product.add(new Washer(7, "�巳 ��Ź��", 1500, 150, null, 150, "�巳"));
      product.add(new Washer(8, "�巳���� ��Ź��", 2000, 200, "���", 200, "�巳����"));
   }
   
   @Override
   public String menu() {
      System.out.println("----------[MENU]----------");
      System.out.println("1)ȸ������ 2)�α���    3)�α׾ƿ�");
      System.out.println("4)��ǰ���� 5)���Ÿ�� 6)ȸ���˻�");
      System.out.println("7)ȸ������ ���� 0)����");
      System.out.println("--------------------------");
      System.out.print("���� : ");
      String select = sc.next();
      return select;
   }
   
   // ȸ������
   @Override
   public void join(ArrayList<Member> member, HashMap<String, String> loginId) {
      String id;
      if(loginId.get("id") != null) {
         System.out.println("[�α��� �߿��� �̿��Ͻ� �� �����ϴ�.]");
         return;
      }
      Calendar now = Calendar.getInstance();
      String date = now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+" "
                +now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);   
re:      while(true) {
         System.out.println("-------[JOIN(�ڷ�:0)]------");
         System.out.print("ID : ");
         id = sc.next();
         if(id.equals("0")) {
            return;
         } else if(id.length() < 3) {
            System.out.println("-----!3���� �̻� �Է��ϼ���!-----");
            continue;
         }
         for(int i=0;i<member.size();i++) {
            if(member.get(i).id.equals(id)) {
               System.out.println("---!�̹� �����ϴ� ���̵��Դϴ�.!---");
               continue re;
            }
         }
         break;
      }
      System.out.print("PW : ");
      String pw = sc.next();
      if(pw.equals("0")) {
         return;
      }
      System.out.print("NAME : ");
      String name = sc.next();
      if(name.equals("0")) {
         return;
      }
      
      member.add(new Member(id, pw, name, date));
      System.out.println("["+name+"�� ȸ������ ����!]");
   }
   
   // �α���
   @Override
   public void login(ArrayList<Member> member, HashMap<String, String> loginId) {
      if(loginId.get("id") != null) {
         System.out.println("[�̹� �α��� ���Դϴ�.]");
         return;
      }
      while(true) {
         System.out.println("------[LOGIN(�ڷ�:0)]------");
         System.out.print("ID : ");
         String id = sc.next();
         if(id.equals("0")) {
            return;
         }
         System.out.print("PW : ");
         String pw = sc.next();
         if(pw.equals("0")) {
            return;
         }
         for(int i=0;i<member.size();i++) {
            if(member.get(i).id.equals(id) && member.get(i).pw.equals(pw)) {
               loginId.put("id", member.get(i).id);
               System.out.println("["+loginId.get("id")+"�� �α���]");
               return;
            } else if(i+1 == member.size()) {
               System.out.println("[�������� �ʴ� ���̵��̰ų� ��й�ȣ�� Ʋ���ϴ�.]");
            }
         }         
      }
   }
   
   // �α׾ƿ�
   @Override
   public void logout(HashMap<String, String> loginId) {
      if(loginId.get("id") == null) {
         System.out.println("[�α��� ���� �ƴմϴ�.]");
      } else {
         loginId.clear();
         System.out.println("[�α׾ƿ� �Ǿ����ϴ�.]");
      }
   }
   
   // ��ǰ ����
   @Override
   public void productBuy(ArrayList<Member> member, ArrayList<Product> product, ArrayList<BuyList> buyList, HashMap<String, String> loginId) {
      if(loginId.get("id") == null) {
         System.out.println("[�α��� �� �̿� �����մϴ�]");
         login(member, loginId);
         if(loginId.get("id") == null) {
            return;
         }
      }
      Calendar now = Calendar.getInstance();
      String date = now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+" "
                +now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND);   

re:      while(true) {         
         System.out.println("-----[PRODUCT(�ڷ�:0)]-----");
         // ��ǰ ���
         for(int i=0;i<product.size();i++) {
            System.out.println(product.get(i).code + ") " + product.get(i).name + "[" + product.get(i).price + "��]");         
         }
         System.out.println("--------------------------");
         System.out.print("���� :");
         String selectCheck = sc.next();
         for(int i=0;i<selectCheck.length();i++) {
            if(selectCheck.charAt(i) < '0' || selectCheck.charAt(i) > '9') {
               System.out.println("[�߸��� �Է��Դϴ�.]");
               continue re;
            }
         }
         if(Integer.parseInt(selectCheck) > product.size()) {
            System.out.println("[�߸��� �Է��Դϴ�.]");
            continue re;
         }
         int select = Integer.parseInt(selectCheck)-1;
         if(select == -1) {
            return;
         }
         // ��ǰ ��
         System.out.println(product.get(select).name+"["+product.get(select).price+"��], ���� ����Ʈ["+product.get(select).point+"P]");
         if(product.get(select).option != null) {
            System.out.print("���["+product.get(select).option+"], ");
         }
         System.out.println(product.get(select).toString());
         // ��ǰ ����
         System.out.println("--------------------------");
         while(true) {
            System.out.print("�����Ͻðڽ��ϱ�?[Y/N] : ");
            String choice = sc.next();
            if(choice.equals("Y") || choice.equals("y")) {
               buyList.add(new BuyList(loginId.get("id"), product.get(select).name, product.get(select).price, date));
               for(int i=0;i<member.size();i++) {
                  if(loginId.get("id").equals(member.get(i).id)) {
                     member.get(i).point += product.get(select).point;
                  }
               }
               System.out.println("["+product.get(select).name+"��(��) �����Ͽ����ϴ�.]");
               return;
            } else if(choice.equals("N") || choice.equals("n")) {
               System.out.println("[���Ÿ� ����մϴ�.]");
               return;
            } else {
               System.out.println("[�߸��� �Է��Դϴ�.]");
            }         
         }
      }
   }
   
   // ���Ÿ��
   @Override
   public void buyList(ArrayList<Member> member, ArrayList<BuyList> buyList, HashMap<String, String> loginId) {
      int count = 0;
      int totalPrice = 0;
      
      if(loginId.get("id") == null) {
         System.out.println("[�α��� �� �̿� �����մϴ�]");
         login(member, loginId);
         if(loginId.get("id") == null) {
            return;
         }
      } else if(loginId.get("id").equals("admin")) {
         System.out.println("-------[BUYLIST]-------");
         for(int i=0;i<buyList.size();i++) {
            System.out.println(buyList.get(i).toString());
            totalPrice += buyList.get(i).price;
            count++;
         }
      } else {
         System.out.println("---------[BUYLIST]--------");
         for(int i=0;i<buyList.size();i++) {
            if(buyList.get(i).id.equals(loginId.get("id"))) {
               System.out.println(buyList.get(i).toString());
               totalPrice += buyList.get(i).price;
               count++;
            }
         }
      }
      if(count == 0) {
         System.out.println("[���� �̷��� �����ϴ�.]");
      } else {
         System.out.println("\n�Ѿ�["+totalPrice+"��]");
      }
   }
   
   // ȸ�� �˻�
   @Override
   public void searchMember(ArrayList<Member> member) {
      while(true) {
         int count = 0;
         System.out.println("-----[SEARCH(����:0)]-----");
         System.out.print("�̸� �˻� : ");
         String name = sc.next();
         if(name.equals("0")) {
            break;
         }
         for(int i=0;i<member.size();i++) {
            if(member.get(i).name.contains(name)) {
               System.out.println("�̸� : " + member.get(i).name+", ���̵� : " + member.get(i).id);
               count++;
            }
         }
         if(count == 0) {
            System.out.println("[Ű���尡 ���Ե� �̸��� �����ϴ�.]");
         }         
      }
   }
   
   // ȸ�� ����/ȸ�� ����Ʈ
   @Override
   public void memberList(ArrayList<Member> member, HashMap<String, String> loginId) {
      if(loginId.get("id") == null) {
         System.out.println("[�α��� �� �̿� �����մϴ�]");
         return;
      } else if(loginId.get("id").equals("admin")) {
         for(int i=0;i<member.size();i++) {
            System.out.println(member.get(i).toString());
         }
      } else {
         for(int i=0;i<member.size();i++) {
            if(loginId.get("id").equals(member.get(i).id)) {
               System.out.println(member.get(i).toString());
            }
         }
      }
   }
}