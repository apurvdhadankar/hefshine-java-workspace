package set;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateTreeSet {

	public static void main(String[] args) {
		
	TreeSet<String> s =new TreeSet<String>();
	s.add("red");
	s.add("blue");
	s.add("yellow");
	s.add("black");
	Iterator<String> i = s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	TreeSet<String> s1 =new TreeSet<String>();
	s1.addAll(s);
	System.out.println(s1);
	

}
}
