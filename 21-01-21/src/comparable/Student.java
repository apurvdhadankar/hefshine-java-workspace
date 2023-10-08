package comparable;



public class Student implements Comparable<Student>
{

	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Student o) {
		if(o.marks==marks)
			return 0;
		else if(o.marks<marks)
			return 1;
		else
			return -1;
	}
	
	
}
