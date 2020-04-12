package com.test.chap04_constructor.model;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date EnrollDate;
	
	//생성자의 사용목적
	//1. 객체를 생성해 주기 위한 목적
	//2. 매개변수로 전달받은 값으로 필드를 초기화할 목적
	
	//생성자 사용시 주의사항
	//1.반드시 클래스명과 동일해야한다(대/소문자 구분)
	//2.리턴형이 존재하지 않는다.(void,int,char,string, ...)
	//기본생성자 -> 필드의 초기화 역할은 수행하지 못하고 객체 생성 할때 만 사용
	public User() {}	//오버로딩
	
	//매개변수 있는 생성자 -> 객체 생성과 필드를 초기화 하는 두가지 목적으로 사용
	//같은 이름의 생성자 혹은 메소드를 사용하려고 하는 경우 오버로딩을 사용해야 한다.
	public User(String userId, String userPwd, String userName) {	//오버로딩
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//this. 메소드 내에 숨겨진 채 존재하는 레퍼런스 변수, 할당된 객체 자신을 의미
	}
	
	public User(String userId, String userPwd, String userName,Date EnrollDate) {	//오버로딩
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		
		//this() - 중복되는 동일한 초기화 하는 내용의 생성자가 존재ㅐ하는 경우 this()를 사용할 수 있다.
		//반드시 맨 윗줄에 있어야 한다.
		this(userId,userPwd,userName);	//셍성자가 위와 동일할 경우 이렇게 불러올 수 있음, 위의 생성자를 통해 초기화 후 추가로 초기화
		
		this.EnrollDate = EnrollDate;
		//this. 메소드 내에 숨겨진 채 존재하는 레퍼런스 변수, 할당된 객체 자신을 의미
	}
	
	
	//getter setter 작성
	public String getUserId() {
		return userId;
		
	}
	public void setUserId(String userId) {
		this.userId/*이 객체의 userId*/= userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getEnrollDate() {
		return EnrollDate;
	}
	public void setEnrollDate(Date EnrollDate) {
		this.EnrollDate = EnrollDate;
	}
	
	//출력용
	public void info() {
		System.out.println(userName +", "+ userPwd+ ", " + userName+ ", "+EnrollDate);
	}
	
}
