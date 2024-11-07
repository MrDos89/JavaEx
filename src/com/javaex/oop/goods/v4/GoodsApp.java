package com.javaex.oop.goods.v4;

//Goods v4. this
//this -> 현재 인스턴스 자체를 지칭
//this(...) -> 현재 클래스 내부의 다른 생성자를 지칭
class Goods {
	// 필드
	private String _name;
	private int _price;
	// 생성자
	public Goods(String name) {
		this._name = name;
	}
	
	//필수 필드를 생성하는 생성자와 부가적인 필드를 생성하는 생성자를 구분할 때 사용
	public Goods(String name, int price) {
//		this._name = name;
		this(name); // 다른 생성자를 호출
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
