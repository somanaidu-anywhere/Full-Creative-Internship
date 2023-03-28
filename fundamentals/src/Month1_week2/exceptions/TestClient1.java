package Month1_week2.exceptions;

public class TestClient1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		try {
			System.out.println(b/a);
		}

		catch(ArithmeticException ae) {
			System.out.println(" / by zero");
		}
		finally {
			System.out.println("Finally stopped!");
		}
	}
}
