package test1;

import java.util.Comparator;

public class Student implements Comparator<Student>{

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
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}
	
	
	
}
