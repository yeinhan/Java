package com.project.publicmask.controller;

import java.util.ArrayList;

import com.project.publicmask.model.Drugstore;
import com.project.publicmask.model.Mask;
import com.project.publicmask.model.Person;

public class Controller {
	private ArrayList<Drugstore> DrugstoreList = new ArrayList<>();
	private ArrayList<Mask> MaskList = new ArrayList<>();
	private ArrayList<Person> personList = new ArrayList<>();
	
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
		personList.add(new Person("한예인","971113-2222222"));
		personList.add(new Person("둘예인","991113-2222222"));
		return personList;
	}
	
	public ArrayList<Person> getpersonList() {
		return personList;
	}
	
	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}
	
}
