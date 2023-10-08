package comparable;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> e= new ArrayList<Employee>();
		e.add(new Employee("abc", "19", 10));
		e.add(new Employee("kajya", "18", 20));
		e.add(new Employee("kajya", "17",20));
		e.add(new Employee("chingli", "22", 40));
		
		Collections.sort(e);
		System.out.println(e);
 		

	}

}
