package com.inherit.part1_ingerit.model.vo;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new Television("삼성","03","T-123","삼성TV",5000000,new Date(),46);
		System.out.println(t.prnInfo());
		
		Desktop d = new Desktop("삼성","77","S-122","매직스테이션2",1000000,new Date(),"intel",500,8,"window",false);
		System.out.println(d.prnInfo());
		
		SmartPhone s = new SmartPhone("애플","12","I-133","아이폰8플러스",9600000,new Date(),"a12",256,6,"애플","KT");
		System.out.println(s.prnInfo());
		
		System.out.println(s.getBrand());
	}

}
