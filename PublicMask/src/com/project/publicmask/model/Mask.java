package com.project.publicmask.model;

public class Mask {
	private int KF94;
	private int KF80;
	private int dentalmask;
	
	public Mask(){}
	
	public Mask(int KF90, int KF80, int dentalmask) {
		this.KF94 = KF90;
		this.KF80 = KF80;
		this.dentalmask = dentalmask;
	}

	public int getKF94() {
		return KF94;
	}


	public void setKF94(int kF94) {
		KF94 = kF94;
	}


	public int getKF80() {
		return KF80;
	}


	public void setKF80(int kF80) {
		KF80 = kF80;
	}


	public int getDentalmask() {
		return dentalmask;
	}


	public void setDentalmask(int dentalmask) {
		this.dentalmask = dentalmask;
	}
	@Override
	public String toString() {
		return "KF90 수량:" + KF94 + " KF80:"+KF80+ " dentalmask"+ dentalmask;
	}


	
}
