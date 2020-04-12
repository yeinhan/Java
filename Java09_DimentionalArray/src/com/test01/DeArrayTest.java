package com.test01;

public class DeArrayTest {

	
	public void testInit() {
		//선언을 하게 되면 stack에 할당
		int[][] iarr;
		int iarr1[][];
		
		//heap영역에 2차원 배열을 할당.
		iarr1 = new int[3][5];
		
		//데이터가 저장되는 배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정 해줘야 한다.
		iarr= new int[3][];
		iarr[0] = new int[5];
		iarr[1]= new int[5];
		iarr[2]= new int[5];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(iarr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void testInit2() {
		//선언
		int[][] iarr = new int[3][5];
		
		//배열 인덱스에 접근하여 값 기록
//		iarr[0][0] =1;
//		iarr[0][1]=2;
//		iarr[0][2]=3;
//		iarr[0][3]=4;
//		iarr[0][4]=5;
//		
//		iarr[1][0]=6;
//		iarr[1][1]=7;
//		iarr[1][2]=8;
//		iarr[1][3]=9;
//		iarr[1][4]=10;
//		
//		iarr[2][0]=11;
//		iarr[2][1]=12;
//		iarr[2][2]=13;
//		iarr[2][3]=14;
//		iarr[2][4]=15;
		
		int val =1;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j]=val++;
			}
		}
		printArray(iarr);
		
	}
	
	public void printArray(int[][] iarr) {
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print("  "+iarr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void testInit3() {
		//가변 배열
		int[][] iarr= new int[3][];
		
//		printArray(iarr);
		
		iarr[0]= new int[5];
		iarr[1]= new int[3];
		iarr[2]= new int[10];
		
		
		int value=0;
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j]=++value;
			}
		}
		printArray(iarr);
	}
	
	public void testInit4() {
		//다차원 배열의 할당과 초기화르ㅏㄹ 동시에 할 수 있다.
//		int[][] iarr= {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		int[][] iarr = {{1,2,3}, {4,5,6,7,8,9}, {10,11,12,13}};
		printArray(iarr);
	}

	

}
