package linkedList;

public class MyLinkedList {

	Student s;
	public void add(Student student) {
		if(s==null)
		{
			s=student;
		}
		else
		{
			Student p = s;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=student;
		}
		
	}
	public void print() {
		Student p=s;
		while(p!=null)
		{
			System.out.println(p.rn+" "+p.name);
			p=p.next;
		}
		
	}

	

}
