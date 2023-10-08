package comparable;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	int marks;
	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	public int compareTo(Student o) 
	{
		if(o.marks==marks)
		{
			return 1;
		}
		else if(o.marks<marks)
		{
			return -1;
		}
		else
		return 0;
	}
	
	
}
