package array;

public class ReverseLL {
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
	
	void add(int data){
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
		System.out.println("NULL->");
	}
	
	 /* Function to reverse the linked list */
	Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
//	void printList(Node node)
//    {
//        while (node != null) {
//            System.out.print(node.data +"->");
//            node = node.next;
//        }
//    }

	public static void main(String[] args) {
		ReverseLL ll = new ReverseLL();
		for (int i = 11; i >= 1; i--) 
		{
			ll.add(i);
		}
		ll.print();
		head = ll.reverse(head);
		ll.print();
	}

}
