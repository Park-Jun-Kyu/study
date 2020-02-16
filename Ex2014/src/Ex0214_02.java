
public class Ex0214_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정렬 ~ 1427548419
		// 1.10개의 배열을 만든다
		// 2. 각 랜덤으로 0~9까지의 숫자를 넣는다
		// 3. 첫번째 두번째 비교, 두번째 세번째 비교
		// 4. 연속으로 체크
		// 5. 출력

		int[] arr1 = new int[10];
		int temp = 0; // 임시저장변수
		boolean check = false; // 자리변경 체크변수
		// 배열에 0~9

		System.out.println("최종정렬수");
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
			System.out.print(arr1[i]+" ");
		}
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("");
		
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i]+" ");
//		}

		// 첫번째, 두번째 비교후 자리 바꿈
		for (int i = 0; i < arr1.length; i++) {
			check = false;
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				if (arr1[j] < arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
					check = true;
				}//if
			}//for2
			
			System.out.print((i+1)+"번째 정렬 진행");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			
			
			if (check==false) {
				System.out.println("모든 정렬이 완료되었습니다.");
				break;
			}
			
		}//for1
		//출력하는 방법
		System.out.println("최종정렬수");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
	}//

}//
