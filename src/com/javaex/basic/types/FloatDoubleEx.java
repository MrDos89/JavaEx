package com.javaex.basic.types;


// float (4바이트 실수) < double (8바이트 실수) 
public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar = 3.12139F;
		double doubleVar = 3.14159;
		
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		
		// e 표기법
		int intVar = 100000;
		doubleVar = 3E6;
		floatVar = 3E-6F;
		
		System.out.println("intVar: " + intVar);
		System.out.println("doubleVar: " + doubleVar);
		System.out.println("floatVar: " + floatVar);
		
		// 부동소수점 처리 유의사항
		// float, double은 정밀도 표기, 또한 범위 넓힌 것 
		// 정밀한 실수 계산을 할 때는 다른 방법을 사용
		System.out.println(0.1 * 3);
	}
}
