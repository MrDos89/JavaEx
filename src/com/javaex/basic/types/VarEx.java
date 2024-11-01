package com.javaex.basic.types;


//변수의 선언과 할당
public class VarEx {
	public static void main(String[] args) {
//		변수 명명 규칙
//		1. 문자, 숫자, $, _의 조합으로 생성
//		2. 숫자로 시작하면 안된다.
		
//		변수명 관례
//		1. 소문자로 작성하되, 만약 단어의 조합이면 두번째 이후 단어의 첫 글자는 대문자
		

//		int myAge;  //		선언
//		myAge = 35; //		초기화
		
		int myAge = 35; //선언과 동시에 초기화
		System.out.println("내 나이는 " + myAge + "살 입니다.");
		
		//한번에 여러 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1 = v2 = v3 = 2024;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
