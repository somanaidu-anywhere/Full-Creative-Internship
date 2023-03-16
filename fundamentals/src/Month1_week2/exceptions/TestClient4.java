package Month1_week2.exceptions;

public class TestClient4 {

	public static void main(String[] args) {
		try {
			callA();
		}
		catch(ArithmeticException ar) {
			ar.printStackTrace();
		}
	}

	private static void callA() {
		callB();
	}

	private static void callB() {
		callC();
		
	}

	private static void callC() {
		System.out.println(5/0);
	}
	
}

/*
 | callC() | 
 | callB() | 
 | callA() | 
 | main()  | 
*/