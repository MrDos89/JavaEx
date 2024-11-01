package com.javaex;

import java.util.Scanner;

// Tip1 Organize Import : Ctrl + Shift + O -> 맥은 Command + Shift + O
// TIP2 코드 자동완성: Ctrl + Space -> 맥은 몰

// Console
// 표준 입력 : stdin -> System.in
// 표준 출력 : stdout -> System.out
// 표준 에러 : stderr -> System.err
public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		consoleOutput();
		consoleInput();
	}

	public static void consoleInput() {
		// 입력 관련
		// 데이터 소스로부터 입력을 받는 Scanner 클래스를 사용
		// java.lang 이외의 기능을 불러올 때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
		// 이름과 나이를 물어봐서 출력하는 프로그램
		System.out.print("너 누구야? ");
		String name = scanner.next();
		System.out.print("나이는 몇 살이야? ");
		int age = scanner.nextInt();
		
		System.out.println("Welcome, " + name);
		System.out.println("당신의 나이는 " + age + "세입니다.");
		scanner.close();
	}
	
	public static void consoleOutput() {
		// 출력 관련
		// print : 개행 안함
		// println : 개행 함
		// printf : 형식 지정문자열 출력 -> String
		
		System.out.print("Hello ");
		System.out.println("Java!");
		
		// 이스케이프 문자
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello, \"Java\"");
		
		System.out.println("\\: 역슬래쉬");
	}
}
