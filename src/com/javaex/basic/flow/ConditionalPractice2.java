package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switchPractice02();
		switchPractice03();
	}
	
	private static void switchPractice02() {
		// 1, 3, 5, 7, 8, 9, 10, 12월 -> 31일
		// 2월 -> 28일
		// 4, 6, 9, 11월 -> 30일
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int monthNum = scanner.nextInt();
		
		switch(monthNum)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(monthNum + "의 마지막 날은 31일 입니다.");
				break;
			case 2:
				System.out.print(monthNum + "의 마지막 날은 28일 입니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print(monthNum + "의 마지막 날은 30일 입니다.");
				break;
			default:
				System.out.print("제대로 된 월 숫자가 아닙니다.");
				break;
		}
		
		scanner.close();
	}

	private static void switchPractice03() 
	{
		// 문자열 변수에 문자열로 요일 정보를 입력
		// "SUNDAY"				 -> 휴식
		// "MONDAY" ~ "THURSDAY" -> 열공
		// "FRIDAY"				 -> 열공 후 불금
		// "SATURDAY"			 -> 주말
		
		// 문자열로 비교가 가능하긴 하지만 에러나 오타 등으로 문제가 생길 수 있기 때문에 enum으로 수정할 예정
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day : ");
		String day = scanner.next();
		String action;
		
		switch(day)
		{
			case "SUNDAY":
				action = "휴식";
				break;
			case "MONDAY":
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
				action = "열공";
				break;
			case "FRIDAY":
				action = "열공 후 불금";
				break;
			case "SATHURDAY":
				action = "주말";
				break;
			default:
				action = "난 누구인가?";
				break;
		}
		
		System.out.print(action);
		
		scanner.close();
	}
	
	
	
}
