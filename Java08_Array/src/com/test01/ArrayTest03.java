package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest03 at03 = new ArrayTest03();
//		at03.shallowCopy();
//		at03.deepCopy();
//		at03.deepCopy2();
		at03.deepCopy3();

	}
	public void shallowCopy() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str ="";
		
		for(int i=0; i<originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1.originArr: "+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2.copyArr: "+ str);
		
		//원본배열
		originArr[0]=99;
		
		str ="";
		
		for(int i=0; i<originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1.originArr: "+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2.copyArr: "+ str);
		
		System.out.println("originArr의 hashcode: "+originArr.hashCode());
		System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
		
	}
	public void deepCopy() {
		//깊은 복사는 동일한 새로운 배열을 하나 생성하고 값을 복사
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[5];
		
		for(int i=0; i<originArr.length; i++) {
			copyArr[i] += originArr[i];
//			System.out.println()
		}
		//원본 배열값 출력
		String str ="";
		for(int i=0; i<originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1.originArr: "+str);
		
		//복사 배열값 출력
		str="";
		for(int i=0; i<copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2.copyArr: "+ str);
		
		//원본 배열의 0번 인덱스 값을 99로 번경//원본배열
		originArr[0]=99;
		
		str ="";
		
		for(int i=0; i<originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1.originArr: "+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2.copyArr: "+ str);

		System.out.println("originArr의 hashcode: "+originArr.hashCode());
		System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
	}
	
	public void deepCopy2() {
		//2.arraycopy()	
		//java.lang.System
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr= new int[10];
		
		//src:원본배열 srcpos:복사시작 위치 dest:카피배열 destpos:붙여넣기시작위치 length:복사될 길이
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		String str ="";
		
		for(int i=0; i<originArr.length; i++) {
			str += originArr[i] + " ";
		}
		System.out.println("1.originArr: "+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			str += copyArr[i] + " ";
		}
		System.out.println("2.copyArr: "+ str);
	}
	public void deepCopy3() {
		//clone()
		int originArr[]= {1,2,3,4,5};
		int copyArr[]=new int[10];
		
		System.out.println("준비된 복사본 배열의 주소:"+copyArr.hashCode());
		copyArr = originArr.clone();
		System.out.println("준비된 복바본 배열의 주소:"+copyArr.hashCode());
		
	}
}
