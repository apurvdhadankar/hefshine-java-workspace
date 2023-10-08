package mains;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateArrylistQ7 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(10);
		
		for (int i = 0; i < a.size(); i++) 
		{
			for (int j = i+1; j < a.size(); j++) 
			{
				if(a.get(i)==a.get(j))
				{
					a.remove(i);
				}
			}
		}
		System.out.println(a);

	}

}
