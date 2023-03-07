package Month1_week1.accesssmodifiers;

public class Test {
	public static void main(String[] args) {
		Vehicle car = new Vehicle(4,155.7,"petrol",'a');
		
		//public can be accessible everywhere
		System.out.println(car.noOfWheels);
		
		//protected can be accessed within the package and out of the package through sub classes
		System.out.println(car.speed);
		
		//default can be accessed within the package
		System.out.println(car.fuelType);
		
		//private cannot be accessed out of the class
		//System.out.println(car.grade);
		
		// for protected modifier we have accessmodifiers2 package
	}
	

}
