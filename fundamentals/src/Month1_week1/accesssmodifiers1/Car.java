package Month1_week1.accesssmodifiers1;

import Month1_week1.accesssmodifiers.Vehicle;

public class Car extends Vehicle{
	public Car()
	{
		super();
	}
	public Car(int noOfWheels, double speed, String fuelType, char grade) {
		super(noOfWheels, speed, fuelType, grade);
	}
	public static void main(String[] args) {
		Car thar = new Car();
		thar.display();
	}
	public void display() {
		System.out.println(noOfWheels);
		
		System.out.println(speed);
		
		//default cannot be accessed out of the package
		//System.out.println(fuelType);
		//private cannot be accessed out of the class
		//System.out.println(grade);
	}
}
