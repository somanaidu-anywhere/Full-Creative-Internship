package Month1_week1.wrapperclasses;

public class TestDriver {

	public static void main(String[] args) {
		
		//autoboxing
		int intP1 =10;
		Integer intObj1 = intP1;
		System.out.println(intObj1);
		
		//unboxing
		Integer intObj2 = new Integer(9);
		int intP2 = intObj2;
		System.out.println(intP2);
		
		Integer intObj3 = Integer.valueOf(intP2);
		System.out.println(intObj3);
		int intP3 = intObj3.intValue();
		System.out.println(intP3);
		
		char charP1 = 'p';
		Character charObj1 = charP1;
		System.out.println(charObj1);
		
		Character charObj2 = new Character('q');
		char charP2 = charObj2;
		System.out.println(charP2);
		
		char charP3 = charObj2.charValue();
		System.out.println(charP3);
		Character charObj3 = Character.valueOf(charP2);
		System.out.println(charObj3);
		
		
		
	}

}
