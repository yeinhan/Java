package silsub4.model.vo;
//객체 실습문제4
public class Student {
	
	private int grade=2;
	private int classroom=4;
	private String name="한예인";
	private double  height=200;
	private char gender='F';
	
	public Student() {}
	
	
	public int getGrade() {
		return grade; 
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void segClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String info() {
		return "학년:"+grade+" 반:"+classroom+" 이름:"+name+" 키:"+height+" 성별:"+gender;
	}
	
	
}
