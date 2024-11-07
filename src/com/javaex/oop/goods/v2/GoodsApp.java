package com.javaex.oop.goods.v2;

class Goods {
	
	public String getName() { return _name; };
	public int getPrice() { return _price; };
	
	// this -> 현재 인스턴스 자체
	public void setName(String name) { this._name = name; }
	public void setPrice(int price) { this._price = price; }

	public void showInfo() {
		System.out.printf("%s -> %,d%n", this._name, this._price);
	}
	
	private String _name;
	private int _price;
}

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.setName("Nikkon");
		camera.setPrice(400_000);
		
//		System.out.printf("%s -> %,d%n", camera.getName(), camera.getPrice());
		camera.showInfo();
		
		Goods notebook = new Goods();

		notebook.setName("LG 그램");
		notebook.setPrice(900_000);
		
//		System.out.printf("%s -> %,d%n", notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		
		Goods mug = new Goods();

		mug.setName("머그컵");
		mug.setPrice(2_000);
		
//		System.out.printf("%s -> %,d%n", mug.getName(), mug.getPrice());
		mug.showInfo();
	}
}
