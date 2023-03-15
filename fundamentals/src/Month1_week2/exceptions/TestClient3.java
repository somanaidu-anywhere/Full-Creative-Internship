package Month1_week2.exceptions;

public class TestClient3 {

	public static void main(String[] args) {
		try {
			System.out.println("custom exception");
			throw new MyException();
		}
		catch(MyException custom) {
			try {
				throw new MyException("Exception inside nested try");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println(custom);
			}
		}
		finally {
		System.out.println("Final.....");
		}
	}
}