package com.test.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="한예인,19,서울 서초,남자";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
