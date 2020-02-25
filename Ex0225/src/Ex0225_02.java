
public class Ex0225_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student [] stu = new Student[3];
//		String[] name = {"홍길동","이순신","김유신"};
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

		// lotto라는 45개 배열을 만들어서 1~45까지 숫자를 넣어보셈

//		int lotto[] = new int[45];
//
//		for (int i = 0; i < lotto.length; i++) {
//
//			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
//		}
			
			//lotto 객체를 만들어서 객체에서 1~45까지 숫자가 들어가서
		// 만들어질수 있도록 해보세요
		//선언만 하면 1~45까지 들어가있는 lotto가 생성될수 있도록
			
			Lotto lotto = new Lotto();

			for(int i=0; i<45; i++) {
				
				System.out.println(lotto.ball[i]);
			}
			
			
			
			
			

	}

}
