package com.test.io.part04_objectStream;

public class Member implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double point;

	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	//
	// 생성자(기본, 매개변수), getter&setter
	// hashcode&equalss&toString 오버라이딩

	public Member() {
		super();
	}

	public Member(String userId, String userPwd, String userName, String email, int age, char gender) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "userId:" + userId + " userPwd:" + userPwd + " userName:" + userName + " email:" + email + " 나이:" + age
				+ " 성별:" + gender;
	}

}
