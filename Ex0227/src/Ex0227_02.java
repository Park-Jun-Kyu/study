
public class Ex0227_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		
		
		
		Caption_Tv c = new Caption_Tv();
		Caption_Tv c2 = new Caption_Tv();
		Tv t2 = new Caption_Tv();   
		
		
		t2 = (Tv)c2;        
		c2 = (Caption_Tv)t2;
		
		
		
//		Caption_Tv c2 = new Tv();
		
//		t2.caption();
		
//		t2.power();
//		t2.channel = 7;
		
		//������ :����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �ٷ� �� �ִ� ���� ������
		
		
		
		
		
		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("Tv ��ü ä�� : " +t.channel);
		
		
		c.power();
		c.channel=11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text="�ܿ�ձ� 2 ��ȭ �ڸ��� �߰� �Ǿ����ϴ�";
		c.caption();
		System.out.println("Caption_Tv ��ü ä��" + c.channel);
	}

}
