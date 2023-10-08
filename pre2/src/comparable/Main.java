package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("John", 12, 60));
		st.add(new Student("Simran", 13, 70));
		st.add(new Student("Kane", 11, 33));
		st.add(new Student("kkk", 19, 85));
		Collections.sort(st);
		System.out.println(st);
		
		

	}

}
