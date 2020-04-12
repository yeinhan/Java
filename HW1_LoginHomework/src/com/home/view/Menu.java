package com.home.view;

import java.util.Scanner;
import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		Scanner sc = new Scanner(System.in);
		Function func = new Function();
		int menu;
		
		do {
			System.out.print("메뉴 번호 입력:");
			menu = sc.nextInt();
		
			switch(menu){
			case 1:
				func.calculator();
				System.out.println("***********************");
				break;
			case 2:
				func.totalCalculator();
				System.out.println("***********************");
				break;
			case 3:
				func.profile();
				System.out.println("***********************");
				break;
			case 4:
				func.sungjuk();
				System.out.println("***********************");
				break;
			case 5:
				func.printRandomNumber();
				System.out.println("***********************");
				break;
			case 6:
				func.sumRandomNumber();
				System.out.println("***********************");
				break;
			case 7:
				func.continueGugudan();
				System.out.println("***********************");
				break;
			case 8:
				func.shutNumber();
				System.out.println("***********************");
				break;
			}
			
		}while(menu!=9);{
			System.out.println("프로그램 종료");
		}
	}

}
