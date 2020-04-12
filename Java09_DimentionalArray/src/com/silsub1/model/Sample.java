package com.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {

	public void munjae1() {
		int iArr[][] = new int[4][4];
		Random r= new Random();
		int sum=0;
		
		//1.값기록
		for(int i=0; i<iArr.length-1; i++) {
			for(int j=0; j<iArr[i].length-1; j++) {
				iArr[i][j]=(int)(Math.random()*10)+1;
			}
		}
		for(int i=0; i<iArr.length-1; i++) {
			for(int j=0; j<iArr[i].length-1; j++) {
				iArr[i][3] += iArr[i][j];
				iArr[3][i] +=iArr[j][i];
			}
			iArr[3][3] += iArr[i][3]+iArr[3][i];
		}
		

		//출력확인
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j]+"\t");
			}
			System.out.println();
		}
		

//		for(int i=0; i<iArr.length; i++) {
//			for(int j=0; j<iArr[i].length; j++) {
//				if(j==iArr[i].length) {
//					for(int a=0; a<iArr.length-1; a++) {
//						for(int b=0;b<iArr[i].length-1;b++) {
//							iArr[a][j] +=iArr[a][b];
//						}
//					}
//				}else {
//
//					iArr[i][j] = r.nextInt(10)+1;
//				}
//
//				System.out.print(i+","+j+":"+iArr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
	}
	public void munjae2() {
		Scanner sc = new Scanner(System.in);
		int iarr[][]= new int[3][];
		int sum[] = new int[iarr.length];
		
		
		for(int i=0; i<iarr.length; i++) {
			System.out.print(i+"번째 배열수:");
			iarr[i]= new int[sc.nextInt()];
			
			//값 기록
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = (int)(Math.random()*100)+1;
				sum[i] += iarr[i][j];
			}
		}
		
		for(int i=0; i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length; j++ ) {
				System.out.print(iarr[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i=0; i<iarr.length; i++) {
			if(sum[i]%5==0) {
				System.out.println(sum[i]);
			}
		}
	}
	
	public void test2() {
		int iarr[][] = new int[5][5];
		int val=1;
		
		for(int i=0; i<5; i++) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					iarr[i][j] = val++;
					System.out.print(iarr[i][j] + "\t");
					
				}
			}else if(i%2==1) {
				for(int j=4; j>=0; j--) {
					iarr[i][j] = val++;
					System.out.print(iarr[i][j] + "\t");
				}
				
			}
			System.out.println();
		}
	}
}

