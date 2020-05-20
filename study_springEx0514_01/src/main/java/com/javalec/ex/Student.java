package com.javalec.ex;

import java.util.ArrayList;

public class Student {

	
	int stu_num;
	String name;
	int kor;
	int eng;
	int math;
	ArrayList<String>hobby = new ArrayList<String>();
	int total;
	double avg ;
	
	
	public Student() {
		
	}
	
	public Student(int stu_num,String name,int kor,int eng,int math,ArrayList<String>hobby) {
		this.stu_num = stu_num;
		this.name = name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		total = kor+eng+math;
		avg = (kor+eng+math)/3;
		this.hobby = hobby;
		
	}

	
	
	
	
	
	
	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
	
	
}
