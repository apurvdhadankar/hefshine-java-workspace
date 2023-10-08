package gsLab;

public class Student {
	int rno;
	String name;
	public Student(int rno, String name) 
	{
		super();
		this.rno = rno;
		this.name = name;
		
	}

	@Override
	public String toString()
	{
		return "\n Student [rno=" + rno + ", name=" + name + "]";
	}

}
