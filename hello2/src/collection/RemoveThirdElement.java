package collection;

import java.util.ArrayList;

public class RemoveThirdElement {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(9);
		a.add(8);
		for (int i = 0; i < a.size(); i++) 
		{
			if(i==2)
			{
				a.remove(i);
			}
		}
		
//		a.remove(2);
		System.out.println(a);
		System.out.println(a.get(1));
		

	}

}
