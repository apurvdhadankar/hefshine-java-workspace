package hashMap;

import java.util.HashMap;

public class H3 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Red");
		h.put(2, "yellow");
		h.put(3, "black");
		System.out.println(h.containsValue("black"));
	}

}
