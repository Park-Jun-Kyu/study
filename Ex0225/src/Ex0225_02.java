
public class Ex0225_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student [] stu = new Student[3];
//		String[] name = {"ȫ�浿","�̼���","������"};
//		int[] grade = {3,4,1};
//		
//		stu[0] = new Student(name[0],grade[0]);
//		stu[1] = new Student(name[1],grade[1]);
//		stu[2] = new Student(name[2],grade[2]);
//		
//		for(int i=0; i<stu.length; i++) {
////			for(int j=0; j<grade.length; j++) {
//				
//				stu[i] = new Student(name[i],grade[i]);

		// lotto��� 45�� �迭�� ���� 1~45���� ���ڸ� �־��

//		int lotto[] = new int[45];
//
//		for (int i = 0; i < lotto.length; i++) {
//
//			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
//		}
			
			//lotto ��ü�� ���� ��ü���� 1~45���� ���ڰ� ����
		// ��������� �ֵ��� �غ�����
		//���� �ϸ� 1~45���� ���ִ� lotto�� �����ɼ� �ֵ���
			
			Lotto lotto = new Lotto();

			for(int i=0; i<45; i++) {
				
				System.out.println(lotto.ball[i]);
			}
			
			
			
			
			

	}

}
