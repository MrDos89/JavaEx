package com.javaex.basic.types;


// 정수형 데이터 타입
// byte (1) < short (2) < int (4) < long (8)
// 정수형 기본은 int
public class IntLongEx {
	public static void main(String[] args) {
		// 선언
		int intVar1;
		int intVar2;
		
		// 초기화
		intVar1 = 2024;
//		intVar2 = 1234567890123; // out of range
		
		System.out.println(intVar1);
		
		long longVar1 = 2024;
		long longVar2 = 1234567890123L; // L을 붙여줘야 한다.
		
		System.out.println(longVar2);
		
	}
}
