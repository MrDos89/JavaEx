package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ifEx();
	}

	private static void ifEx() 
	{
		// 점수를 입력받아서 60점 이상이면 합격입니다.
		Scanner scanner = new Scanner(System.in);
		
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
	
}
