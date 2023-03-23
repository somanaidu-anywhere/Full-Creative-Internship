package Month1_week3.practice;

public class SingleLList {
	Node root;
	public SingleLList() {
		super();
	}
	public void addNode(int data)
	{
		Node ptr = root;
		while(ptr.next!=null)
		{
			ptr = ptr.next;
		}
		Node n = new Node(data);
		ptr.next = n;
		
	}
	public void removeNodeOfData(int data) {
		Node c = root;
		Node c1 = root.next;
		if(c.data==data)
		{
			this.root = root.next;
		}
		else {
			while(c1!=null) {
				if(c1.data==data)
				{
					c.next = c1.next;
					break;
				}
				c1 = c1.next;
				c= c.next;
			}
		}
	}
	
	public void setNodeOfData(int data, int newData) {
		Node c = root;
		while(c!=null && c.data!=data)
		{
			c = c.next;
		}
		if(c==null) {
			System.out.println("No such element");
		}
		else {
			c.data = newData;
		}
	}
	
	
	public void display()
	{
		Node c = root;
		while(c!=null) {
			System.out.print(c.data+" ");
			c = c.next;
		}
		System.out.println();
	}
	public void createNode(int data)
	{
		this.root = new Node(data);
	}
}
