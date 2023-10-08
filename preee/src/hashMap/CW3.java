package hashMap;

import java.util.HashMap;

public class CW3 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "balck");
		HashMap<Integer, String> h2 = new HashMap<Integer, String>();
		h2.putAll(h);
		System.out.println(h2);
		

	}

}
