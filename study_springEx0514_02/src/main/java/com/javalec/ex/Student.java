package com.javalec.ex;

import java.util.ArrayList;

public class Student {

	
	private int stu_num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private ArrayList<String>hobby = new ArrayList<String>();
	private int total ;
	private double avg ;
	
	
	public Student() {
		
	}
	
	public Student(int stu_num,String name,int kor,int eng,int math,ArrayList<String>hobby) {
		this.stu_num = stu_num;
		this.name = name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total = kor+eng+math;
		this.avg = (kor+eng+math)/3.0;
		this.hobby = hobby;
		
	}

	public void Stu_print() {
		System.out.println(stu_num);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(avg);
		System.out.println(hobby);
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

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
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
