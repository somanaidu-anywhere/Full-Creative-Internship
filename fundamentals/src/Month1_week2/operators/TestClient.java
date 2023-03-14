package Month1_week2.operators;

public class TestClient {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		//arithmetic operators
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//assignment operators
		a = 5;
		System.out.println(a);
		a += 6; // a = a+6;
		System.out.println(a);
		a -= 3; // a = a-3;
		System.out.println(a);
		a *= 5; // a = a*5;
		System.out.println(a);
		a /= 2; // a = a/2;
		System.out.println(a);
		a %= 5; // a = a%5;
		System.out.println(a);
		
		//relational operators
		b = 10;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//logical operators
		boolean bool = (a==b) && (a>b);
		System.out.println(bool);
		bool = (a!=b) || (a>b);
		System.out.println(bool);
		bool = !(a==b);
		System.out.println(bool);
		
		//increment operator
		a = 10;
		System.out.println(a++);
		System.out.println(a);
		a=5;
		System.out.println(++a);
		System.out.println(a);
		
		//decrement operator
		a = 10;
		System.out.println(a--);
		System.out.println(a);
		a=5;
		System.out.println(--a);
		System.out.println(a);
		
		//Ternary Operator
		a=10;
		String s = a%2==0 ? "Even" : "Odd";
		System.out.println(s);
	}

}
