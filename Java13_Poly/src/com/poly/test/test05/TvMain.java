package com.poly.test.test05;

public class TvMain {
	public static void main(String[] args) {
		Lg_tv lg = new Lg_tv();
		
		lg.setVol(1);
		System.out.println("lg 볼륨:"+lg.getVol());
		
		lg.volumUp();
		lg.volumUp();
		lg.volumDown();
		lg.tvClosed();

		Samsung_tv sm = new Samsung_tv();
		
		sm.setVol(1);
		System.out.println("samsung 볼륨:"+sm.getVol());
		
		sm.volumDown();
		sm.volumUp();
		sm.volumUp();
		
		
	}
}
