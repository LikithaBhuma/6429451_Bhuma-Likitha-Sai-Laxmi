package Projects;
interface Playable {
	void play();
}
class Guitar implements Playable {
	@Override
	public void play() {
		System.out.println("Strumming the guitar ");
	}
}
class Piano implements Playable {
	@Override
	public void play() {
		System.out.println("Playing the piano ");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Playable guitar = new Guitar();
		Playable piano = new Piano();
		guitar.play();
		piano.play();
	}
}
