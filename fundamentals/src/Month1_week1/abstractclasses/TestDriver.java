package Month1_week1.abstractclasses;

public class TestDriver {

	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		startVehicle(vehicle);
	}

	private static void startVehicle(Vehicle vehicle) {
		vehicle.start();
	}

}
