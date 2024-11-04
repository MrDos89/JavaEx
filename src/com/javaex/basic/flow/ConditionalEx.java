package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx 
{
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
//		ifEx();
		ifEx2();
	}

	private static void ifEx() 
	{
		Scanner scanner = new Scanner(System.in);
		// 점수를 입력받아서 60점 이상이면 합격입니다.
		System.out.print("점수를 입력하세요. : ");
		int score = scanner.nextInt();
		
		if(score >= 60) 
		{
			System.out.println("합격입니다!");
		} 
		else 
		{
			System.out.println("불합격입니다!");
		}

		scanner.close();
	}
	
	private static void ifEx2()
	{
		Scanner scanner = new Scanner(System.in);
		// if ~ else if ~ else ~
		// 정수 입력 받아서 양수, 0, 음수인지 판별
		System.out.print("숫자를 입력하세요. : ");
		int num = scanner.nextInt();
		
		// 조건1: 0 체크 -> 나머지: 양수 or 음수
		// 조건2: 양수 체크 -> 나머지: 음수
		if(num == 0) 
		{
			System.out.println("0입니다.");
		}
		else if(num > 0)
		{
			System.out.println("양수입니다.");
		}
		else
		{
			System.out.println("음수입니다.");
		}

		//중첩 if
		if (num == 0)
		{
			System.out.println("0입니다.");
		}
		else
		{
			if(num > 0)
			{
				System.out.println("양수입니다.");
			}
			else
			{
				System.out.println("음수입니다.");
			}
		}
		
		
		scanner.close();
	}
	
}
