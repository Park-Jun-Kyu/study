import java.util.Scanner;

public class Ex0223_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] stu = new Student[10];
		int kor = 0, eng = 0, math = 0;
		int num = 0;
		String name = "";

		Scanner scan = new Scanner(System.in);


		while(true) {
			System.out.println("1, 2,3,4");
			num = scan.nextInt();
			loop:
		switch (num) {
		case 1:
			
			for(int i=0; i<stu.length; i++) {
				System.out.println("�л��̸��� �Է��ϼ��� // ����ȭ�� 99");
				name = scan.next();
				if(name.equals("99")) {
					break loop;
				}
				System.out.println("���������� �Է��ϼ���");
				kor = scan.nextInt();
				System.out.println("���������� �Է��ϼ���");
				eng = scan.nextInt();
				System.out.println("���������� �Է��ϼ���");
				math = scan.nextInt();
				stu[i] = new Student(name ,  kor ,  eng , math);
				System.out.println(stu[i].name +" / " +  stu[i].sum + " / " +  stu[i].avg);
				
			}
			
			break;

		case 2:
			
			for(int i=0; i<stu.length; i++) {
				System.out.println("�л��̸��� �Է��ϼ��� // ����ȭ�� 99");
				name = scan.next();
				if(name.equals("99")) {
					break loop;
				}
				if(stu[i].name.equals(name)) {
					
				System.out.println("���������� �Է��ϼ���");
				stu[i].kor = scan.nextInt();
				System.out.println("���������� �Է��ϼ���");
				stu[i].eng = scan.nextInt();
				System.out.println("���������� �Է��ϼ���");
				stu[i].math = scan.nextInt();
				break;
				}
			}
			

			break;
		case 3:

			break;

		default:
			break;
		}

		}
	}

}
