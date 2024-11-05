package com.javaex.basic.reftypes;

import java.util.Scanner;

public class EnumEx {

	public static void main(String[] args) {
		usingEnum();
	}
	
	private static void usingEnum() {
		Week today = Week.TUESDAY;
		
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		String dayStr = "FRIDAY";
//		String dayStr = "BIRTHDAY";
		Week obj = Week.valueOf(dayStr);
		System.out.printf(obj.name() + " " + obj.ordinal() + "%n");
		
		// 열거 상수 목록
		System.out.println("Enum Week: ");
		Week[] days = Week.values();
		
		for (int i = 0; i < days.length; ++i) {
			Week day = days[i];
			
			System.out.printf("%s -> %d%n", day.name(), day.ordinal());
		}
		
		Week otherDay = Week.FRIDAY;
		
		//Tuesday와 Friday의 순번 비교
		System.out.println(today.compareTo(otherDay));
	}

}
