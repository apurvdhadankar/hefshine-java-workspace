package test;

public class MiddleOfLinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		
		public Node(int data) 
		{
			this.data = data;
			next = null;
		}
	}
	
	public void findMiddle()
	{
		Node slowptr = head;
		Node fastptr = head;
		while(fastptr != null && fastptr.next != null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
		}
		System.out.println("Middle of linkedList is "+slowptr.data);
		
	}
//	public Node reverse(Node head)
//	{
//		Node  newHead = reverse(head.next);
//		head.next.next = head;
//		head.next = null;
//		
//		return newHead;
//	}
	
	public void print()
	{
		Node tnode = head;
		while(tnode != null)
		{
			System.out.println(tnode.data);
			tnode = tnode.next;
		}
		System.out.println("NULL->");
	}
	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String[] args) {
		MiddleOfLinkedList ll = new MiddleOfLinkedList();
		for(int i=5; i>=1; i--)
		{
			ll.push(i);
		}
		
		ll.print();
		ll.findMiddle();
		
//		System.out.println(ll.reverse(ll.head));

	}

}
