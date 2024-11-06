package com.javaex.oop.goods.v1;

class Goods {
	String name;
	int price;
}

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.name = "Nikkon";
		camera.price = 400_000;
		
		System.out.printf("%s -> %,d%n", camera.name, camera.price);
		
		Goods notebook = new Goods();

		notebook.name = "LG 그램";
		notebook.price = 900_000;
		
		System.out.printf("%s -> %,d%n", notebook.name, notebook.price);
		
		Goods mug = new Goods();

		mug.name = "머그컵";
		mug.price = 2_000;
		
		System.out.printf("%s -> %,d%n", mug.name, mug.price);
	}
}