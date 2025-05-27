package Projects;
//Base class
class Animal {
	public void makeSound() {
		System.out.println("Some generic animal sound...");
	}
}

//Subclass inheriting from Animal
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
     // Instantiate base class
		Animal genericAnimal = new Animal();
     // Instantiate subclass
		Dog myDog = new Dog();

     // Call methods
		genericAnimal.makeSound();  // Calls Animal's makeSound()
		myDog.makeSound();          // Calls Dog's overridden makeSound()
	}
}
