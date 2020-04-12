package com.poly.test.test05;

public class Samsung_tv implements Tv{
	private int vol;
	public Samsung_tv() {
		System.out.println("samsung tv가 켜졌습니다.");
	}

	@Override
	public int volumUp() {
		setVol(getVol()+3);
		System.out.println("samsung +볼륨:"+getVol());
		return getVol();
	}

	@Override
	public int volumDown() {
		if(vol<3) {
			System.out.println("samsumg 볼륨이 3미만입니다.");
		}else {
			setVol(getVol()-3);
			System.out.println("samsung -볼륨:"+getVol());
		}
		return getVol();
	}
	
	public void tvClosed() {
		System.out.println("samsung Tv가 꺼졌습니다.");
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}


}
