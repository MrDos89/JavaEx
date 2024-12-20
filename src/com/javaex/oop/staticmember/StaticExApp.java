package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// 첫번째 instance가 생성되기 전에 클래스가 먼저 메모리에 로드
		// static 블록에서 스태틱 영역 초기화 -> 생성자 호출
		StaticEx s1 = new StaticEx(); // 인스턴스 생성
		System.out.println("refCount: " + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx(); // 인스턴스 생성
		System.out.println("refCount: " + StaticEx.refCount);
		
		s1 = null;
		
		System.gc();  // 가비지 컬렉터 호출 -> 직접 호출은 사양하자
		try {
			Thread.sleep(3000);  // 3초간 대
			System.out.println("refCount: " + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
}
