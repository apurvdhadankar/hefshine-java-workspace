package hashMap;

import java.util.HashMap;
import java.util.Set;

public class H4 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "balck");
		
		Set s1 = h.entrySet();
		System.out.println("Set values "+s1);
		
	}

}
