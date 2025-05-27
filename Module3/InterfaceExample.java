package Projects;
//Define the Playable interface
interface Playable {
	void play(); // Abstract method to be implemented by classes
}

//Implement the interface in Guitar class
class Guitar implements Playable {
	@Override
	public void play() {
		System.out.println("Strumming the guitar 🎸");
	}
}

//Implement the interface in Piano class
class Piano implements Playable {
	@Override
	public void play() {
		System.out.println("Playing the piano 🎹");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
     // Instantiate objects
		Playable guitar = new Guitar();
		Playable piano = new Piano();

     // Call play method
		guitar.play();
		piano.play();
	}
}
