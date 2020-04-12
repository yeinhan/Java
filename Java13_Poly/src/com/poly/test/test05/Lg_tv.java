package com.poly.test.test05;

public class Lg_tv implements Tv{
	private int vol;
	
	public Lg_tv() {
		System.out.println("lg tv가 켜졌습니다.");
	}

	
	@Override
	public int volumUp() { 
		setVol(getVol()+1);
		System.out.println("lg +볼륨:"+getVol());
		return getVol();
	}
	@Override
	public int volumDown() {
		setVol(getVol()-1);
		System.out.println("lg -볼륨:"+getVol());
		return getVol();
	}

	public void tvClosed() {
		System.out.println("lg Tv가 꺼졌습니다.");
	}

	public int getVol() {
		return vol;
	}


	public void setVol(int vol) {
		this.vol = vol;
	}
}
