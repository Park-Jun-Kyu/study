import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//16������ 2������ ��ȯ
		
		//���� �ҹ��� �޾Ƽ� �����빮�� ��ȯ�ϴ� ���α׷��� ��������
		
		String [] binary = {
				"0000","0001","0010","0011","0100","0101","0110","0111",
				"1000","1001","1010","1011","1100","1101","1110","1111"
		};
		
		
		
while(true) {
	
		
		Scanner scan = new Scanner(System.in);
		
		String in_str = "";
		String result="";
		String result1="";
		int len = 0;
		char ch = ' ';
		
	
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		
		in_str=scan.next();
		len=in_str.length();
		
		
		for(int i=0; i<in_str.length(); i++) {
			 ch = in_str.charAt(i);
			if(ch>='a' && ch<='z') { //�ҹ��� ->�빮��
				result += (char)(ch-32)+"";
			}else {
				result += (char)(ch+32)+"";
			}
			
		}
		
		
//		in_str.charAt(i);
		
//		for(int i=0; i<in_str.length(); i++) {
//			
//			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') { //�ҹ��� ->�빮��
//				ch = (char)(ch-32);
//			}else {
//				ch = (char)(ch+32);
//			}
//			
//		}
 
//		result = in_str.toLowerCase(); //�ҹ��ں�ȯ
//		result1 = in_str.toUpperCase(); // �빮�ں�ȯ
//		ch = in_str.charAt(0);
		
		
 
		
 
		
		
		System.out.println(""+result);
//		System.out.println(""+result1);
//		System.out.println("���ڿ� ���� : "+len);
//		System.out.println(ch);
}
		
//		char [] hex = {'7','c','a','f','e'}; //a=10.b=11,c=12
//		String result= "";
//		String [] binary = {
//				"0000","0001","0010","0011","0100","0101","0110","0111",
//				"1000","1001","1010","1011","1100","1101","1110","1111"
//		};
//		
//		for(int i=0; i<hex.length; i++) {
//			if(hex[i]>='0' && hex[i]<='9') {
//				result +=  binary[hex[i]-'0'];
//			}else {
//				if(hex[i]>='A' && hex[i]<='Z') {
//					hex[i] = (char)(hex[i]+32);
//				}
//				result +=  binary[hex[i]-'a'+10];//99-97+10=12
//			}
//			
//		}
//		
//		System.out.println("hex : " + new String(hex));
//		System.out.println("result : " + result);
		
	}//

}//
