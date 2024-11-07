package com.javaex.oop.goods.v3;


// Goods v3. 생성자
// 생성자가 만들어져 있지 않으면 JVM이 기본 생성자를 끼워넣는다
// 만약 개발자가 생성자를 만들면 JVM은 기본생성자를 끼워넣지 않는다.
class Goods {
	//필드
	private String _name;
	private int _price;
	//생성자
	public Goods(String name, int price) {
		this._name = name;
		this._price = price;
	}
	
	public String getName() { return _name; };
	public int getPrice() { return _price; };
	
	// this -> 현재 인스턴스 자체
	//Setter가 없으면 Read-Only로 만들 수 있다.
//	public void setName(String name) { this._name = name; }
//	public void setPrice(int price) { this._price = price; }

	public void showInfo() {
		System.out.printf("%s -> %,d%n", this._name, this._price);
	}
	
}

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods("Nikkon", 400_000);
		camera.showInfo();
		
		Goods notebook = new Goods("LG 그램", 900_000);
		notebook.showInfo();
		
		Goods mug = new Goods("머그컵", 2_000);
		mug.showInfo();
	}
}
