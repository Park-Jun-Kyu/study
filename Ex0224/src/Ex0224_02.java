import java.util.Scanner;

public class Ex0224_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �л� - ȫ�浿 100,100,90 / �̼��� 80,90,70
		
		Student[] stu = new Student[2];
		int [] score = new int[3]; // �����޴¹迭
		int kor =0 , eng =0, math = 0;
		Scanner scan = new Scanner(System.in);
		int num =0;
		int stu_count = 0;
		String name = "";
		while(true) {
			System.out.println("1,2,3,4");
			num = scan.nextInt();
			switch (num) {
			case 1:
				
				
				score_write(stu,score,stu_count);
				
				
//				for(int i=0; i<stu.length; i++ ) {
//					System.out.println("�̸��Է�");
//					name = scan.next();
//					for(int j=0; j<3; j++) {
//						System.out.println("���� �Է��ϼ���");
//						score[j] = scan.nextInt();
//						
//					}
//					stu_count++;
//					stu[i] = new Student(name,score[0],score[0],score[0]);
//				}
//				System.out.println("�Էµ� �л�" + stu_count);
//				System.out.println(stu[0].name+" / " + stu[0].total+ " / " + stu[0].avg);
//				System.out.println(stu[1].name+" / " + stu[1].total+ " / " + stu[1].avg);
				
				
				
				
				
//				score_write(stu,score);
//				System.out.println("��������");
//				kor = scan.nextInt();
//				System.out.println("��������");
//				eng = scan.nextInt();
//				System.out.println("��������");
//				math = scan.nextInt();
//				Student stu3 = new Student();
//				System.out.println(stu3.name + "//" + stu3.kor + "//" + stu3.eng + "//" + stu3.math);
//				Student stu1 = new Student("test",10,10,20);
//				System.out.println(stu1.name + "//" + stu1.kor + "//" + stu1.eng + "//" + stu1.math);
//				Student stu[i] = new Student(name , kor , eng , math);
//				System.out.println(stu[i].name + " / " + stu[i].kor + " / " + stu[i].eng + " / " + stu[i].math);
				
				
				
				break;
			case 2:
				
				break;

			
			}
			
		}
	
			
		
		
		
		
	}
	
	static int score_write(Student [] stu , int [] score , int stu_count) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stu.length; i++ ) {
			System.out.println("�̸��Է�");
			String name = scan.next();
			for(int j=0; j<3; j++) {
				System.out.println("���� �Է��ϼ���");
				score[j] = scan.nextInt();
				
			}
			stu_count++;
			stu[i] = new Student(name,score[0],score[0],score[0]);
		}
		System.out.println("�Էµ� �л�" + stu_count+"��");
		System.out.println(stu[0].name+" / " + stu[0].total+ " / " + stu[0].avg);
		System.out.println(stu[1].name+" / " + stu[1].total+ " / " + stu[1].avg);
		
		
		return stu_count;
	}
	
	
	

}
