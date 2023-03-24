package Month1_week3.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestClientArratList {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(4.6);
		arrayList.add(1, "Somanaidu");
		System.out.println(arrayList);
		arrayList.addAll(arrayList);
		System.out.println(arrayList);
		List list = new ArrayList(Arrays.asList(1,2,3,4,5));
		arrayList.addAll(0, list);
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(5));
		
		System.out.println("--------------------");
		System.out.println(arrayList);
		arrayList.remove(5);
		System.out.println(arrayList);
		arrayList.remove(4.6);
		arrayList.removeAll(Arrays.asList("Somanaidu"));
		System.out.println(arrayList);
		
		System.out.println(arrayList.containsAll(list));
		
		System.out.println(arrayList.contains(1));
		System.out.println(arrayList.indexOf(5));
		System.out.println(arrayList.lastIndexOf(1));
		System.out.println(arrayList.isEmpty());
		arrayList.retainAll(list);
		arrayList.trimToSize();
		Iterator itr = arrayList.iterator();
		System.out.println(arrayList);
		while(itr.hasNext()) {
			int i = (int) itr.next();
			if(i==5) {
				itr.remove();
			}
		}
		System.out.println(arrayList);
		ListIterator lit = arrayList.listIterator();
		while(lit.hasNext()) {
			int i = (int) lit.next();
			if(i==3)
				lit.remove();
		}
		System.out.println(arrayList);
		while(lit.hasPrevious()) {
			int i=(int) lit.previous();
			if(i==2)
				lit.add(3);
			if(i==4)
				lit.set(0);
		}
		System.out.println(arrayList);
		
	}

}
