package ch07;

public class AnimalExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
