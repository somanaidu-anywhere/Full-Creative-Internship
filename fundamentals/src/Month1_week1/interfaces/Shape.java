package Month1_week1.interfaces;

public interface Shape {
	void draw();
	public default void display()
	{
		System.out.println("It is a shape.");
	}
}
