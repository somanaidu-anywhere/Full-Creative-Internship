package Month1_week1.inheritance;

public class TestDriver {
public static void main(String[] args) {
	Bike bike = new Bike();
	
	//code reuse
	bike.instructions();
	System.out.println(bike.noOfWheels);
	
	//method overriding
	bike.start();
}
}
