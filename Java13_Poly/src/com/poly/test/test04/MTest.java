package com.poly.test.test04;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Dog dog = new Dog();
		dog.bark();
		dog.bite();
		dog.eat("개껌");
		
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.bark();
		eagle.eat("고기");
	}

}
