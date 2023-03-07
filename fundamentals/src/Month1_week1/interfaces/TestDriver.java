package Month1_week1.interfaces;

public class TestDriver {
	public static void main(String[] args) {
		
		//calling static method
		TwoDshape.takeBoard();
		
		Shape shape = new Square();
		drawShape(shape);
		
		//calling default method
		shape.display();
		
	}

	private static void drawShape(Shape shape) {
		shape.draw();
	}
}
