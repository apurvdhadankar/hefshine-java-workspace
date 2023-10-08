package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class H7 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "balck");
		h.put(4, "kajyaa");
		
		Collection s = h.values();
		System.out.println(s);

	}

}
