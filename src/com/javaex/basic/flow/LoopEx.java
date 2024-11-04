package com.javaex.basic.flow;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileEx01();
//		whileEx02();
//		doWhileEx();
		forEx();
	}

	private static void whileEx01() {
		int i = 0;
		
		while(i < 5 ) {
			// 컨디션이 참인 동안 블록을 반복
			String text = "I Like Java"+i;
			System.out.println(text);
			
			i += 1;
		}
	}
	
	private static void whileEx02() {
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		Scanner scanner = new Scanner(System.in);
		
		int danNum = scanner.nextInt();
		int i = 1;
		
		while(i < 10 ) {
			// 컨디션이 참인 동안 블록을 반복
			System.out.println(danNum + " X " + i + " = " + danNum*i);
			
			i += 1;
		}
		
		scanner.close();
	}
	
	private static void doWhileEx() {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int inputNum;
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		do {
			inputNum = scanner.nextInt();
			sum += inputNum;
			
			System.out.println("합계: " + sum);
		} while(inputNum != 0);
		
		System.out.println("종료");
		scanner.close();
	}
	
	private static void forEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력해주세요.");
		System.out.print("단: ");
		
		int danNum = scanner.nextInt();
		
		for(int i = 1; i < 10; ++i) {
			System.out.println(danNum + " X " + i + " = " + danNum*i);
		}
		
		scanner.close();
	}
}
