package Month1_week1.relationships;

public class TestDriver {

	public static void main(String[] args) {
		
		//Bike is a vehicle
		Bike bike = new Bike();
		bike.instructions();
		
		//Car is a Vehicle and Car has an Engine
		Car car = new Car();
		car.engine.work();
	}

}
