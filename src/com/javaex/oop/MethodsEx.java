package com.javaex.oop;

public class MethodsEx {

	// 메서드 작성 연습
	// 매개 변수 -> 입력, 리턴 -> 출력
	public static void main(String[] args) {
//		// 매개변수 x, 리턴 x
//		printMessage();
//		// 매개변수 x, 리턴 o
//		System.out.printf("Message : " + getMessage() + "\n");
//		// 매개변수 o, 리턴 x
//		printSum(3, 5);
//		// 매개변수 o, 리턴 o
//		System.out.printf("%f", getSum(3, 5));
		
		//매개 변수 개수를 알 수 없을 때의 해결방법
		// 방법1: 배열을 전달한다.
		double total = getSumArr(new double[] { 123, 345, 456, 567, 678, });
		System.out.println(total);
		
		// 방법2: 가변인수를 사용
		double sumResult = getSumVar(123, 345, 456, 567, 678);
		System.out.println(sumResult);
		
		//일반 매개 변수와 가변 매개 변수를 함께 사용할 때
		// 일반 매개변수 먼저, 가변인수 나중에 선언
		printSum("합산값", 1,2,3,4,5,6,7,8,9);
	}
	
	private static void printSum(String message, double ... values) {		
		System.out.println(message + ":" + getSumVar(values));
	}
	
 	private static double getSumVar(double ... values) {
		double total = 0;
		
		for(double value: values) {
			total += value;
		}
		
		return total;
	}
	
	private static double getSumArr(double[] values) {
		double total = 0;
		
		for(double value: values) {
			total += value;
		}
		
		return total;
	}
	
	// 매개변수 x -> 파라미터 없음
	// 리턴 x -> void
	private static void printMessage() {
		System.out.println("매개변수 없고, 리턴도 없음");
	}

	// 매개변수 x -> 파라미터 없음
	// 리턴 o -> 리턴할 데이터의 타입
	private static String getMessage() {
		// return으로 데이터 반환
		return "입력은 없지만, 출력은 있는 메서드";
	}
	
	// 매개변수 o -> 파라미터 있음
	// 리턴 x -> void
	private static void printSum(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	// 매개변수 o -> 파라미터 있음
	// 리턴 o -> 리턴할 데이터의 타입 명시
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
}
