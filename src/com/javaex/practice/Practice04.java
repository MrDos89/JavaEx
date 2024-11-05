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
			
			//해당 지폐 단위가 몇개 있는지 체크 해서 카운트 배열에 추가 
			if((value / wonArray[i]) > 0) {
				wonCountArray[i] = (value / wonArray[i]);
			}
			
			// 다음 지폐 단위를 계산하기 위해 위에 카운트 된 지폐 단위를 뺀 나머지를 기존 변수에 새로 갱신
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
		
		// 로또 번호 6개 다 채울 때까지 돌림
		while(!isFinished) {
			//중복체크 초기화
			isDuplicated = false;
			// 로또 번호 뽑기 
			int lottoNum = (int)(Math.random() * 45) + 1;
			
			//로또 번호 중복인지 체크
			for(int i = 0; i < lottoArray.length; ++i) {
				if(lottoNum == lottoArray[i]) {
					// 번호 하나라도 중복이면 바로 탈출
					isDuplicated = true;
					break;
				}
			}
			
			// 중복 번호였을 경우 안 채우고 채웠는지 체크하지도 않음
			if(!isDuplicated)
			{
				// 로또 번호 채우자
				for(int j = 0; j < lottoArray.length; ++j) {
					if(isEmptyArray[j] == true) {
						lottoArray[j] = lottoNum;
						// 로또 번호 찼으니 이 곳은 이제 빈 자리가 아니다.
						isEmptyArray[j] = false;
						break;
					}
				}
				
				// 로또 번호 6개 다 찼나 체크
				for(int i = 0; i < isEmptyArray.length; ++i) {
					if(!isEmptyArray[i]) {
						isFinished = true;
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
