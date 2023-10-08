package gh;

public class MyLinkList {
	
	Student s;
	
	void delete(int index)
	{

		int count=0;
		Student p =s;
		while(p!=null)
		{
			if(count+1==index)
			{
				p.next=p.next.next;
				break;
			}
			p=p.next;
			count++;
		}
	}
	
	void addAtIndex(int index, Student student)
	{	
		if(index==0)
		{
			student.next=s;
			s=student;
		}
		else
		{
			int count=0;
			Student p =s;            
			while(p!=null)
			{
				if(count+1==index)
				{
					Student q = p.next;
					p.next=student;
					student.next=q;
					break;
				}
				p=p.next;
				count++;
			}
		}
	
	}
	
	String getName(int index)
	{
		int count=0;
		Student p=s;
		while(p!=null)
		{
			if(count==index)
			{
				return p.name;
			}
			count++;
			p=p.next;
		}
		return null;
	}

	public void add(Student student) 
	{	
		if(s==null)
		{
			s = student;
		}
		else
		{
			Student p =s;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=student;
			
		}
		
	}

	public void print() 
	{
		Student p=s;
		while(p!=null)
		{
			System.out.println(p.rn+" "+p.name);
			p=p.next;
		}
		
	}
	
	

}
