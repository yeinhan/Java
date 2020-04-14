package com.test.chap01_string.run;

public class Run {
	//String
	//immutable(불변), 변경은 적고, 읽기가 많은 경우
	public static void main(String[] args) {
//		Run.method1();
		Run.method2();
	}	
	
	public static void method1() {
		//1.문자열을 리터럴로 생성
		String str= "abc";
		String str1 = "abc";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());	/*hashcode*/
		System.out.println(str1.hashCode());
		//JMVdl String Pool에 등록 시키고 리터럴로 문자열 생성 할 때 
		//동일한 값이 다시 호출될 때에는 String pool에 등록된 값을 리턴
		
		System.out.println();
		//2.생성자를 통한 문자열 생성
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str2));	/*identityHashCode*/
		System.out.println(System.identityHashCode(str3)); //new 연산자를 이욯하여 만들었기 때문에 실제 주소값은 다름
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
	}
	public static void method2() {
		//charAt(index)
		String str="abc";
		System.out.println(str.charAt(1));
		
		//concat() 합치기
		System.out.println(str.concat("def"));
		
		//contains() 포함여부
		System.out.println(str.contains("ab"));
		
		//equals() 같은 지 비교
		System.out.println(str.equals("ab"));
		
		//length() : 길이
		System.out.println(str.length());
		
		//split()
		String str1 = "a,b,c,def";
		String[] strArr = str1.split(",");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		//향상된 for문
		for(String arr:strArr) {
			System.out.println(arr);
		}
		
		//toUpperCase() 대문자로
		System.out.println(str.toUpperCase());
		
		//substring() 잘라내기
		System.out.println(str1.substring(2,5));

		//trim() 공백제거
		String str2 = "      ab c  ";
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll(" ", ""));	//공백을 빈칸으로 바꾸겠다. (왼쪽에 있는 걸 오른쪽으로)
		
		
		

	}
}
