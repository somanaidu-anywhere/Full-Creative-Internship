package Month1_week2.stringbuffer;

public class TestClient {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer();
		b1.append("Hi");
		
		System.out.println(b1);
		
		StringBuffer b2 = new StringBuffer("Hi");
		System.out.println(b2);
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.capacity());
		System.out.println(b1.append(" GM"));
		System.out.println(b1.insert(2, " Hello"));
		System.out.println(b1.deleteCharAt(10));
		System.out.println(b1.delete(8,10));
		System.out.println(b1.reverse());
		b1.reverse();
		b1.ensureCapacity(5);
		b1.setCharAt(6, 'L');
		b1.setLength(20);
		System.out.println(b1);
		System.out.println(b1.capacity());
		b1.trimToSize();
		System.out.println(b1.capacity());
		b1.setLength(2);
		System.out.println(b1);
	}

}
