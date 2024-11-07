package com.javaex.oop.point.v2;

//v1
class Point {
	// 필드
	private int _x;
	private int _y;
	
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
	
	public void Draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", _x, _y);
	}
}

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
