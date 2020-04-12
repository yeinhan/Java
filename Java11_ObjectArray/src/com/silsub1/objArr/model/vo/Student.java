package com.silsub1.objArr.model.vo;

//객체배열 실습문제1
public class Student {
	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	public Student() {}
	
	public Student(int grade, int classroom, int number, String name) {
		this.grade = grade;
		this.classroom= classroom;
		this.number = number;
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String info() {
		return grade+"학년 "+classroom+"반 "+number+"번 "+name;
	}
	
}
