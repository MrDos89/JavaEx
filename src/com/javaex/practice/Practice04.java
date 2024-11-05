package com.javaex.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex08();
	}
	
	private static void ex01() {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i = 0; i <= intArray.length; ++i) {
			result = result + intArray[i];
		}
		
		// 이건 에러가 나는 게 0 ~ 5 까지 범위를 계산하라고 했는데 실제 배열의 범위는 0 ~ 4이기 때문에 연산이 안된다. 
		System.out.println(result);
	}

	private static void ex02() {
		double array[] = { 6.7, 3.3, 1.2, };
		
		for(int i = 0; i < array.length; ++i) {
			System.out.printf("%.1f %n", array[i]);
		}
	}
	
	private static void ex03() {
		int[] intA = { 3, 6, 9, };
		
		int[] intB;
		intB = intA; //참조 복제 (얕은 복사) 이기 때문에 주소를 가져옴
		intB[0] = 20; // 20, 6, 9,
		intB[2] = 10; // 20, 6, 10,
		
		// intA 배열도 20, 6, 10, 이 됨. (얕은 복사이기 떄문에 intB 배열이 가르키는 배열의 주소에 있는 배열의 값을 바꿔서
		for(int i = 0; i < intA.length; ++i) {
			System.out.println(intA[i]);
		}
	}
	
	private static void ex04() {
		int[] intData = { 1, 3, 5, 7, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		// 3의 배수 개수용 변수 
		int threeCount = 0;
		// 3의 배수의 합용 변수
		int threeTotal = 0;
		
		// intA 배열도 20, 6, 10, 이 됨. (얕은 복사이기 떄문에 intB 배열이 가르키는 배열의 주소에 있는 배열의 값을 바꿔서
		for(int i = 0; i < intData.length; ++i) {
			int val = intData[i];
			if(val % 3 == 0) {
				threeCount += 1;
				threeTotal += val;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + threeCount);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + threeTotal);
	}
	
	private static void ex05() {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[5];
		
		float avg = 0;
		int sum = 0;
		
		for(int i = 0; i < array.length; ++i) {
			int val = scanner.nextInt();
			array[i] = val;
			sum += array[i];
		}
		
		avg = (float)sum / array.length;
		
		System.out.printf("평균은 %.1f 입니다.", avg);
		
		scanner.close();
	}
	
	private static void ex06() {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', };
		
		for(int i = 0; i < c.length; ++i)
		{
			System.out.printf("%c", c[i]);
		}
		System.out.println();
		for(int i = 0; i < c.length; ++i)
		{
			if(c[i] == ' ') {
				c[i] = ',';
			}
			System.out.printf("%c", c[i]);
		}
	}
	
	private static void ex07() {
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		int[] wonCountArray = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액: ");
		int value = scanner.nextInt();
		
		for (int i = 0; i < wonArray.length; ++i) {
			if((value / wonArray[i]) > 0) {
				wonCountArray[i] = (value / wonArray[i]);
			}
			
			if(value % wonArray[i] != 0) {
				value = value % wonArray[i];
			}
		}
		
		for(int i = 0; i < wonCountArray.length; ++i) {
			System.out.printf("%d원: %d개%n", wonArray[i], wonCountArray[i]);
		}
		
		scanner.close();
	}
	
	private static void ex08() {
		int[] lottoArray = new int[6];
		boolean[] isEmptyArray = { true, true, true, true, true, true, };
		
		boolean isDuplicated = false;
		boolean isFinished = false;
		
		while(!isFinished) {
			isDuplicated = false;
			int lottoNum = (int)(Math.random() * 45) + 1;
			
			for(int i = 0; i < lottoArray.length; ++i) {
				if(lottoNum == lottoArray[i]) {
					isDuplicated = true;
					break;
				}
			}
			
			if(!isDuplicated)
			{
				for(int j = 0; j < lottoArray.length; ++j) {
					if(isEmptyArray[j] == true) {
						lottoArray[j] = lottoNum;
						isEmptyArray[j] = false;
						break;
					}
				}
				
				for(int i = 0; i < isEmptyArray.length; ++i) {
					if(!isEmptyArray[i]) {
						isFinished = true;
						continue;
					} else {
						isFinished = false;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < lottoArray.length; ++i) {
			System.out.print(lottoArray[i] + "\t");
		}
	}
}
