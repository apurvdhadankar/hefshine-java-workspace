import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Q3Emp {
	public static void main(String[] args) {
		ArrayList<Emp> e = new ArrayList<Emp>();
		e.add(new Emp(1, "abc", "19", 20000));
		e.add(new Emp(2, "pqr", "19", 20000));
		e.add(new Emp(3, "xyzqr", "19", 20000));
		e.add(new Emp(4, "zzz", "18", 20000));
		
		for (int i = 0; i < e.size(); i++) 
		{
			for (int j = i+1; j < e.size(); j++) 
			{
				System.out.println(e.get(i).name.compareToIgnoreCase(e.get(j).name));
			}
		}
		
		
		
		
				
	}

}
