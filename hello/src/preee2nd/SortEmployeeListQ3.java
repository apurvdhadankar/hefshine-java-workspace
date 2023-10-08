package preee2nd;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeListQ3 {

	public static void main(String[] args) {
		ArrayList<Emp> e = new ArrayList<Emp>();
		e.add(new Emp(1, "gian", 50000));
		e.add(new Emp(2, "sunio", 50000));
		e.add(new Emp(3, "ambulance", 1000));
		e.add(new Emp(4, "aqua", 40000));
		e.add(new Emp(5, "chingli", 70000));
		
		Collections.sort(e, new MyComp());
		System.out.println(e);
		
		
	}

}
