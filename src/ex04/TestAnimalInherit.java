package ex04;

class Pet {
	String  name;
	void     eat() {
		System.out.println(name + " (이)가 먹는다");
	}
	
}

class Dog extends Pet {
	void    bark() {
		System.out.println(name + " (이)가 멍멍");		
	}
}

class Cat extends Pet {
	void    meow() {
		System.out.println(name + " (이)가 야옹");				
	}
}

public class TestAnimalInherit {
	
	// 상속 : Inherit -> java 에서는 extends 로 처리
	// 다중상속 불가능 (상속은 한개만 가능) -> Java, C#
	public static void main(String[] args) {
		
		Pet pet  = new Pet();
		pet.name = "구피";
		pet.eat();
		
		
		Dog dog  = new Dog();
		dog.name = "츄";
		dog.eat();
		dog.bark();
		
		
		Cat nero  = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		

	}

}
