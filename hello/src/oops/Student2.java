package oops;

public class Student2 extends Student
{
	
	public Student2() {
		super();
		System.out.println("from student2");
	}
	
	public Student2(int a, int b)
	{
		super(7);
		System.out.println("the value of b : "+a);
	}
}
