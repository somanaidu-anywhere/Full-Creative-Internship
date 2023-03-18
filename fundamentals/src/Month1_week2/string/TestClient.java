package Month1_week2.string;

public class TestClient {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		String s3 = new String("Hello");
		System.out.println(s1==s3);
		
		
		String st =null;
		System.out.println(st==s2);
		
		//String methods
		String str = "I love Java Programming.";
		
		System.out.println(str.length());
		System.out.println(str.endsWith("."));
		System.out.println(str.equals("Java"));
		System.out.println(s1.equalsIgnoreCase("hello"));
		System.out.println(str.compareTo("Java"));
		System.out.println(str.compareToIgnoreCase("java"));
		System.out.println(str.contains("Java"));
		System.out.println(str.charAt(15));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('g',16));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.replace("ov","ik"));
		System.out.println(str.replaceAll("a","@"));
		String[] words = str.split(" ");
		System.out.println(String.join("#", words));
		System.out.println(s2.substring(1));
		System.out.println(str.substring(7,12));
		
		System.out.println(str.replace('o', 'O'));
		System.out.println(str.replaceFirst("o","M"));
		String k = "fdsj5j9";
		System.out.println(k.replaceAll("\\d", "D"));
	}

}
