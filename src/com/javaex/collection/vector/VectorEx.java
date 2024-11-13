package com.javaex.collection.vector;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언
		Vector v = new Vector(10);
		
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		// 1부터 10까지 값을 담아봅시다.
		for(int i = 1; i <= 10; ++i) {
			v.addElement(i);
		}
		
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		v.addElement(11); // 넘치니깐 용량이 자동으로 늘어난다
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		// 중간에 값을 삽입
		System.out.println(v);
		v.insertElementAt(12, 7);
		System.out.println(v);
		
		// 객체 조회
		int pos = v.indexOf(12);
		System.out.println(pos);
		int val = (Integer)v.elementAt(pos);
		System.out.println(val);
		
		// 내용을 하나씩 불러와서 출력
		for(int i = 0; i < v.size(); ++i) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item+"\t");
		}
		System.out.println();
		
		// Enhanced for
		for (Object item: v) {
			System.out.print((Integer)item + "\t");
		}
		System.out.println();
		
		// 포함 여부 확인
		System.out.print(v.contains(10));
		
		v.remove(10);
		System.out.println(v);
		
		// Generic 활용
		//숫자만 담을 수 있는 벡터 생성
		Vector<? super Number> v2 = new Vector();
		
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159F));
//		v2.addElement(new String("Java")); // 이건 안 담김
		
		System.out.println(v2);
		
	}

}
