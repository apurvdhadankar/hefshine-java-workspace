package hashMap;

import java.util.HashMap;

public class H2 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "balck");
		if(h.containsKey(2))
		{
			System.out.println(h.get(2));
		}

	}

}
