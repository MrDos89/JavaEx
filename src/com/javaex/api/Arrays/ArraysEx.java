package com.javaex.api.Arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// 배열 복사
		arrayCopyEx();
		// 얕은 비교
		equalsEx();
	}
	
	private static void arrayCopyEx() {
		char[] src = "Java Programming".toCharArray();
		System.out.println(Arrays.toString(src));
		
		char[] target = new char[src.length];
		System.arraycopy(src, 0, 
						target, 0, 
						src.length);
		System.out.println(Arrays.toString(target));
		
		target = Arrays.copyOf(src, 5);
		System.out.println(Arrays.toString(target));
		
		target = Arrays.copyOfRange(src, 5, 12);
		System.out.println(Arrays.toString(target));
		
	}

	private static void equalsEx() {
		// 배열의 얕은 비교
		// -> 배열의 요소 값을 단순 비교
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] nums3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		
		System.out.println("nums1 vs nums2 : " + Arrays.equals(nums1, nums2));
		System.out.println("nums1 vs nums3 : " + Arrays.equals(nums1, nums3));
	}
	
}
