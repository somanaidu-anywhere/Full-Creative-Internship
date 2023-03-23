package Month1_week3.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestClientLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.addAll(Arrays.asList(1l,45,6,67,11,40.8,"somanaidu",8.0));
		list.addFirst("first");
		list.add('l');
		list.add(4, 9);
		list.forEach((e)-> System.out.print(e+" "));
		System.out.println();
		System.out.println(list.size());
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		list.addLast(11);
		list.addFirst(11);
		System.out.println("list  "+list);
		list.removeLastOccurrence(11);
		System.out.println("list  "+list);
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.print(lit.next()+" ");
		}
		System.out.println();
		System.out.println(list);
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
	}
}
