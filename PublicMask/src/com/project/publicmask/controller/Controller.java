package com.project.publicmask.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.project.publicmask.model.BuyerList;
import com.project.publicmask.model.Drugstore;
import com.project.publicmask.model.Mask;
import com.project.publicmask.model.Person;

public class Controller {
	private ArrayList<Drugstore> DrugstoreList = new ArrayList<>();
	private ArrayList<Mask> MaskList = new ArrayList<>();
	private ArrayList<Person> personList = new ArrayList<>();
	private ArrayList<BuyerList> buyerList = new ArrayList<BuyerList>();
	
	public Controller() {}
	
	public ArrayList<Drugstore> SelectDrugstoreList(){
		DrugstoreList.add(new Drugstore("빨간약국", "서울특별시 강남구 강남구 테헤란로14길 6","02-222-2222", MaskList));
		
		return DrugstoreList;
		
	}
	
	public ArrayList<Mask> viewMask(){
		MaskList.add(new Mask(100,200,20));
		
		return MaskList;
		
	}
	
	public ArrayList viewPerson() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("data.txt"));
			String string;
			try {
				while ((string = in.readLine()) != null) {
					String[] strArr = string.split(", ");
					viewPersonData(strArr);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return buyerList;
	}

	// buyerList에 값 넣는 메소드
	public void viewPersonData(String[] strArr) {
		BuyerList b = new BuyerList();
		b.setPname(strArr[0]);
		b.setPnum(strArr[1]);
		b.setStorename(strArr[2]);
		buyerList.add(b);
	}

	// getter&setter
	public ArrayList<BuyerList> getbuyerList() {
		return buyerList;
	}

	public void setbuyerList(ArrayList<BuyerList> buyerList) {
		this.buyerList = buyerList;
	}
	
}
