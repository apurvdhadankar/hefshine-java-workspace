package gsLab;

import linkedquestions.FindMidinkedList;

public class FIndMiddleOfLinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
		void printMiddle()
		{
			Node slowptr = head;
			Node fastptr = head;
			if(head != null)
			{
				while(fastptr != null && fastptr.next != null)
				{
					fastptr = fastptr.next.next;
					slowptr = slowptr.next;
				}
				System.out.println("Moddle element is "+ slowptr.data);
			}
			
		}
		
		public void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		
		public void printList()
		{
			Node tnode = head;
			while(tnode != null)
			{
				System.out.println(tnode.data+"->");
				tnode = tnode.next;
			}
			System.out.println("NULL");
		}

	public static void main(String[] args) {
		FIndMiddleOfLinkedList ll = new FIndMiddleOfLinkedList();
//		for(int i=5; i>=0; i--)
//		{
//			ll.push(i);
//			
//		}
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.printList();
		ll.printMiddle();

	}

}
