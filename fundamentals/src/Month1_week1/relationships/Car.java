package Month1_week1.relationships;

public class Car extends Vehicle{
	public String steeringType;
	public Engine engine;
	//public Wheel wheel;
	public void start() {
		System.out.println("Car started with a key");
	}
	public Car() {
		this.engine = new Engine();
	}
}