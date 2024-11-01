package com.javaex.basic.opers;

// 비교 연산과 논리 연산
// 연산 결과는 항상 boolean
public class LogicalOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, b = 3;
		
		// 비교 연산자
		// >, >=, <, <=, ==, != 
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		// 논리 연산
		// AND (&&), OR (||), NOT (!)
		// 논리 연산은 집합 개념을 떠올립니다.
		int val = 5;
		
		/*
		 * val이 0 초과, val이 10 미만의 값?
		 * 조건1 : val > 0 ? 
		 * 조건2 : val < 10 ? 
		 * 조건 1 AND 조건 2 (교집합 영역)*/
		boolean r1 = val > 0;
		boolean r2 = val < 10;
		// 두 조건의 조합
		boolean r1AndR2 = r1 && r2;
		System.out.println("r1 && r2 => " + r1AndR2);
		
		/*
		 * val이 0 이하 이거나 val이 10 이상인 값?
		 * 조건1 : val <= 0 ? 
		 * 조건2 : val >= 10 ? 
		 * 조건 1 OR 조건 2 (합집합 영역)*/
		System.out.println(val <= 0 || val >= 10);
		
		// 혹은 위에 교집합을 대우 하면 된다
		// not -> 논리 부정 (여집합)
		System.out.println(!r1AndR2);
		
		boolean rNot = !(val > 0 && val < 10);
	}

}
