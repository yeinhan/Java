package com.algorithm;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		int num = sc.nextInt();
		
		System.out.println(num);
		if(num<=0){	//num이 양수가 아니면
			System.out.println("숫자가 0보다 같거나 작아서 실행 안됨");
		}else {
			for(int i=num; i>0; i--) {
				for(int j=1; j<=num; j++) {
					if(i<=j) {
						System.out.print("*");
					}else {

						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}

}
