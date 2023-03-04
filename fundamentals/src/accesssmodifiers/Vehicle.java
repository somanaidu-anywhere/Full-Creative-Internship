package accesssmodifiers;

public class Vehicle {
	public int noOfWheels;
	protected double speed;
	String fuelType;
	private char grade;
	public Vehicle()
	{
		
	}
	public Vehicle(int noOfWheels, double speed, String fuelType, char grade) {
		super();
		this.noOfWheels = noOfWheels;
		this.speed = speed;
		this.fuelType = fuelType;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", speed=" + speed + ", fuelType=" + fuelType + ", grade=" + grade
				+ "]";
	}

}
