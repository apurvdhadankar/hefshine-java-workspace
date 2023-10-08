package linkedlist1;

public class MyLinkedList {
	Node head;
	void add(int data)
	{
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			Node p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = new Node(data);
		}
	}
	
	void print()
	{
		Node p = head;
		while(p!= null)
		{
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	int find(int i)
	{
		Node p = head;
		int index=-1;
		int n= 0;
		while(p != null)
		{
			if(p.data == i)
			{
				index = n;
				break;
			}
			p=p.next;
			n++;
		}
		return index;
		
	}

}
