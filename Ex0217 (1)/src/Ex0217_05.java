import java.util.Scanner;

public class Ex0217_05 {
	//�޼ҵ�
	//���� ���𰡴�?
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� ��,��,�ʸ� scan���� �Է¹޾� ������ �غ�����
		//10�� ������ �غ�����.
		


//		int [][] score = new int [5][4];
//		String [] name = new String [5];
//		double [] avg = new double[10];
		
		
		//5���� �л���ü ����
		Student[] stu = new Student[3];
		
	
		
		String [] subject = {"�̸�","����","����","����","�հ�","���"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student();
			System.out.println("�̸� �Է��ϼ�");
			stu[i].name=scan.nextLine();
			System.out.println("���������� �Է����ּ���");
			stu[i].kor = scan.nextInt();
			System.out.println("���������� �Է����ּ���");
			stu[i].eng = scan.nextInt();
			System.out.println("���������� �Է����ּ���");
			stu[i].math = scan.nextInt();
			scan.nextLine();
//			stu[i].total = stu[i].kor+stu[i].eng+stu[i].math;
			stu[i].total();
			stu[i].avg();
		}
////			System.out.println("�л��̸��Է�");
////			name[i] = scan.next();
//			for(int j=0; j<score[i].length-1; j++) {
//				System.out.println(subject[j+1]+"�����Է�");
//				score[i][j] = scan.nextInt();
//				score[i][score[i].length-1] += score[i][j];
//				
//			}
//			avg[i] = score[i][score[i].length-1] /3;
//		}
		

		
		
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<stu.length; i++) {
			System.out.print(stu[i].name +"\t");
			System.out.print(stu[i].kor +"\t");
			System.out.print(stu[i].eng +"\t");
			System.out.print(stu[i].math +"\t");
			System.out.print(stu[i].total +"\t");
			System.out.print(stu[i].avg +"\t");
//			for(int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.print(avg[i]+"\t");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		Tv2 tt1 = new Tv2();
//		
////		t1.channel=10;
////		System.out.println();
////		t2.channel=10;
//		
//		int a1 = 10;
//		int a2 = 0;
//		
//		t2 = t1;
//		
//		
//		
//		t1.channel = 10;
//		
//		System.out.println(t2.channel);
//		
		//10.0
		
		
//		Tv2 t = new Tv2();
		
		
//		
//		t.volume=10;
//		t.volumeUp();
//		t.volumeDown();
//		System.out.println(t.volume);
		
		
		
		
		
//		Tv t = new Tv(); 
//		t.channel=7;
//		t.channelup();
//		t.channelDown();
		
//		System.out.println(t.power);
//		System.out.println(t.channel);
		

//		Student stu1 = new Student();
//		stu1.name= "ȫ�浿";
//		stu1.kor = 100;
//		stu1.eng = 100;
//		stu1.math= 90;
//		stu1.total = stu1.kor+stu1.eng+stu1.math;
//		stu1.avg=stu1.total/3;
//		stu1.rank = 1;
//		
//		System.out.println(stu1.name+" " + stu1.kor+" "+stu1.eng +" " + stu1.math+" ");
		
	}

}
