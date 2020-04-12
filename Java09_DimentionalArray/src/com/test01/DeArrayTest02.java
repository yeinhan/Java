package com.test01;

public class DeArrayTest02 {

	public void test01() {
		//구구단을 2차원 배열에 넣어보자
		int[][] dArr = new int[8][9];
		
		int val=0;
		
		for(int i=0; i<dArr.length; i++) {
			System.out.printf("%d단:",i+2);
			for(int j=0; j<dArr[i].length; j++) {
				dArr[i][j] = (i+2)*(j+1);
				System.out.print(" " + dArr[i][j]);
			}
			System.out.println();
		}
		
	}
}


