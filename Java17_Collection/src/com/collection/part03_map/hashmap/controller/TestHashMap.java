package com.collection.part03_map.hashmap.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public void testHashMap() {
		HashMap hmap = new HashMap();
//		Map hmap2 = new HashMap();
		
		hmap.put("one", new Date());	//(key, value)
		hmap.put(12, "red apple");
		hmap.put(33,123);
		System.out.println("hmap: "+hmap);
		//key값은 중복허용안함:최근 키값으로 덮어씌어 진다.
		hmap.put(12, "yello banana");
		System.out.println("hmap: "+hmap);
		//value값은 중복허용(list특징)
		hmap.put(11, "yello banana");
		hmap.put(9, "yellow banana");
		System.out.println("hmap: "+hmap);
		
		//각 객체의 내용을 가져오기
		System.out.println("키가 9인 객체: "+hmap.get(9));
		
		//삭제
		hmap.remove(9);
		System.out.println("hmap: "+hmap);
	}
	
	public void testHashMap2() {
		HashMap hmap = new HashMap();
		hmap.put("one", "java");
		hmap.put("two", "oracle");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		//1.KeySet()	
		System.out.println("----------1. key set()-----------");
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();		//줄세우기
		while(keyIter.hasNext()) {
			String key = (String)keyIter.next();
			String val = (String)hmap.get(key);
			System.out.println(key+"="+val);
		}
		
		System.out.println();
		//2.저장된 value값들만 Value()을 이용해 Collection으로 만든다.

		System.out.println("----------2.저장된 value값들만 Value()을 이용해 Collection으로 만든다.-----------");
		Collection values = hmap.values();
		//2.1 Iterator()
		System.out.println("**2.1 Iterator()**");
		Iterator valIter = values.iterator();
		while(valIter.hasNext()) {
			System.out.println(valIter.next());
		}
		
		//2.2 배열로 처리
		System.out.println("**2.2 배열로 처리**");
		Object[] valArr = values.toArray();
		for(int i=0; i<valArr.length; i++) {
			System.out.println(i+ " : "+valArr[i]);
		}
		
		System.out.println();
		//3.Map 내부 클래스인 EntrySet을 이용
		System.out.println("------3.Map 내부 클래스인 EntrySet을 이용---------");
		Set set = hmap.entrySet();
		Iterator entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
