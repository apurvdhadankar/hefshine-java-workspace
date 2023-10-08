package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class GetMarks {

	public static void main(String[] args) {
		ArrayList<MarksTable> m = new ArrayList<>();
		m.add(new MarksTable("AD", 30, 40, 50, 60));
		m.add(new MarksTable("AJ", 10, 20, 30, 40));
		m.add(new MarksTable("MK", 20, 30, 90, 40));
		m.add(new MarksTable("MC", 50, 20, 30, 10));
		Collections.sort(m, new MyComp());
		
		System.out.println(m);
		int cTotal=0, pTotal=0, jTotal=0, aTotal=0;
//		System.out.println("Lowoest Marks Subject : "+m.get(0));
		int min = Integer.MAX_VALUE;

		for(MarksTable s : m )
		{
			 cTotal = cTotal+ s.c;
			 pTotal = pTotal + s.python;
			 jTotal = jTotal + s.java;
			 aTotal = aTotal + s.angular;

		}
		

		System.out.println(cTotal);
		
		System.out.println(low(m));
		
		
	}

	private static Object low(ArrayList<MarksTable> m) {
		for(MarksTable m1 : m)
		{
			if(m1.angular<m1.c && m1.angular<m1.java && m1.angular < m1.python)
				return m1;
			else if(m1.c<m1.angular && m1.c<m1.c && m1.c < m1.python)
				return m1;
			else if(m1.java<m1.c && m1.java<m1.angular && m1.java < m1.python)
				return m1;
			else
				return m1;
			
		}
		return 0;
		
	}

}
