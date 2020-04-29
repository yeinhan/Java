package com.project.publicmask.controller;

import java.util.ArrayList;

import com.project.publicmask.model.Drugstore;
import com.project.publicmask.model.Mask;

public class Controller {
	private ArrayList<Drugstore> DrugstoreList = new ArrayList<>();
	private ArrayList<Mask> MaskList = new ArrayList<>();
	
	public Controller() {}
	
	public ArrayList<Drugstore> SelectDrugstoreList(){
		DrugstoreList.add(new Drugstore("빨간약국", "서울특별시 강남구 강남구 테헤란로14길 6","02-222-2222", MaskList));
		
		return DrugstoreList;
		
	}
	
	public ArrayList<Mask> viewMask(){
		MaskList.add(new Mask(100,200,20));
		
		return MaskList;
		
	}
	
}
