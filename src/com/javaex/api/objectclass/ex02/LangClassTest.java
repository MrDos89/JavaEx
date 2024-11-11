package com.javaex.api.objectclass.ex02;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
	}

}
