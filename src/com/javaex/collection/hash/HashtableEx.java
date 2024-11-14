package com.javaex.collection.hash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class HashtableEx {
	
	
	public static void main(String[] args) {
		Map<String, Student> map = new Hashtable<>();
		
		// 맵에 데이터 추가 : put
		map.put("10,홍길동", new Student(10, "홍길동"));
		map.put("20,홍길동", new Student(20, "홍길동"));
		map.put("30,고길동", new Student(30, "고길동"));
		map.put("30,고길동", new Student(30, "고길동2"));
		// 키는 중복되지 않고 순서도 없다.(HashSet이기 때문)
		
		System.out.println(map);
		
		System.out.println(map.get("30,고길동"));
		
		// 특정 키 포함 여부
		System.out.println(map.containsKey("30,고길동"));
		
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Float.valueOf(3.14159f));
		v2.addElement(10);
		v2.addElement(20);
		v2.addElement(30);
		v2.addElement(40);
		
		System.out.println("======= Enumeration");
		Enumeration<? super Number> e = v2.elements(); 
		
		while(e.hasMoreElements()) {
			Number item = (Number)e.nextElement();
			System.out.println(item);
		}
		
		
	}
}
