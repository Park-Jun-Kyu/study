
final class Stu01 {
//		private static Stu01 s = new Stu01();

	private static Stu01 s = new Stu01();
	
	private int hak_num;
	private String name;
	private int kor;
	
	
		
	private Stu01() {
		
	}
	
	public static Stu01 getInstance() {
		if(s==null) {
			s = new Stu01();
		}
		return s;
	}
	
	
	
	
	

	public int getKor() {
		return kor;
	}




	public int getHak_num() {
		return hak_num;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		return "학번 :" + hak_num + "/이름 : " + name+"/국어점수 : " + kor;
	}
}
