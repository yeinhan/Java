package com.collection.part01_list.arrayListSort.model;

import java.util.Comparator;

public class ScoreSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//점수로 기본정렬
		
		int other1 = ((Score)o1).getScore();
		int other2 = ((Score)o2).getScore();
		if(other1>other2) {
			return 1;	//순서 바꾸겠다.
		}else {
			return -1;	
		}
	}

		
}
