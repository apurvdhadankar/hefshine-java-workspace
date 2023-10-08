package hashMap;

import java.util.TreeMap;

public class H12 {

	public static void main(String[] args) {
		 TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White"); 
		  System.out.println(tree_map1.containsValue("Black"));


	}

}
