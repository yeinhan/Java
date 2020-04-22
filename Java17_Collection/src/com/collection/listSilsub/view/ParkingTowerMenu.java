package com.collection.listSilsub.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager;
import com.collection.listSilsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();

	public ParkingTowerMenu() {
	}

	public void mainMenu() {

		while(true) {
			System.out.println();
			System.out.println("====주차 타워 관리====");
			System.out.println("1. 차량 주자");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 차량 검색");
			System.out.println("0. 끝내기");

			System.out.print("메뉴 선택:");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				inserCar();
				break;
			case 2:
				selectList();
				break;
			case 3:
				deleteCar();
			case 4:
				searchCar(); 
				break;
			case 0:
				System.out.println("종료~");
				return;
			default:
				System.out.println("번호 다시 입력해!!");
				continue;
			}
		}
	}

	public void inserCar() { // 주차
		System.out.print("차량 번호:");
		int carNum = sc.nextInt();
		
		System.out.print("차량 타입(1.경차 / 2.세단 / 3.SUV / 4.트럭):");
		int carType = sc.nextInt();
		
		System.out.print("차주:");
		String owner = sc.next();
		
		Car car = new Car(carNum,carType,owner);
			
		ptm.insertCar(car);
	}

	public void selectList() { // 전체 조회
		ArrayList<Car> searchList = ptm.selectList();
		
		if(searchList.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		}else {
			for(Car c : searchList) {
				System.out.println(c.toString());
			}
		}
		
	}
	
	public void deleteCar() {
		
		System.out.print("차량 번호:");
		int carNum = sc.nextInt();
		
		int res = ptm.deletCar(carNum);
		
		if(res == 0) {

			System.out.println("일치하는 번호가 없음");
		}else {
			System.out.println("삭제 성공");
		}
	}

	
	public void searchCar() {
		System.out.print("주차 차량 검색(차주 입력):");
		String owner = sc.next();
		
		List searchList = ptm.searchCar(owner);
		
		if(searchList.isEmpty()) {
			System.out.println("일치하는 것이 없습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
}
