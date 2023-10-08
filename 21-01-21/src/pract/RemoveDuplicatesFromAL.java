package pract;

import java.util.ArrayList;

public class RemoveDuplicatesFromAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) 
		{
			if(!b.contains(a.get(i)))
			{
				b.add(a.get(i));
			}
		}
		System.out.println(b);
//		for (int i = 0; i < a.size(); i++) 
//		{
//			int count=0;
//			for (int j = i+1; j < a.size(); j++) 
//			{
//				if(a.get(i)==a.get(j))
//				{
//					count++;
//				}
//			}
//			if(count!=0)
//			{
//				a.remove(i);
//			}
//		}
//		System.out.println(a);
	}

}
