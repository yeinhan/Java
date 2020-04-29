package com.project.publicmask.model;

import java.util.ArrayList;

public class Drugstore {
	private String name;
	private String adress;
	private String pNumber;
	private ArrayList maskInfo;
	
	public Drugstore() {}
	
	public Drugstore(String name, String adress, String pNumber, ArrayList maskInfo) {
		this.name= name;
		this.adress = adress;
		this.pNumber = pNumber;
		this.maskInfo = maskInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public ArrayList getMaskInfo() {
		return maskInfo;
	}

	public void setMaskInfo(ArrayList maskInfo) {
		this.maskInfo = maskInfo;
	}
	
	@Override
	public String toString() {
		return name+" "+adress+" "+pNumber;
	}
}
