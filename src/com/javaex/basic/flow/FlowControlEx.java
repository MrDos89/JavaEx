package com.javaex.basic.flow;

public class FlowControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		continueEx();
		breakEx();
	}
	
	private static void continueEx() {
		// continue:반복 블록 내부에서 남아있는 문장을 실행하지 않고 다음번 루프로 진행
		// 1 ~ 100 루프를 돌면서 2의 배수와 3의 배수가 아닌 숫자만 출력
		
		for(int i = 1; i <= 100; ++i) {
			if((i % 2 == 0) && (i % 3 == 0))
				continue;
			
			System.out.println(i);
		}
	}
	
	private static void breakEx() {
		// break: 루프를 돌다가 조건이 맞으면 탈출
		// 루프를 돌면서 6과 14의 최소공배수를 단순무식하게 구하는 법
		
		int num = 1;
		
		while (true) {
			if(num % 6 == 0 && num % 14 == 0)
				break;
			
			++num;
		}
		
		System.out.println("6과 14의 최소공배수 : " + num);
	}

}
