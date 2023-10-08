package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(1, "manus", 40));
		s.add(new Student(2, "katalya", 50));
		s.add(new Student(3, "Saurya", 90));
		s.add(new Student(4, "Katali", 30));
		s.add(new Student(5, "Gian", 10));
		
		Collections.sort(s);
		System.out.println(s);
	}

}
