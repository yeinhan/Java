package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		//IP주소를 표현하는 class
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr);
		System.out.println("localhost:"+addr.getHostAddress());
		System.out.println("hostName:"+addr.getHostName());

		System.out.println();
		
		InetAddress[]	naver = InetAddress.getAllByName("www.github.com");
		for(int i=0; i<naver.length; i++) {
			System.out.println(naver[i].getHostName()+", "+naver[i].getHostAddress());
			
		}
	}

}
