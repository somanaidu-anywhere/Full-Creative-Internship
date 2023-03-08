package Month1_week1.type_casting;

public class TestDriver {

	public static void main(String[] args) {
		byte by = 109;
		
		//widening
		int in = by;
		System.out.println(in);
		
		//narrowing
		byte b = (byte) in;
		System.out.println(b);
		
		int a = 343993;
		b = (byte)a;
		System.out.println(b);
		
		//int to float
		a=99999;
		float fl = a;
		System.out.println(fl);
		
		//float to int
		a=(int) fl;
		
		System.out.println(a);
		
		//double to int
		double d = 45485.43d;
		int intV = (int) d;
		System.out.println(intV);
		
		//char to int
		char c = 'z';
		a = c;
		System.out.println(a);
		
		//int to char
		a=100;
		c = (char) a;
		System.out.println(c);
	}

}
