package collection;

import java.util.ArrayList;

public class SortALOwn {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(30);
		a.add(3);
		a.add(15);
		a.add(1);
		a.add(2);
		a.add(8);
		a.add(15);
		a.add(21);
		for (int i = 0; i < a.size(); i++) 
		{
			for (int j = i+1; j < a.size(); j++) 
			{
				if(a.get(i) > a.get(j))
				{
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}

	}

}
