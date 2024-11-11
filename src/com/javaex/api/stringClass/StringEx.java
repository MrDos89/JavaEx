package com.javaex.api.stringClass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
//		usefulMethods();
		stringBufferEx();
	}
	
	private static void stringBasic() {
		String s1= "Java";				// 리터럴
		String s2 = new String("Java");	// 메모리에 새로 만들기
		String s3;
		s3 = "Java"; 					// 리터럴
		
		System.out.println(s1 == s2);	// 주소 비교
		System.out.println(s1 == s3);	// 주소 비교
		
		// 문자열 배열로 String 생성
		char[] letters = {'J', 'a', 'v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', '!' };
		
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(s4.length());
	}
	
	private static void usefulMethods() {
		//유용한 메서드들
		String str = "Is Java Programming, JavaScript Programming Fun?";
		
		// 문자열의 길이
		System.out.println(str.length());
		
		// 변환 메서드
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// 검색 관련 메서드
		System.out.println(str.charAt(5));
		
		//자바가 어느 인덱스인지?
		int pos = str.indexOf("Java"); // 문자열 내부에서 Java의 위치
		
		System.out.println("1st search Java: " + pos);
		pos = str.indexOf("Java", pos + 4);
		System.out.println("2nd search Java: " + pos);
		pos = str.indexOf("Java", pos + 4);
		System.out.println("3rd search Java: " + pos); // 검색할 부분문자열이 없으면 -1 리턴
		pos = str.lastIndexOf("Java");
		System.out.println("Last order search Java: " + pos);
		
		// 문자열 추출 
		System.out.println("SUBSTRING: " + str.substring(3));
		System.out.println("SUBSTRING: " + str.substring(5, 16));
		
		// 문자열 치환
		System.out.println("REPLACE: " + str.replace("Programming", "Coding"));
		
		// trimming : 화이트 스페이스 제거
		String s6 = "             Hello                ";
		String s7 = ", Java";
		System.out.println(s6 + s7);
		
		s6 = s6.trim();
		System.out.println(s6 + s7);
		
		// 문자열 분리 : split()
		String[] tokens = str.replace(",", "").split(" ");
		System.out.println("SPLIT:" + Arrays.toString(tokens));
		
		// 문자열 비교: Unicode
		// CompareTo (매우중요)
		// -> 0이면 순번이 같다. 값이 작으면 음수, 값이 크면 양수
		System.out.println("ABC".compareTo("ABD"));	
	}
	
	private static void stringBufferEx() {
		// String 클래스는 immutable
		// StringBuffer 클래스는 mutable
		// 내부적으로 버퍼를 통해서 문자열을 만들고
		// 최종적으로 String을 반환
		
		// 버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		
		// 문자열 추가
		sb.append(" is pencil.");
		// 문자열 삽입
		sb.insert(7, " my");
		// 문자열 치환
		sb.replace(8, 10, "your");
		
		System.out.println(sb);
		
		// 버퍼 길이 변경
		sb.setLength(10);
		System.out.println(sb);
		
		// 매서드 체이닝 기법 활용 가능
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		String s = sb2.toString(); // 문자열로 변환
		System.out.println(s);
	}
}