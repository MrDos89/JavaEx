package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {
	
	
	public static void main(String[] args) {
		Map<String, Student> map = new Hashtable<>();
		
		// 맵에 데이터 추가 : put
		map.put("10,홍길동", new Student(10, "홍길동"));
		map.put("20,홍길동", new Student(20, "홍길동"));
		map.put("30,고길동", new Student(30, "고길동"));
		map.put("30,고길동", new Student(30, "고길동"));
		// 키는 중복되지 않고 순서도 없다.(HashSet이기 때문)
		
		System.out.println(map);
		
	}
}
