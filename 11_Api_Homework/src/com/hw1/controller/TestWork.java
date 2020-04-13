package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
	public TestWork()	{}
	public StringBuilder afterToken(String str) {
		
		System.out.println("토큰 처리 전 글자:"+str);
		System.out.println("토큰 처리 전 갯수:"+str.length());
		
		StringTokenizer st = new StringTokenizer(str, " ");
		char [] ch = new char[st.countTokens()];
		
		System.out.print("토큰 처리 후 글자:");
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken());
		}
		System.out.println();
		
		System.out.println("토큰 처리 후 갯수:"+ch.length);
		return null;
		
	}
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력:");
		String str = sc.next();
		
		str = str.substring(0,1).toUpperCase()+str.substring(1);
		
		System.out.println("첫 글자 대문자:"+str);
		
		System.out.print("찾을 문자 하나를 입력하세요:");
		char ch= sc.next().charAt(0);
		int n=0;
		
		for(int i=0; i<str.length(); i++) {
			char f = str.charAt(i);
			if(ch==f)
			n=n+1;
		}
		
		System.out.println(ch+" 문자가 들어간 갯수:"+n);
	}
}
