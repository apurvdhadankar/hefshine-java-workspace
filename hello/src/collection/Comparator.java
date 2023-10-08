package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(1, "Saurya", 39));
		s.add(new Student(2, "Ak", 39));
		s.add(new Student(3, "Chucha", 80));
		s.add(new Student(4, "Sunio", 81));
		Collections.sort(s, new MyComp());
		System.out.println(s);
	}

}
