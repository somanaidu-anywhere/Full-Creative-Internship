package Month1_week1.inheritance;

public class Bike extends Vehicle{
	public String handleTye;
	public Bike() {
		super();
	}
	public void start() {
		System.out.println("Bike started with a kick");
	}
	public void show() {
		super.start();
		System.out.println("It is show of Bike");
		this.start();
	}
}