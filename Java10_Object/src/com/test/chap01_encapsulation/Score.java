package com.test.chap01_encapsulation;

public class Score {
	//필드
	private String name="한예인";
	private int kor=90;
	private int eng = 84;
	private int mat=97;
	
	//생성자 (객체를 생성하기 위한 메소드)
	public Score() {}
	
	//총합을 구하여 출력하는 메소드
	public void printSum() {
		int sum=0;
		sum = kor+eng+mat;
		System.out.println("총합은: "+ sum);
	}
	
	//평균을 구하여 출력하는 메소드
	public void printAvg() {
		int avg =0;
		avg=(kor+eng+mat)/3;
		System.out.println("평균은:"+avg);
	}
	
	//제일 높은 점수를 받은 과목을 찾는 메소드
	public void printMax() {
		int max = 0;
		
		if(kor>eng && kor>mat) {
			max=kor;
			System.out.print("국어가 제일 높은 점수  ");
		}else if(eng>kor && eng>mat) {
			max=eng;
			System.out.print("영어가 제일 높은 점수  ");
		}else if(mat>kor && mat>eng){
			max=mat;
			System.out.print("수학이 제일 높은 점수  ");
		}
		System.out.println(max);
	}
	//제일 낮은 점수를 받은 과목을 찾는 메소드
	public void printmin() {
		int min=0;
		
		if(kor<eng && kor<mat) {
			min=kor;
			System.out.print("국어가 제일 낮은 점수  ");
		}else if(eng<kor && eng<mat) {
			min=eng;
			System.out.print("영어가 제일 낮은 점수  ");
		}else if(mat<kor && mat<eng){
			min=mat;
			System.out.print("수학이 제일 낮은 점수  ");
		}
		System.out.println(min);
	}
	//필드 값을 확인 할 수 있는 information() 메소드
	public void information() {
		System.out.printf("이름:%s--국어점수:%d 영어점수:%d 수학점수:%d\n",name,kor,eng,mat);

	}
	
}
