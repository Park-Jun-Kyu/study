import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영어단어 맞추기 게임
		//영어 - 한글설명
		//영어,한글 데이터 입력 - 미리 입력만듬.
		//영어 출력후 한글 입력받음
		//한글이 맞는지? 확인
		//결과 출력
		//다시 문제 출력
		
		
		// 데이터 입력 words [3][2]
		String[][] words = {
				{"chair","의자"},{"computer","컴퓨터"},{"array","배열"},
		};
		String in_str = "";
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i][0] + "뜻은 무엇일까요?");
			in_str = scan.nextLine();
			//정답비교
			if(words[i][1].equals(in_str)) {
				System.out.println("정답입니다. 다음문제 도전>>");
			}else {
				if(count<3) {
					System.out.println((count+1)+"번째 오답입니다 . 다시도전!!");
					count++; // 횟수 추가
					i--; // 현재문제 다시 출제
					continue;
				}
					
				System.out.println("오답입니다." + "정답은?"+words[i][1]);
				count = 0; // 초기화
				}

				
				
			}
		
			
		
		
		
	}//

}//
