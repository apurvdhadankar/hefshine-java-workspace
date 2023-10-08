package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CW1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "balck");
		for(Map.Entry x: h.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println("----->Using Iterator");
		Set s1 = h.entrySet();
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			Map.Entry e = ((Map.Entry)it.next());
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
