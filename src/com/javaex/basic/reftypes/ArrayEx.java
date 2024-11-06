package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		usingArray();
//		multiDimArrayEx();
//		arrayCopyForEx();
//		arrayCopySystem();
		enhancedFor();
	}
	
	private static void usingArray() {
		String[] names;
		int scores[];
		
		names = new String[] {
				"김","이","박","최"
		};
		
		scores = new int[4];
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		float heights[] = {
				175.3f,
				170.2f,
				173.4f,
				168.5f
		}; // 선언과 동시에 할 때만 가능
		
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("%s (%.2f) : score=%d%n", names[i], heights[i], scores[i]);
		}
		
		// scores 배열이 있음 
		// 참조 복제 : 얕은 복사
		// 객체의 주소를 복사하는 것
		int scores2[] = scores;
		
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		scores2[2] = 100;
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
	}
	
	private static void multiDimArrayEx() {
		// 5행 10열을 2차원 배열
		int[][] twoDimens = new int[5][10];
		
		// 기본 데이터가 있을 경우
		int table[][] = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 },
				{ 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 },
				{ 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 },
		};
		
		System.out.println("table.length: " + table.length);
		// 인덱스 범위: table[0] ~ table[table.length - 1]
		System.out.println("table[0].length: " + table[0].length);
		// 인덱스 범위: table[0][0] ~ table[0][table[0].length - 1]
		
		int sum = 0;
		for (int row = 0; row < table.length; ++row) {
			for (int col = 0; col < table[row].length; ++col) {
				int val = table[row][col];
				
				System.out.print(val + "\t");
				sum += val;
			}
			System.out.println();
		}
		
		System.out.print("SUM: " + sum + "\t");
	}

	private static void arrayCopyForEx() {
		// 배열은 크기 변경이 안된다
		// 배열 크기를 변경해야될 땐 새 배열을 생성하고 복사한다
		int source[] = { 1, 2, 3 };
		System.out.println("원본: " + Arrays.toString(source));
		
		// 7개의 빈 공간이 더 필요
		int target[] = new int[10];
		
		for(int i = 0; i < source.length; ++i) {
			target[i] = source[i];
		}
		
		System.out.println("복사본: " + Arrays.toString(target));
	}
	
	private static void arrayCopySystem() {
		// 손쉬운 배열의 복제
		int[] source = { 1,2,3, };
		
		System.out.println("원본: " + Arrays.toString(source));
		
		int[] target = new int[10];
		
		System.arraycopy(source,			// 원본 배열
							0, 				// 시작 인덱스
							target, 		// 타겟 배열
							0, 				// 타겟 배열의 시작 인덱스
							source.length);	// 복사열 길이
		
		System.out.println("복사본: " + Arrays.toString(target));
		
		System.arraycopy(source,			// 원본 배열
				0, 				// 시작 인덱스
				target, 		// 타겟 배열
				3, 				// 타겟 배열의 시작 인덱스
				source.length);	// 복사열 길이

		System.out.println("복사본 2: " + Arrays.toString(target));
	}
	
	private static void enhancedFor() {
		int[] nums = { 1,2,3,4,5,6,7,8,9,10 };
		
		//일반적인 for문
		for (int i = 0; i < nums.length; ++i) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		// Enhanced for:
		// 카운터 변수, 반복 조건, 증감식 신경쓰지 않고
		// 손쉽게 컬랙션 데이터(배열 등)를 조작할 수 있음
		
		for(int num: nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
	}
}
