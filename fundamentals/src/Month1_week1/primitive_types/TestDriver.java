package Month1_week1.primitive_types;

public class TestDriver {
	public static void main(String[] args) {
		//number types
		byte byteVar = 127;
		System.out.println(byteVar);
		System.out.println(++byteVar);
		
		short shortVar = -32768;
		System.out.println(shortVar);
		System.out.println(--shortVar);
		
		int intVar = 45854584;
		System.out.println(intVar);
		
		long longVar = 4574876586854996569L;
		System.out.println(longVar);
		
		//decimal types
		float floatVar = 9.56567f;
		System.out.println(floatVar);
		
		double doubleVar = 898.34334375D;
		System.out.println(doubleVar);
		
		//character type
		char charVar ='h';
		System.out.println(charVar);
		charVar = 67;
		System.out.println(charVar);
		
		boolean booleanVar = true;
		System.out.println(booleanVar);
		
		//Default values for instance variables
		Primitives primitives = new Primitives();
		System.out.println("Default value for byte "+primitives.byteVar);
		System.out.println("Default value for short "+primitives.shortVar);
		System.out.println("Default value for int "+primitives.intVar);
		System.out.println("Default value for long "+primitives.longVar);
		System.out.println("Default value for float "+primitives.floatVar);
		System.out.println("Default value for double "+primitives.doubleVar);
		System.out.println("Default value for char "+primitives.charVar);
		System.out.println("Default value for boolean "+primitives.booleanVar);
	}
}
