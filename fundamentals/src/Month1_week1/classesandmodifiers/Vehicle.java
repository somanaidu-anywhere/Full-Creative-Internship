package Month1_week1.classesandmodifiers;

public class Vehicle {
	int noOfWheels;
	double speed;
	String fueType;
	public Vehicle(int noOfWheels, double speed, String fueType) {
		super();
		this.noOfWheels = noOfWheels;
		this.speed = speed;
		this.fueType = fueType;
	}
	public void start() {
		System.out.println("Vehicle has started");
	}
	public void run() {
		System.out.println("Vehicle is running");
	}
	public void stop() {
		System.out.println("Vehicle stopped");
	}
	public void park() {
		System.out.println("Vehicle parked");
	}
}
