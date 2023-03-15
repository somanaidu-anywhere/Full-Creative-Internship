package Month1_week2.exceptions;

public class TestClient2 {

	public static void main(String[] args){
		int a=0;
		int b=5;
		
		try {
		show();
		}
		catch(ArithmeticException ae) {
			System.out.println("It is Arithmetic exception");
		}
	}
	public static void getException() throws ArithmeticException{
		try {
		throw new ArithmeticException();
		}
		finally {
			System.out.println("Finally...");
		}
	}
	public static void show() throws ArithmeticException{
		getException();
	}

}
