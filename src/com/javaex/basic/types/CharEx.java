package com.javaex.basic.types;

// char (2) : 문자의 유니코드 값 (부호없는 정수) (unsigned short)
public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		char test = (char)(((int)ch1) + 4);
		System.out.println(test);
	}

}
