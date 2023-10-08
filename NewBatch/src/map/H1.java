package map;

import java.util.HashMap;

public class H1 {
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("abc", 10);
		a.put("Gian", 90);
		a.put("Aqua", 20);
		a.put("Ambulance", 20);
		a.put("poons", 60);
		
		System.out.println(a);
		System.out.println(a.isEmpty());
	}

}
