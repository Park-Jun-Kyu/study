
public class Ex0214_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ~ 1427548419
		// 1.10���� �迭�� �����
		// 2. �� �������� 0~9������ ���ڸ� �ִ´�
		// 3. ù��° �ι�° ��, �ι�° ����° ��
		// 4. �������� üũ
		// 5. ���

		int[] arr1 = new int[10];
		int temp = 0; // �ӽ����庯��
		boolean check = false; // �ڸ����� üũ����
		// �迭�� 0~9

		System.out.println("�������ļ�");
		
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

		// ù��°, �ι�° ���� �ڸ� �ٲ�
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
			
			System.out.print((i+1)+"��° ���� ����");
			for(i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
			
			
			if (check==false) {
				System.out.println("��� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
			
		}//for1
		//����ϴ� ���
		System.out.println("�������ļ�");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
	}//

}//
