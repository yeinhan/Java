package com.collection.listSilsub.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.listSilsub.model.Car;

public class ParkingTowerManager {
	private ArrayList<Car> carList = new ArrayList<>();
	
	public ParkingTowerManager() {}
	
	public void insertCar(Car car) {
		int lastNo = 0;
		
		try {
			lastNo = carList.get(carList.size()-1).getParkingNum()+1; //마지막 차량량 번호 +1
			
		}catch(ArrayIndexOutOfBoundsException e) {
			lastNo=1;
		}

		car.setParkingNum(lastNo);
		carList.add(car);
		
	}
	public ArrayList<Car> selectList() {
		return carList;
		
	}
	
	public int deletCar(int carNum) {
		Car del = null;	//출차되는 정보
		
		for(int i=0; i<carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				System.out.println(carList.get(i));
				del = carList.remove(i);
			}
		}
		
		if(del!=null) {	//삭제된게 있다.
			return 1;
		}else {
			return 0;
		}
				
	}
	
	public List<Car> searchCar(String owner){
		
		List<Car> searchList = new ArrayList<>();
		for(int i=0; i<carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchList.add(carList.get(i));
			}
		}
		return searchList;
	}

}
