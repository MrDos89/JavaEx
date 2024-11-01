package com.javaex.basic.types;

// 상수
// 다루는 데이터에 불변성(immutable)을 부여하는 것
public class ConstantEx {

	public static void main(String[] args) {
		
		// final은 한번 할당되면 재할당 불가
		// 상수의 이름은 모두 대문자, 단어의 조합은 _로 구분 
		final int MAX_SPEED_LIMIT = 100;
		
		System.out.println("현재 도로의 제한 속도는 " + MAX_SPEED_LIMIT + "km/h 입니다.");
		
		// MAX_SPEED_LIMIT = 300; // 재할당이 불가해졌다.
		
		System.out.println("제한 속도 " + MAX_SPEED_LIMIT + "km/h 이하로 주행 해주세요.");
	}

}
