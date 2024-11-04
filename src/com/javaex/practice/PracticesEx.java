package com.javaex.practice;

import java.util.Calendar;
import java.util.Scanner;

public class PracticesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice10();
	}
	
	private static void practice01() {
		// 조건문에 비교하기 전에 항상 초기화가 되어야한다.
		int i, j = 0;
		String name = "";
		
//		if(i = 0) // C 언어에선 해당 조건문이 무조건 true로 나오기 때문에 해당 이슈를 피하기 위해 숫자를 먼저 표기하기도 하지만 여기선 그냥 에러 
//		{
//			
//		}
		if (j < 10 ) {
			
		}
		switch('A') {
		
		}
		switch("A") {
		
		}
		
		if(name == "홍길동") {
			
		}
		
	}
	
	private static void practice02() {
		boolean isTrue = true;	// 안됨
		char charVar = 'a';		// 됨
		byte byteVar = 0;		// 됨
		short shortVar = 0;		// 됨
		int intVar = 0;			// 됨
		long longVar = 0;		// 안됨
		float floatVar = 0;		// 안됨
		double doubleVar = 0;	// 안됨
		String stringVar = "";	// 됨
		
		switch(stringVar)
		{
		
		}
			
	}
	
	private static void practice03() {
		int age = 15;
		
		if(age > 0 && age < 18)
		{
			System.out.println("청소년 입니다.");
		}
	}
	
	private static void practice04() {
		int x = 0;
		
		if(x == 0) {
			System.out.println("X는 0이다.");
		}
	}
	
	private static void practice05() {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.print("\"1번그룹\"");
		} else {
			System.out.print("\"2번그룹\"");
		}
		
		System.out.print("입니다.");
		
		
		sc.close();
	}
	
	private static void practice06() {
		int age;
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		System.out.println("나이: " + age);
		
		if(age >= 19 || age < 65) {
			System.out.print("1번그룹");
		} else {
			System.out.print("2번그룹");
		}
		System.out.print(" 입니다.");
		
		sc.close();
	}
	
	private static void practice07() {
		int age;
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age >= 0) {
			if(age <= 7) {
				System.out.println("취학전아동//무료 입니다.");
			} else if(age <= 13) {
				System.out.println("초등학생//2000원 입니다.");
			} else if(age <= 16) {
				System.out.println("중학생//3000원 입니다.");
			} else if(age <= 19) {
				System.out.println("고등학생//4000원 입니다.");
			} else {
				System.out.println("성인//5000원 입니다.");
			}
		} else {
			System.out.println("잘못된 나이입니다.");
		}
		
		sc.close();
	}
	
	private static void practice08() {
		
		Scanner sc = new Scanner(System.in);
		int height, weight = 0;
		
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키:");
		height = sc.nextInt();
		System.out.print("몸무게:");
		weight = sc.nextInt();
		
		float bmiNum = (float)weight / height;
		
		if(bmiNum < 18.5F) {
			System.out.println("저체중입니다.");
		} else if (bmiNum > 24.9F) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("정상체중입니다.");
		}
		
		sc.close();
	}
	
	private static void practice09() {	
		// 1970년부터 얼마나 지났는지를 가져옴  
		long curTime = System.currentTimeMillis();
		// Calendar를 통해 현재 시간을 구함
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(curTime);
		// 캘린더에 저장된 숫자들 중 연도를 가져옴 (현재 년도)
		int curYear = c.get(Calendar.YEAR);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		Scanner sc = new Scanner(System.in);
		int bornYear = sc.nextInt();
		int age = curYear - bornYear;
		
		if(age < 15 || age >= 65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다");
		} else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();
	}
	
	private static void practice10() {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰수: " + num1 + "\t\t작은수: " + num2 + "입니다.");
		} else if(num1 < num2) {
			System.out.println("큰수: " + num2 + "\t\t작은수: " + num1 + "입니다.");
		} else {
			System.out.println("두 숫자는 같습니다.");
		}
		
		sc.close();
		
	}
	
	private static void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.print("몫: " + num1 / num2);
			System.out.print("나머지: " + num1 % num2);			
		} else {
			System.out.print("몫: " + num2 / num1);
			System.out.print("나머지: " + num2 % num1);
		}
		
		sc.close();
	}

	private static void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		int minValue = Math.min(num1, Math.min(num2, num3));
		
		if(num1 == minValue) {
			System.out.println("가장 작은수는 " + num1 + "입니다.");
		} else if (num2 == minValue) {
			System.out.println("가장 작은수는 " + num2 + "입니다.");
		} else if  (num3 == minValue) {
			System.out.println("가장 작은수는 " + num3 + "입니다.");
		} else {
			System.out.println("Error");
		}
		
		sc.close();
	}
	
	private static void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		//만약 앞에 숫자가 더 크다면 둘이 바꿔줘서 앞숫자가 나머지 연산 때 큰수가 되도록 무조건
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		
		if(num1 % num2 == 0) {
			System.out.println(num2 + " 는(은) " + num1 + "의 약수입니다.");
		} else {
			System.out.println(num2 + " 는(은) " + num1 + "의 약수가 아닙니다.");
		}
		
		sc.close();
	}
	
	private static void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		
		int num1 = sc.nextInt();
		char team = 'A';
		
		switch(num1 % 3)
		{
			case 0:
				team = 'A';
				break;
			case 1:
				team = 'B';
				break;
			case 2:
				team = 'C';
				break;
			default:
				team = 'Z';
				break;
		}
		
		if(team == 'Z') {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println(team + "팀입니다.");
		}
		
		sc.close();
	}
	
	private static void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		char sign = (sc.next()).charAt(0);
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if(sign == '/' && num2 == 0) {
			System.out.println("계산할 수 없습니다.");
		}
		
		if(sign != '+' && sign != '-' && sign != '*' && sign != '/') {
			System.out.println("계산할 수 없는 기호 입니다.");
		}
		
		double result = 0;
		
		switch(sign)
		{
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			break;
		}
		
		System.out.println("결과는: " + String.format("%.1f", result));
		
		sc.close();
	}
	
	private static void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		double num1 = sc.nextInt();
		double result = 0;
		
		if(num1 > 0) {
			result = Math.pow(num1, 3) - (9 * num1) + 2;
		} else {
			result = (7 * num1) + 2;
		}
		
		System.out.println("계산결과는 " + String.format("%.1f", result) + " 입니다.");
		
		sc.close();
	}
	
	private static void practice17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요. (기준단위: 만원)");
		System.out.print("수익: ");
		int num1 = sc.nextInt();
		double result = 0;
		
		
		if (num1 < 0) {
			System.out.println("수익을 잘못 입력하셨습니다.");
			
			sc.close();
			return;
		}
		
		if (num1 <= 1000) {
			result = num1 * 0.09;
		} else if (num1 <= 4000) {
			result = (1000 * 0.09) + (0.18 * (num1 - 1000));
		} else if (num1 <= 8000) {
			result = (1000 * 0.09) + (3000 * 0.18) + (0.27 * (num1 - 4000));
		} else {
			result = (1000 * 0.09) + (3000 * 0.18) + (4000 * 0.27) + (0.36 * (num1 - 8000));
		}
		
		System.out.println("소득세는 " + String.format("%.1f", result) + " 입니다.");
		
		sc.close();
	}
	
	private static void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char char1 = (sc.next()).charAt(0);
		String result = "";
		
		switch(char1) 
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				result = "모음입니다.";
				break;
			default:
				result = "자음입니다.";
				break;
		
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
	private static void practice19() {
		// 1970년부터 얼마나 지났는지를 가져옴  
		long curTime = System.currentTimeMillis();
		// Calendar를 통해 현재 시간을 구함
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(curTime);
		// 캘린더에 저장된 숫자들 중 연도를 가져옴 (현재 년도)
		int curYear = c.get(Calendar.YEAR);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		Scanner sc = new Scanner(System.in);
		int bornYear = sc.nextInt();
		int age = curYear - bornYear;
		
		if(age < 15 || age >= 65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다");
		} else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();
	}
	
	private static void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char char1 = (sc.next()).charAt(0);
		String result = "";
		
		if( char1 == 'a' ||
			char1 == 'e' || 
			char1 == 'i' || 
			char1 == 'o' || 
			char1 == 'u' ) 
		{
			result = "모음입니다.";
		} 
		else 
		{
			result = "자음입니다.";
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
	private static void practice21() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		
		int num1 = sc.nextInt();
		char team = 'A';
		
		if(num1 == 0) {
			System.out.println("잘못된 사번입니다.");
			sc.close();
			
			return;
		}
		
		switch(num1 % 3)
		{
			case 0:
				team = 'A';
				break;
			case 1:
				team = 'B';
				break;
			case 2:
				team = 'C';
				break;
			default:
				team = 'Z';
				break;
		}
		
		if(team == 'Z') {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println(team + "팀입니다.");
		}
		
		sc.close();
	}
	
	private static void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		int maxValue = Math.max(num1, Math.max(num2, num3));
		
		if(num1 == maxValue) {
			System.out.println("가장 큰수는 " + num1 + "입니다.");
		} else if (num2 == maxValue) {
			System.out.println("가장 큰수는 " + num2 + "입니다.");
		} else if  (num3 == maxValue) {
			System.out.println("가장 큰수는 " + num3 + "입니다.");
		} else {
			System.out.println("Error");
		}
		
		sc.close();
	}
	
	private static void practice23() {
		// 1970년부터 얼마나 지났는지를 가져옴  
		long curTime = System.currentTimeMillis();
		// Calendar를 통해 현재 시간을 구함
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(curTime);
		// 캘린더에 저장된 숫자들 중 연도를 가져옴 (현재 년도)
		int curYear = c.get(Calendar.YEAR);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		
		Scanner sc = new Scanner(System.in);
		int bornYear = sc.nextInt();

		int age = curYear - bornYear;
		
		System.out.println("올해: " + curYear);
		System.out.println("태어난해: " + bornYear);
		System.out.println("나이: " + age);
		
		System.out.println("======================================");
		
		if(age < 20) {
			System.out.println(age + "살미만 건강검진대상이 아님");
		} else {
			System.out.println(age + "살이상");
			System.out.print("건강검진해");
			if(curYear % 2 == 0) {
				if(bornYear % 2 != 0) {
					System.out.println("\t아님");
				} else {
					System.out.println();
				}
			} else {
				if(bornYear % 2 == 0) {
					System.out.println("\t아님");
				} else {
					System.out.println();
				}
			}
			
			if(age >= 40) {
				System.out.println("암 검사");
			}
		}
		
		sc.close();
	}
}
