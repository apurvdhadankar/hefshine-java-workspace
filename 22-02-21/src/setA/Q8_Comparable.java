package setA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q8_Comparable {

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student("apurv", 1, 0));
		s.add(new Student("gian", 2, 0));
		s.add(new Student("Sunio", 3, 0));
		s.add(new Student("Aqua", 4, 10));
		
		
		Collections.sort(s);
		System.out.println(s);
		

	}

}
