package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifPractice01();
		
	}
	
	private static void ifPractice01() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.자바 2.C++ 3.C 4.파이썬)");
		System.out.print("과목 번호: ");
		int classNum = scanner.nextInt();
		
		if(classNum == 1)
		{
			System.out.print("R101호 입니다.");	
		}
		else if(classNum == 2)
		{
			System.out.print("R202호 입니다.");	
		}
		else if(classNum == 3)
		{
			System.out.print("R303호 입니다.");	
		}
		else if(classNum == 4)
		{
			System.out.print("R404호 입니다.");	
		}
		else
		{
			System.out.print("상담원에게 문의하세요.");
		}
		
		scanner.close();
	}

}
