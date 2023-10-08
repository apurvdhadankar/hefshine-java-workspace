package map;

import java.util.HashMap;

public class H2 {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("abc", 10);
		a.put("Gian", 90);
		a.put("Aqua", 20);
		a.put("Ambulance", 20);
		a.put("poons", 60);
		if(a.containsKey("Gian"))
		{
			Integer b = a.get("Gian"); 
			System.out.println("value for key"+ " \"Gian\" is:- " + b);
		}
	}

}
