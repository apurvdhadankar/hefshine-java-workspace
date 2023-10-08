package newlinkedlist;

public class MyLinkedList<E> {
	Node head;
	void add(Object data)
	{
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			Node p = head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next = new Node(data);
		}
	}
	
	void print()
	{
		Node p = head;
		while(p !=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	
	int find(Object i)
	{
		Node p = head;
		int index=0;
		int n= 0;
		while(p.next != null)
		{
			if(p.data == i)
			{
				index=n;
				break;
			}
			p=p.next;
			n++;
		}
		return index;
	}
	

}
