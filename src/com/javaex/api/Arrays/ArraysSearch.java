package com.javaex.api.Arrays;

import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
		// Java Arrays의 search는 기본적으로 binarySearch 알고리즘을 사용
		// 기본 타입 검색
		int[] nums = { 5, 7, 3, 1, 2, 4, 6, 8, 9, 10 };
			
		System.out.println("원본 : " + Arrays.toString(nums));

		// binary search는 빠른 검색이 장점이지만 정렬이 먼저 되어있어야 찾을 수 있다.
		int index = Arrays.binarySearch(nums, 7);
		System.out.println("7의 인덱스: " + index); // -8 <- 못찾음
		
		Arrays.sort(nums);
		System.out.println("정렬 : " + Arrays.toString(nums));
		
		index = Arrays.binarySearch(nums, 7);
		System.out.println("7의 인덱스: " + index); // 6 <- 찾음
		
		// 참조 타입 검색
		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		Arrays.sort(str);
		System.out.println("정렬 : " + Arrays.toString(str));
		
		int index2 = Arrays.binarySearch(str, "Java");
		System.out.println("Java의 인덱스: " + index2); // 2 <- 찾음
	}

}
