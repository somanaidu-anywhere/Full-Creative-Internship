package Month1_week3.list;

import java.util.Arrays;
import java.util.Vector;

public class TestClientVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.addAll(0, Arrays.asList(24,5656,55,7787,8898));
		v.addElement(40);
		v.insertElementAt( 66666666,6);
		System.out.println(v.elementAt(4));
		v.removeElement(10);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.set(0, Arrays.asList(23,4,5,67,8));
		System.out.println(v);
		v.removeElementAt(1);
		System.out.println(v);
	}

}
