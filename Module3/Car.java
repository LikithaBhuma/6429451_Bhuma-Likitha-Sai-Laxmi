package Projects;
public class Car {
 // Attributes
	private String make;
	private String model;
	private int year;
 // Constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
 // Method to display car details
	public void displayDetails() {
		System.out.println("Car Details:");
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
	public static void main(String[] args) {
     // Creating objects of Car class
		Car car1 = new Car("Toyota", "Camry", 2022);
		Car car2 = new Car("Honda", "Civic", 2021);
     // Calling method to display details
		car1.displayDetails();
		car2.displayDetails();
 }
}
