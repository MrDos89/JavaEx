package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> lst = new LinkedList<>();
		
		
		List<String> lst = new ArrayList<>();
		
		// 객체 추가
		lst.add("Java"); // add: 맨 뒤에 새 아이템 추가
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		lst.add("Java");
		
		// 객체 중간에 삽입
		lst.add(2,"C#");
		
		System.out.println(lst);
		
		// 객체 삭제
		lst.remove(5);
		System.out.println(lst);
		
		lst.remove("Java");
		System.out.println(lst);
		
		// 요수 개수 확인
		System.out.println("size=" + lst.size());
		
		// TODO 리스트의 순회
		// 리스트 바꾸기
		lst.clear();
		System.out.println(lst);
	}

}
