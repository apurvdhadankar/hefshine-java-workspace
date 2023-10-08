package comparator;

import java.util.*;

import comparable.Student;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("John", 12, 60));
		st.add(new Student("jojo", 13, 60));
		st.add(new Student("Kane", 11, 60));
		st.add(new Student("kkk", 19, 60));
		Collection.sort(st, new Mycomp());
		System.out.println(st);
		
	}

}
