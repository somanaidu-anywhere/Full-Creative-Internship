package Month1_week3.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClientHashMap {
public static void main(String[] args) {
	HashMap m = new HashMap();
	m.put("Chiru", 700);
	m.put("Bala", 800);
	m.put("Venki", 200);
	m.put("Nag", 500);
	System.out.println(m);
	System.out.println(m.put("Chiru", 1000));
	Set s = m.keySet();
	System.out.println(s);
	Collection c = m.values();
	System.out.println(c);
	Set s1 = m.entrySet();
	System.out.println(s1);
	Iterator itr = s1.iterator();
	while(itr.hasNext()) {
	Map.Entry m1 = (Map.Entry)itr.next();
	System.out.println(m1.getKey()+"....."+m1.getValue());
	if(m1.getKey().equals("Nag")) {
	m1.setValue(10000);
	}
	}
	System.out.println(m);
}
}
