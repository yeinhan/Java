package com.test.chap02_stringBuffer_stringBuilder.run;

public class Run {
	/*
	 * StringBuffer, StringBuilder의 특징
	 *-mutable클래스, 변경과 저장을 위한 메모리공간(버퍼)을 내부에 지닌다.
	 *-버퍼의 초기값 16개의 문자를 저장가능하다. 자동으로 증가
	 *
	 * 
	 *
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run.method1();
//		Run.method2();
//		Run.method3();
	}
	public static void method1()	{
		StringBuilder sb = new StringBuilder("내일 휴일임");
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // 용량 16+6
		
		StringBuilder sb1 = new StringBuilder(21);
		System.out.println(sb1.capacity());
		
		System.out.println(sb);
	}
	public static void method2() {
		String str = "반가워!";
		System.out.println("str 기존: "+str+", 주소:"+str.hashCode());
		
		str += "나는 String이라고 해";
		System.out.println("str 추가 후: "+str+", 주소: "+str.hashCode()); 	//string에추가 혹은 변경시 새로운 주소값
		
		StringBuffer sbf = new StringBuffer("안녕!");
		System.out.println("sbf 기존: "+sbf+", 주소: "+sbf.hashCode());
		
		sbf.append("난 StringBuffer라고 해");
		System.out.println("sbf 기존: "+sbf+", 주소: "+sbf.hashCode());		//문자열 추가해도 주소 똑같음
		
		StringBuilder sbd = new StringBuilder("하이~");
		System.out.println(sbd+"의 주소: "+sbd.hashCode());
		sbd.append("난 StringBuilder지");
		System.out.println(sbd+"의 변경 후 주소: "+sbd.hashCode());		//주소값 똑같음
	}
	public static void method3(){
		//StringBuffer sb = new StringBuffer("저는");
		StringBuilder sb = new StringBuilder("난 ");
		//append 해당객체에 추가하고자 할때
//		sb.append("배가 불러요~");
//		sb.append("~~~!");
		
		sb.append("배가 불러요").append("~~!");	//메소드 체이닝
		System.out.println(sb);
		
		//insert
		sb.insert(2, "점심을 먹어서");
		System.out.println(sb);
		//delete
		sb.delete(2, 9);
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
	}

}
