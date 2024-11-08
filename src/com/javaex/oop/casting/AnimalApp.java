package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// Upcasting : 부모타입으로 자식 인스턴스(객체)를 참조
		Animal dog1 = new Dog("Snoopy");
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 참조 타입의 설계도에 있는 거만 사용
//		((Dog)dog1).bark(); // 다운캐스팅
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		// Downcating : 부모 타입으로 참조되던 타입을 원래대로 되돌리는 것
		((Dog)pet).bark();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		// 이러면 망함... 캐스팅할 떄 주의해야된다
//		((Dog)pet).bark();
		// 캐스팅 시 해당 객체가 캐스팅 가능 객체인지 확인
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
