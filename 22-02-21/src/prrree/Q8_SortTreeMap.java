package prrree;

import java.util.Comparator;
import java.util.TreeMap;

public class Q8_SortTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> t = new TreeMap<String, String>(new MyComp());
		t.put("aa", "red");
		t.put("zd", "yellow");
		t.put("kb", "Red");
		t.put("dc", "black");
		System.out.println(t);
	}

}

class MyComp implements Comparator<String>
{

	@Override
	public int compare(String x, String y) 
	{
		if(x.charAt(1)==y.charAt(1))
		{
			return 0;
		}
		else if(x.charAt(1)>y.charAt(1))
			return 1;
		else
			return -1;
	}
	
}
