package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CompMain {

	public static void main(String[] args) {
		ArrayList<Emp> e =  new ArrayList<Emp>();
		e.add(new Emp(1, "aaa","15", 80000));
		e.add(new Emp(2, "ddd", "15", 80000));
		e.add(new Emp(3, "acc","18", 50000));
		e.add(new Emp(4, "abb","17", 30000));
		Collections.sort(e, new MyComp());
		System.out.println(e);
	}

}
