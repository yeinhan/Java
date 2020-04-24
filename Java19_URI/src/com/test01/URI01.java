package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class URI01 {
	/*
	 * URL: Uniform Resourse Locator 주소(위치)
	 * 		특정서버의 한 리소시에 대한 구체적인 위치 서술
	 * URN: Uniform REsource Name 대상(이름)
	 * URI: URL + URN 
	 * 
	 * */
	
	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI("http://localhost:8787/Java_URI_Web/res.jsp"+"?tname=lee&taddr=seoul");
		
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getQuery());
	}
}
