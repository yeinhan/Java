package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

//객체배열 실습문제1
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu[] = {
				new Student(3,1,1,"홍길동"),
				new Student(4,3,2,"유관순"),
				new Student(2,7,5,"윤봉길")
		};
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].info());
		}
		
	}

}
