package collection;



public class Student
{
	int rn;
	String name;
	int marks;
	public Student(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
	
}
