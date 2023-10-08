package hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class H14 {

	public static void main(String[] args) {
		 TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C4", "White"); 
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C2", "Green");
		  System.out.println(tree_map1);
	}

}
class SortKeys implements Comparator<String>
{

	public int compare(String o1, String o2) {
		
		return o1.compareToIgnoreCase(o2);
	}
	
}
