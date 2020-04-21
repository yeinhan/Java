package com.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.part01_list.arrayListSort.model.Score;
import com.collection.part01_list.arrayListSort.model.ScoreSorting;

public class ScoreManager {
	public void scoreSort() {
		List list = new ArrayList();
		
	
		list.add(new Score("한예인", 99));	//Score객체 생성
		list.add(new Score("둘예인", 79));
		list.add(new Score("삼예인", 85));
		
		list.add(new Score("김유신", 72));
		list.add(new Score("강철수", 33));
		list.add(new Score("남진", 45));
//		list.add("끄읕");
		
		System.out.println("list: "+list);
		
		/*Comparable*/
//		Collections.sort(list);
		list.sort(null);
		System.out.println("listSort: "+list);
		
		/*Comparator*/
//		Collections.sort(list, new ScoreSorting());
		list.sort(new ScoreSorting());   	//new ScoreSorting()기준으로 정렬해주겠다.
		System.out.println("listSorting: "+list);
		
	}
}
