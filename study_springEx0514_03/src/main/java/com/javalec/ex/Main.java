package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appTML.xml");
		StuInfo stuInfo = ctx.getBean("stuInfo",StuInfo.class);
		StuScore stuscore = ctx.getBean("stuScore3",StuScore.class);
	
		ArrayList<Student>list = stuInfo.getList();
		
		
		for(int i=0; i<list.size(); i++) {
			Student stu = list.get(i);
			if(stuscore.stu_num == stu.getStu_num())
			System.out.print("<< "+stu.getName()+"학생 성적 출력>>");
			System.out.print(stu.getStu_num()+" ");
			System.out.print(stu.getName()+" ");
			System.out.print(stu.getMajor()+" ");
			System.out.print(stu.getAddress()+" ");
			System.out.print(stuscore.kor+" ");
			System.out.print(stuscore.eng+" ");
			System.out.print(stuscore.math+" ");
			System.out.print(stuscore.total+" ");
			System.out.print(stuscore.avg+" ");
			System.out.println();
			
			
		}
		
		
	}

}
