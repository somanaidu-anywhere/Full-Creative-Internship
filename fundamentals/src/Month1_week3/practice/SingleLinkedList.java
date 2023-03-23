package Month1_week3.practice;

public class SingleLinkedList {
public static void main(String[] args) {
	SingleLList single = new SingleLList();
	single.createNode(100);
	single.addNode(10);
	single.addNode(70);
	single.addNode(0);
	single.addNode(40);
	single.display();
	
	single.removeNodeOfData(10);
	single.display();
	
	single.removeNodeOfData(40);
	single.display();
	
	single.removeNodeOfData(70);
	single.display();
	
	single.setNodeOfData(10,20);
	single.display();
	
	single.setNodeOfData(0, 100);
	single.display();
}
}
