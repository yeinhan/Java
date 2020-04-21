package com.collection.part01_list.arrayListSort.model;

public class Score implements Comparable {
	private String name;
	private int score;
	//생성자(기본, 매개번수)
	
	public Score()	{}
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return " [name=" + name + ", score=" +score +"] ";
	}
	@Override
	public int compareTo(Object o) {
		//name으로 정렬
		String otherName = ((Score)o).getName();	
		
		return name.compareTo(otherName);	//비교해서 뺀 수가 음수이면 바구지 않고 양수이면 바꿈
//		return -name.compareTo(otherName);	//내림차순
		
	}
}
