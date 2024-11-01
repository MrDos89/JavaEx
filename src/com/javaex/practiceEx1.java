package com.javaex;

import java.util.Scanner;

public class practiceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//		consoleName(scanner);
		consoleNameAndAge(scanner);
		
		scanner.close();
	}

	private static void consoleName(Scanner scanner) {
		System.out.println("이름을 입력 해주세요.");
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
	}
	
	private static void consoleNameAndAge(Scanner scanner) {
		System.out.println("이름을 입력 해주세요.");
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "입니다.");
	}
	
}
