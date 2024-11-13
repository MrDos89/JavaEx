package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// QUEUE 자료형
		// 입력방향과 출력방향이 반대
		// 먼저 입력된 데이터가 먼저 출력
		// First Input First Output: 선입선출
		
		// QUEUE는 인터페이스, 실제 클래스는 LinkedList를 그냥 사용
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= 10; ++i ) {
			queue.offer(i);
			System.out.println("QUEUE: " + queue);
		}
		
		// 출력 방향의 데이터 확인
		System.out.println("PEEK: " + queue.peek());
		
		// 인출
		while(!queue.isEmpty()) {
			System.out.println("PULL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
		}
	}

}
