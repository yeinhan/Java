package com.collection.part04_Generics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MTest {
	public static void main(String[] args) {
		TestGenerics tg = new TestGenerics();
//		tg.testGenerics1();
//		tg.testGenerics2();
//		tg.testGenerics3();
//		tg.testGenerics4();
		
		//1~45사이의 정수를 중복되지 않게, 난수로 6개 발생시켜 출력
		Set<Integer> set = new HashSet<>();	//중복안되는 Set
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);

	}
	
}
