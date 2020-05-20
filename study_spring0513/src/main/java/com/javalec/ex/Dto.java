package com.javalec.ex;

public class Dto {
	
	String name;
	int number;
	Calcuation cal;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setCal(Calcuation cal) {
		this.cal = cal;
	}
	public void result_Dto() {
		cal.spring(number, name);
		
		
	}
	

}
