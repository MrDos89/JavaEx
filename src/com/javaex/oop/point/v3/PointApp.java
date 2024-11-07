package com.javaex.oop.point.v3;

//v3. 메서드 오버로딩
class Point {
	// 필드
	private int _x;
	private int _y;
	
	//기본 생성자
	public Point() {
		
	}
	
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
	public void Draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", _x, _y);
	}
	
	// 메서드 오버로딩
	// 한 클래스 내에 같은 이름을 가진 메서드
	// 각 메서드는 매개변수의 타입, 순서, 갯수에 따라 구별
	public void Draw(boolean bShow) {
		String message = String.format("점[x=%d, y=%d]을 ", _x, _y);
		message += bShow ? "그렸습니다.%n" : "지웠습니다.%n";
	}
}

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 5);
		p1.Draw();
		p1.Draw(true);
		p1.Draw(false);
		
		Point p2 = new Point(10, 23);
		p2.Draw();
		p2.Draw(true);
		p2.Draw(false);
	}

}
