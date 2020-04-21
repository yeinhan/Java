package com.collection.part02_set.controller;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
	//LinkedHashSet
	//저장순서 유지 기능이 추가
	public void testLinkedHashSet() {
		LinkedHashSet lhset = new LinkedHashSet();
		lhset.add("java");
		lhset.add(123);
		lhset.add(45.12);
		lhset.add(new String("java"));
		lhset.add(new Integer(123));
		lhset.add(new Double(45.12));
		
		System.out.println("lhset: "+lhset);
		
		LinkedHashSet lhset2 = new LinkedHashSet();
		lhset2.add("java");
		lhset2.add("oracle");
		lhset2.add("HTML");
		lhset2.add("CSS");
		System.out.println("lhset2: "+lhset2);
		
		//만들어진 LinkedHashSet을 가지고 TreeSet 객체를 생성하면 자동으로 오름차순 정렬
		TreeSet tset = new TreeSet(lhset2);	//같은 타입의 객체가 들어가있어야함
		System.out.println("tset: "+tset);
	}
	
}
