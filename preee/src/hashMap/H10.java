package hashMap;

import java.util.TreeMap;

public class H10 {

	public static void main(String[] args) {
		 TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White"); 
		  
		  TreeMap<String,String> tree_map2=new TreeMap<String,String>(); 
		  tree_map2.putAll(tree_map1);
		  System.out.println(tree_map2);
	}

}
