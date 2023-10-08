package setA;

public class Student implements Comparable<Student>{
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
		return "\nStudent [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(this.marks == s.marks)
		{
			if(this.name.charAt(1) == s.name.charAt(1))
				return 0;
			else if(this.name.charAt(1) > s.name.charAt(1))
				return 1;
			else
				return -1;
			
		}
		else if(this.marks > s.marks)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	

}
