package classesandmodifiers;

public class TestDriver {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4,155.7,"petrol");
		car.start();
		car.run();
		car.stop();
		car.park();
	}
}
