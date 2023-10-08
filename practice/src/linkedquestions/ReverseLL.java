package linkedquestions;


public class ReverseLL{
	static Node head;
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
			while(tnode != null)
			{
				System.out.print(tnode.data+"->");
				tnode = tnode.next;
			}
			System.out.print("NULL->");
		}
		
		Node reversell(Node node)
		{
			Node prev = null;
			Node current = node;
			Node next = null;
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			return node;
		}

	public static void main(String[] args) {
		ReverseLL ll = new ReverseLL();
		for(Integer i=10; i>= 1; i--)
		{
			ll.add(i);
		}
		ll.print();
		System.out.println();
		head = ll.reversell(head);
		ll.print();

	}


}
