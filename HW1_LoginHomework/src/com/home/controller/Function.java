package com.home.controller;


import java.util.Scanner;

public class Function {

	Scanner sc = new Scanner(System.in);

	
	public void calculator() {	//간단 계산기
		System.out.println("간단 계산기");
		int sum=0;
		
		System.out.print("첫번째 정수:");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 정수:");
		int num2 = sc.nextInt();
		System.out.print("연산문자:");
		String str = sc.next();
		char ch= str.charAt(0);
		
		switch(ch) {
		case '+':
			sum = num1 + num2;
			System.out.printf(num1+"+"+num2+"="+sum);
			break;
		case '-': 
			sum = num1-num2;
			System.out.println(num1+"-"+num2+"="+sum);
			break;
		case '*':
			sum = num1*num2;
			System.out.println(num1+"*"+num2+"="+sum);
			break;
		case '/':
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				sum=0;
			}else{
				sum = num1/num2;
				System.out.println(num1+"/"+num2+"="+sum);
			}
			break;
		}
		System.out.println();
	}
	public void totalCalculator() {	//작은수에서 큰ㅅ까지 합계구하기
		System.out.println("작은 수에서 큰 수까지 합계구하기");

		int min,max;
		int sum=0;
		
		System.out.println("두개의 정수를 입력하세요.");
		System.out.print("정수1:");
		int num1 = sc.nextInt();
		System.out.print("정수2:");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}else {
			max=num2;
			min=num1;
		}
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
		System.out.printf("%d~%d까지의 합:%d",min,max,sum);
		System.out.println();
	}
	
	public void profile() {	//신상정보 확인하기
		System.out.println("입력된 신상정보 확인하기");
		String name="한예인";
		int age=200;
		String gender="여자";
		String character="고집불통";
		
		System.out.printf("이름:%s \n나이:%d \n성별:%s \n성격:%s",name,age,gender,character);

		System.out.println();
	}
	public void sungjuk() {	//학생정보 확인하기
		String str2;
		
		System.out.println("신상정보 확인하기");
		
		System.out.print("이름:");
		String name=sc.next();

		System.out.print("학년:");
		int grade = sc.nextInt();

		System.out.print("반:");
		int cla= sc.nextInt();
		
		System.out.print("성별(M/F):");
		String str = sc.next();
		char gender = str.charAt(0);
		if(gender=='M') {
			str2="남학생";
		}else {
			str2="여학생";
		}

		System.out.print("번호:");
		int num=sc.nextInt();

		System.out.print("성적(소수점 아래로 둘재자리):");
		double grades=sc.nextDouble();
		char hakjum=' ';
		
		if(grades>=90) {
			hakjum='A';
		}else if(grades>=80 && grades<90){
			hakjum='B';
		}else if(grades>=70 && grades<80) {
			hakjum='C';
		}else if(grades>60 && grade<70) {
			hakjum='D';
		}else if(grades<60) {
			hakjum='F';
		}
	

		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c학점입니다.",grade,cla,num,str2,name,grades,hakjum);

		System.out.println();
	}
	
	public void printRandomNumber() {	//별과 숫자 출력하기
		System.out.println("입력된 정수만큼 별과 숫자 출력하기");
		System.out.print("정수 하나 입력:");
		int num=sc.nextInt();
		
		if(num>=0) {
			for(int i=0; i<=num; i++) {
				for(int j=0; j<=i; j++) {
					if(i==j) {
						System.out.print(i);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}

		System.out.println();
	}
	
	public void sumRandomNumber() {	//난수까지의 합계 구하기
		int r = (int)(Math.random()*100)+1;
		int sum=0;
		
		for(int i=1; i<=r; i++) {
			sum += i;
		}
		System.out.printf("발생된 난수:%d\n",r);
		System.out.printf("%d까지의 합계:%d",r,sum);
		
		System.out.println();
		
	}
	public void continueGugudan() {	//구구단
		System.out.println("구구단");
		System.out.print("정수:");
		int num=sc.nextInt();
		
		if(num>0) {
			for(int i=num; i<=num; i++) {
				for(int j=1; j<=9; j++) {
					if(j%num==0)
						continue;
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println();
	}
	public void shutNumber() {	//주사위 숫자 알아맞추기 게임
		System.out.println("주사위 합 맞추기");
		
		int anw;
		int r1 = (int)(Math.random()*6)+1;
		int r2 = (int)(Math.random()*6)+1;
		
		int result= r1+r2;
		String str=" ";
		
		do {
			System.out.print("랜덤 수 를 맞쳐 보세요:");
			anw = sc.nextInt();
			if(anw==result) {
				System.out.printf("정답입니다. 첫번쨰 주사위:%d 두번쨰 주사위:%d 합:%d",r1,r2,result);
				break;
			}else {
				
				System.out.print("틀렸습니다. 계속하시겠습니다?(y/n):");
				str= sc.next();
				if(str.equals("N") || str.equals("n"))
					break;
				
			}
		}while(str.equals("Y") || str.equals("y"));
		
		System.out.println("끝");
		System.out.println();
	}

}
