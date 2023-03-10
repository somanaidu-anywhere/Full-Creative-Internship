package Month1_week1.polymorphism;

public class TestDriver {

	public static void main(String[] args) {
		//Object polymorphism
		Vehicle vehicle=null;
		int n=0;
		if(n>10) {
			vehicle = new Car();
		}
		else {
			vehicle = new Bike();
		}
		vehicle.start();
		
		
		//method overriding
		Car c = new Car();
		c.start();

		//method overloading
		System.out.println(getSum(5,7));
		System.out.println(getSum(5,7,9));
		System.out.println(getSum(5.9,7));


}
	
	public static int getSum(int a, int b)
	{
		return a+b;
	}
	public static int getSum(int a, int b, int c)
	{
		return a+b+c;
	}
	public static double getSum(double a, double b)
	{
		return a+b;
	}
	public static double getSum(double a, int b)
	{
		return a+b;
	}
}
