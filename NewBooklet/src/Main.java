import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		for (int i = 0; i < ll.size()/2; i++) 
		{
			Integer temp = ll.get(i);
			ll.set(i, ll.get(ll.size()-1-i));
			ll.set(ll.size()-1-i, temp);
		}
		
		System.out.println(ll);
	}


}
