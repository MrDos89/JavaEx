package com.javaex.oop.point.v4;

//v3. 메서드 오버로딩
class Point {
	// 필드
	protected int _x;	// 상속 받은 자식에서 접근 허용
	protected int _y;
	
	//기본 생성자
//	public Point() {
//		
//	}
//	
	public Point(int x, int y) {
		this._x = x;
		this._y = y;
	}
	
	// Getters, Setters
	public int getX() {
		return _x;
	}
	
	public void setX(int x) {
		this._x = x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setY(int y) {
		this._y = y;
	}
	
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", _x, _y);
	}
	
	// 메서드 오버로딩
	// 한 클래스 내에 같은 이름을 가진 메서드
	// 각 메서드는 매개변수의 타입, 순서, 갯수에 따라 구별
	public void draw(boolean bShow) {
		String message = String.format("점[x=%d, y=%d]을 ", _x, _y);
		message += bShow ? "그렸습니다.%n" : "지웠습니다.%n";
		
		System.out.printf(message);
	}
}

// 포인트 상속 받아 ColoPoint 클래스
class ColorPoint extends Point {
	// 필드
	// x, y, draw는 상속 받음
	private String color;
	
//	public ColorPoint() {
//		// 특별히 지정하지 않으면 부모의 기본 생성자 super()를 선택한다.
//		// 부모가 기본 생성자가 없는 상태이면서 자식이 생성자를 지정안하면 에러가 뜸
//		super();
//	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint(String color) {
		super(0,0);
		this.color = color;
	}
	
	// getters, setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// draw 메서드를 상속받았으나 약간 부족하니 새로 선언한다.
	@Override
	public void draw() {
//		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", super.getX(), super.getY(), color);
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.%n", _x, _y, color);
	}
	
	@Override
	// annotation 종류인 @Override는 컴파일러가 해당 함수가 부모에 있는지 체크해주는 역할 -> 인간의 실수를 줄여준다
	public void draw(boolean bShow) {
		String message = String.format("색상점[x=%d, y=%d, color=%s]을 ", _x, _y, color);
		message += bShow ? "그렸습니다.%n" : "지웠습니다.%n";
		
		System.out.printf(message);
		
		// 오버라이드 했지만 부모의 기능을 사용해야 할 때
		super.draw(bShow);
	}
}

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 5);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
		Point p2 = new Point(10, 23);
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
	}

}
