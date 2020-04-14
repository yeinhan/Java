package com.test.chap01.runtime.Exeption;

import java.util.Scanner;

public class RunExcePrac {
	Scanner sc = new Scanner(System.in);
	
	//RuntimeException -> RithmeticException
	
	public void ArithEx() {
		int ran =0;
		double res =  0.0;
		
		while(true) {
			
			ran = (int)(Math.random()*10)+1; /*random 1~10*/
			System.out.print("나눌 수를 입력:");
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("0이 아닌 값 입력하세요!");
			}else {
				res = ran/(double)no;
				System.out.println(ran+"/"+no +"="+res);	
			}
		}
		
	}
	public void ClassNArrayEx() {
		/*ClassCastException*/
//		Object obj = 'a';
//		System.out.println(obj);
//		String str = (String)obj;
//		System.out.println(str);
		
		/*ArrayIndexOutOfBoundsException*/
		
//		int[] arr = new int[2];
//		arr[0]=1;
//		arr[1]=2;
//		
//		arr[2]=3;	//오류 발생
//		System.out.println("출력문이 실행 될까요?");
		
		/*NullPointException*/
		try {
			
			/*ArrayIndexOutOfBoundsException*/
			int[] arr = new int[2];
			arr[0]=1;
			arr[1]=2;
			
			arr[2]=3;	//오류 발생
			System.out.println("출력문이 실행 될까요?");
			
			
			/*NullPointException*/
			String str = null;
			int len = str.length();
			System.out.println(len);
		}/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오프바운스익셉션");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("널포인터 익셉션");
//			e.printStackTrace();
		}*/catch(ArrayIndexOutOfBoundsException|NullPointerException e){
			System.out.println("어레이 인덱스 or 널포인터 익셉션");
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
		
	}
}
