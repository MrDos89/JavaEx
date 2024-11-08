package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		추상클래스는 부모로써만 존재한다. 직접 구체화할 순 없다.
//		Shape s = new Shape();
	
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();

	}

}
