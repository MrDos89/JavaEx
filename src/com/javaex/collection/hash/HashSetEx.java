package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;

class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// 두 객체의 동등성 체크
	// 1. hashCode() 값을 비교
	// 2. equals()로 내부 데이터 비교
	
	@Override
	public int hashCode() {
		return id; // 학번을 hashCode로 쓴다.
		// 여기를 통과하면 equal로 내부 데이터 비교
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			// 다운캐스팅 가능
			Student other = (Student)obj;
			return id == other.id && name.equals(other.name);
		}
		
		return super.equals(obj);
	}
}


public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		setOperation();
		usingHashSetWithCustom();
	}
	
	private static void setOperation() {
		HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		HashSet<Integer> odds = new HashSet<>(Arrays.asList(1,3,5,7,9));
		HashSet<Integer> evens = new HashSet<>(Arrays.asList(2,4,6,8,10));
		HashSet<Integer> mthree = new HashSet<>(Arrays.asList(3,6,9));
		
		System.out.println("===== 교집합");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mthree.clone();
		
		System.out.println("집합A: " + setA);
		System.out.println("집합B: " + setB);
		
		// 홀수 교집합 3의배수
		setA.retainAll(setB); // 교집합
		System.out.println("교집합: " + setA);
		
		setA = (HashSet<Integer>)odds.clone();
		setB = (HashSet<Integer>)evens.clone();
		
		System.out.println("집합A: " + setA);
		System.out.println("집합B: " + setB);
		
		setA.addAll(setB);
		System.out.println("합집합: " + setA);
		System.out.println(setA.equals(numbers));
		
		System.out.println("======= 차집합");
		
		setA = (HashSet<Integer>)numbers.clone();
		setB = (HashSet<Integer>)odds.clone();

		System.out.println("집합A: " + setA);
		System.out.println("집합B: " + setB);
		
		setA.removeAll(setB);			// 집합A 차집합 집합B
		System.out.println("차집합: " + setA);
		System.out.println(setA.equals(evens));
	}

	private static void usingHashSetWithCustom() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student(10, "홍길동");
		Student s2 = new Student(20, "홍길동");
		Student s3 = new Student(30, "고길동");
		Student s4 = new Student(30, "고길동");
		
		
		// s3, s4는 같은 
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println("학생부:" + hs);
	}
}
