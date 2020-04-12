package com.poly.test.test06;

public abstract class AreaImpl implements Area{
	private String res;
	
	@Override
	public void print() {
		System.out.println(Area.print+res);
	}

	@Override
	public abstract void make();	//추상메소드  한다음에 AreaImpl 추상클래스로 만들어

	
	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	
}
