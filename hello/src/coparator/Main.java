package coparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(1, "Bohn", 14000));
		emp.add(new Emp(2, "John Cena", 14000));
		emp.add(new Emp(3, "Aohni", 14000));
		Collections.sort(emp, new Mycomp());
		System.out.println(emp);
	}

}
