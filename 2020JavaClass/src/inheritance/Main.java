package inheritance;

import java.util.ArrayList;
import java.util.Random;

import structure.Animal;
import structure.Cat;
import structure.Dog;

public class Main {
	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<Animal> list = new ArrayList<Animal>();

		for (int i = 0; i < 10; i++) {
			if (random.nextInt(100) < 50) {
				Dog dog = new Dog();
//				dog.name = "강아지" + i;
				dog.setName("강아지" + i);
				list.add(dog);

			} else {
				Cat cat = new Cat();
//				cat.name = "고양이" + i;
				cat.setName("고양이" + i);
				list.add(cat);
			}
		}
		
		for (Animal animal : list) {
			animal.breath();
		}

//		Dog dog = new Dog();
//		
//		dog.name = "gondr";
//		dog.introduce();
//		dog.bark();
//		dog.breath();
//		
//		Cat cat = new Cat();
//		
//		cat.name = "catdr";
//		cat.introduce();
//		cat.bark();
//		cat.breath();
	}
}
