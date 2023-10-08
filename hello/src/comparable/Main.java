package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Emp>  emp = new ArrayList<Emp>();
		emp.add(new Emp(1, "saurya", 1000));
		emp.add(new Emp(2, "Mansi", 150000));
		emp.add(new Emp(3, "Omkya", 150));
		
		Collections.sort(emp);
		System.out.println(emp);
		

	}

}
