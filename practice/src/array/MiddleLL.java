package array;


public class MiddleLL {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	void add(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	void print()
	{
		Node tnode = head;
		while(tnode!=null)
		{
			System.out.print(tnode.data+"->");
			tnode = tnode.next;
		}
		System.out.println("NLL->");
	}
	
	void findMiddle()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(fast_ptr.next!=null && fast_ptr!=null)
		{
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println("mildde of linked list is "+slow_ptr.data);
	}
	

	public static void main(String[] args) {
		MiddleLL ll = new MiddleLL();
		for (int i = 11; i >= 1; i--) 
		{
			ll.add(i);
		}
		
		ll.print();
		ll.findMiddle();

	}

}
